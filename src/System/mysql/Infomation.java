package System.mysql;

import java.sql.SQLException;

public interface Infomation {
	 void SaveToDB(String ID,String FullName,String Sex,String Village,String Address) throws SQLException;
}
