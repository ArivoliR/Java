package name;
import java.sql.*;
import name.ConnectionProvider;


public class NameDButil {
	static Connection con = null;
	static Connection getcon()
        {
	con=ConnectionProvider.getCon();
	return con;
 }



}
