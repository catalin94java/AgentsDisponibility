package disponibilitateagenti;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class MySqlConnection {

	private static String envValue= System.getenv("envmysql");
	Connection conn = null	;
	
	
	public static Connection dbConnector() {
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logintelbridge","root",envValue); 

			return conn;
		}catch(Exception e){
			
			JOptionPane.showMessageDialog(null, e);
			return null;
			
		}
		
	}
	
	

}
