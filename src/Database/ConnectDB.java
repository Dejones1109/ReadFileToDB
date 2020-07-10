package Database;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class ConnectDB {
public Connection ConnectDb() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/readfile","root","");
		System.out.println("Connected!!!");
		return conn;
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, e);
		return null;
	}

}


}
