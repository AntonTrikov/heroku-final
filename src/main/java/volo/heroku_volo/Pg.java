package volo.heroku_volo;


import java.sql.Connection;
import java.sql.DriverManager;


public class Pg {
	private static Connection pg = null;
	public static Connection pgConn(){
		if(pg!=null) {
			return pg;
		}
		try {
			Class.forName("org.postgresql.Driver");
		    String username = "postgres";
		    String password = "admin";
		    String dbUrl = "jdbc:postgresql://" + "localhost" + ":" + "5432" + "/db" ;

		    return DriverManager.getConnection(dbUrl, username, password);
		    
		} catch(Exception e) {
			e.printStackTrace();
		}
		return pg;
	}
}
