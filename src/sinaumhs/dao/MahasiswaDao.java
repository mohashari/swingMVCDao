package sinaumhs.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import sinau.mhs.model.MahasiswaModel;

public interface MahasiswaDao {

	public MahasiswaModel saveOrUpdate(MahasiswaModel mahasiswa , boolean isUpdate)throws SQLException;
	public MahasiswaModel delete(String nik)throws SQLException;
	public MahasiswaModel getById(String nik)throws SQLException;
	public List<MahasiswaModel> getAll()throws SQLException;
	public void setConnection(Connection connection) throws SQLException;
}
