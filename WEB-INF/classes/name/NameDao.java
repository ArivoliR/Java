package name;
import java.sql.*;
import java.util.*;
import static name.Provider.*;
import static name.Name.*;


public class NameDao {
	private Connection con = null;
	int rv=0,rv1=0;

	public NameDao()
        {
	con=NameDButil.getcon();
	}

public int addName(Name name) {
        try {

			
			PreparedStatement ps = con.prepareStatement("insert into names (nameid,firstname,lastname,aadhar) values (?,?,?,?)");

			ps.setInt(1,name.getnameid());
			
			ps.setString(2,name.getfirstname());
			ps.setString(3,name.getlastname());
			ps.setString(4,name.getaadhar());
            rv=ps.executeUpdate();
			System.out.println("rv="+rv);
		    
        } catch (SQLException e) {
			System.out.println("Exception in addName...");
            e.printStackTrace();System.out.println("Exception in addName.......!!");
				               e.printStackTrace(System.err);
				                System.out.println("SQLState: " +
				                       ((SQLException)e).getSQLState());
				                System.out.println("Error Code: " +
				                       ((SQLException)e).getErrorCode());
				                System.out.println("Message: " + e.getMessage());
				                Throwable t = e.getCause();
				   			                 while(t != null) {
				   			                     System.out.println("Cause: " + t);
			                     t = t.getCause();
			}
		}
		return rv;
    }

 
public List<Name> getnamesbyNameid() {
        List<Name> names = new ArrayList<Name>();
        try {
            PreparedStatement preparedStatement = con.
                    prepareStatement("select * from names ");

            //preparedStatement.setInt(1,empID);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
				Name name = new Name();
				name.setnameid(rs.getInt("Nameid"));
				
				name.setfirstname(rs.getString("firstname"));
				name.setlastname(rs.getString("lastname"));
				name.setaadhar(rs.getString("aadhar"));

				names.add(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return names;
    }


 }


