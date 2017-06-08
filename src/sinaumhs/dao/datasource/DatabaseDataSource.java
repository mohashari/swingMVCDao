package sinaumhs.dao.datasource;

import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DatabaseDataSource {
	private MysqlDataSource mysqlDataSource;
	public DatabaseDataSource() {
		// TODO Auto-generated constructor stub
	mysqlDataSource = new MysqlDataSource();
	}

	public MysqlDataSource getMysqlDataSource(){
		mysqlDataSource.setUser("root");
		mysqlDataSource.setPassword("root");
		mysqlDataSource.setDatabaseName("belajar");
		mysqlDataSource.setServerName("localhost");
		mysqlDataSource.setPort(3306);
		
		return mysqlDataSource;
	}
	public void closeMysqlConnection(){
		try {
			mysqlDataSource.getConnection().close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
