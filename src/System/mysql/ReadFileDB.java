package System.mysql;

import Database.ConnectDB;
import java.sql.*;

public class ReadFileDB implements Infomation {
  public void SaveToDB(String ID,String FullName,String Sex,String Village,String Address) throws SQLException {
	  ConnectDB db = new ConnectDB();
	  String sql = "INSERT INTO `information`(`ID`, `FullName`, `Sex`, `Village`, `Address`) VALUES (?,?,?,?,?)";
	  try {
		PreparedStatement preparedStatement = db.conn.prepareStatement(sql);
		preparedStatement.setString(1, ID);
		preparedStatement.setString(2, FullName);
		preparedStatement.setString(3, Sex);
		preparedStatement.setString(4, Village);
		preparedStatement.setString(5, Address);
		preparedStatement.executeUpdate();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	  System.out.println("done");
  }
}
