package  name;

import java.util.Date;

public class Name {

    private int nameid;
    private String firstname;
    private String lastname;
    private String aadhar;

	public int getnameid() {
	        return nameid;
	    }

	public void setnameid(int nameid) {

	        this.nameid = nameid;
    	}
  


	public String getfirstname() {
	     return firstname;
	}

	public void setfirstname(String firstname) {
	        this.firstname = firstname;
    	}

	public String getlastname() {
	     return lastname;
	}

	public void setlastname(String lastname) {
	        this.lastname = lastname;
    	}
	public String getaadhar() {
	     return aadhar;
	}

	public void setaadhar(String aadhar) {
	        this.aadhar = aadhar;
    	}

	
@Override
    public String toString() {
        return "name [nameid=" + nameid  +", firstname=" + firstname + ",  lastname=" + lastname +  ", aadhar=" + aadhar + "]";
    }

}