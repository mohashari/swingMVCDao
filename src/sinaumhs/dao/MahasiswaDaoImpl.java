package sinaumhs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sinau.mhs.model.MahasiswaModel;

public class MahasiswaDaoImpl implements MahasiswaDao {

	private Connection connection;
	private PreparedStatement insertStatement;
	private PreparedStatement updateStatement;
	private PreparedStatement deleteStatement;
	private PreparedStatement getByidStatement;
	private PreparedStatement getAllStatement;
	
	private final String INSERT_QUERY ="insert into mahasiswa (nik,nama,kelas,jurusan)valuer(?,?,?,?)";
	private final String UPDATE_QUERY="update mahasiswa set nama=?,"
			+ "kelas=?,jurusan=? where nik=?";
	private final String DELETE_QUERY ="delete from mahasiswa where nik=?";
	private final String GET_BY_ID_QUERY="select nik,nama,kelas,jurusan from mahasiswa where nim?";
	private final String GET_ALL_QUERY="select nik,nama,kelas,jurusan from mahasiswa";
	
	public void setConnection(Connection connection) throws SQLException{
		this.connection = connection;
		insertStatement=this.connection.prepareStatement(INSERT_QUERY);
		updateStatement=this.connection.prepareStatement(UPDATE_QUERY);
		deleteStatement=this.connection.prepareStatement(DELETE_QUERY);
		getByidStatement=this.connection.prepareStatement(GET_BY_ID_QUERY);
		getAllStatement=this.connection.prepareStatement(GET_ALL_QUERY);
		
	}
	
	@Override
	public MahasiswaModel saveOrUpdate(MahasiswaModel mahasiswa, boolean isUpdate) throws SQLException {
		// TODO Auto-generated method stub
		if(!isUpdate){
			insertStatement.setString(1, mahasiswa.getNik());
			insertStatement.setString(2, mahasiswa.getNama());
			insertStatement.setString(3, mahasiswa.getKelas());
			insertStatement.setString(4, mahasiswa.getJurusan());
			insertStatement.executeUpdate();
		}else{
			insertStatement.setString(1, mahasiswa.getNama());
			insertStatement.setString(2, mahasiswa.getKelas());
			insertStatement.setString(3, mahasiswa.getJurusan());
			insertStatement.setString(4, mahasiswa.getNik());
			insertStatement.executeUpdate();
		}
		
		return mahasiswa;
	}

	@Override
	public MahasiswaModel delete(String nik) throws SQLException {
		// TODO Auto-generated method stub
		deleteStatement.setString(1, nik);
		deleteStatement.executeUpdate();
		return null;
	}

	@Override
	public MahasiswaModel getById(String nik) throws SQLException {
		// TODO Auto-generated method stub
		getByidStatement.setString(1, nik);
		ResultSet rs = getByidStatement.executeQuery();
		if(rs.next()){
			MahasiswaModel mhs = new MahasiswaModel();
			mhs.setNik(rs.getString("nik"));
			mhs.setNama(rs.getString("nama"));
			mhs.setKelas(rs.getString("kelas"));
			mhs.setJurusan(rs.getString("jurusan"));
			return mhs;
		}
		
		return null;
	}

	@Override
	public List<MahasiswaModel> getAll() throws SQLException {
		// TODO Auto-generated method stub
		List<MahasiswaModel> mhs = new ArrayList<MahasiswaModel>();
		ResultSet resultSet = getAllStatement.executeQuery();
		while(resultSet.next()){
			MahasiswaModel m = new MahasiswaModel();
			m.setNik(resultSet.getString("nik"));
			m.setNama(resultSet.getString("nama"));
			m.setKelas(resultSet.getString("kelas"));
			m.setJurusan(resultSet.getString("jurusan"));
			mhs.add(m);
		}
		
		return mhs;
	}

}
