package sinaumhs.dao.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import sinau.mhs.model.MahasiswaModel;
import sinaumhs.dao.MahasiswaDao;
import sinaumhs.dao.MahasiswaDaoImpl;

public class MahasiswaService {

	private MahasiswaDao mahasiswaDao;
	private Connection connection;
	
	public void setDataSource(DataSource dataSource){
		try {
			connection=dataSource.getConnection();
			mahasiswaDao= new MahasiswaDaoImpl();
			mahasiswaDao.setConnection(connection);
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public MahasiswaModel saveOrUpdate(MahasiswaModel mahasiswaModel, boolean isUpdate){
		try {
			connection.setAutoCommit(false);
			mahasiswaDao.saveOrUpdate(mahasiswaModel, isUpdate);
			connection.commit();
			connection.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO: handle exception
			try {
				connection.rollback();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return mahasiswaModel;
	}

	public MahasiswaModel getPerson(String nik){
		MahasiswaModel mhs =null;
		try {
			mhs=mahasiswaDao.getById(nik);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	return mhs;
	}
	public List<MahasiswaModel> getPersons(){
		try {
			return mahasiswaDao.getAll();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	return new ArrayList<MahasiswaModel>();
	}
	
}
