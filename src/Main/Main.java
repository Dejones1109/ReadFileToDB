package Main;

import java.sql.Connection;

import com.sun.jdi.event.EventQueue;

import Database.ConnectDB;
import View.ReadFileView;
public class Main {

	public static void main(String[] args) {
		 Connection conn = null;
	
				try {	
					
					ReadFileView rf =  new ReadFileView();
					rf.setVisible(true);

					//Kết nối DataBase
					ConnectDB db = new ConnectDB();
					conn = db.ConnectDb();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	

}
