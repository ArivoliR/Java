package name;
import java.sql.*;
import static name.Provider.*;
import static name.Name.*;

public class getNameid {

	public static int getnameid(Name nm){
			int nameid=0;

		try{

			 Class.forName(DRIVER);
			Connection con =DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT MAX(Nameid) from names.names;");
			if (rs.next())
			{
				nameid = rs.getInt(1);
				nm.setnameid(nameid);
			}


		}catch(Exception e){System.out.println("Exception");}

		return nameid;
	}
}
