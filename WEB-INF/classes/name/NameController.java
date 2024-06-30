package name;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.lang.*;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import name.NameDao;
import name.Name;

public class NameController extends HttpServlet {
    private static final long serialVersionUID = 1L;
   private static String INSERT = "/Msginsertfrm.jsp";
   private static String LIST = "/namelist.jsp";
   
    private NameDao dao;
    int nameid;
    String fwd="";

    public NameController() {
        super();
        dao = new NameDao();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Name name=new Name();
		List<Name> names = new ArrayList<Name>();
        String action = request.getParameter("action");
		
        if (action.equalsIgnoreCase("insert")){

			if (request.getParameter("nameid") != null) {
			name.setnameid(Integer.parseInt((request.getParameter("nameid"))));

			}
			
			name.setfirstname(request.getParameter("firstname"));
			name.setlastname(request.getParameter("lastname"));
      name.setaadhar(request.getParameter("aadhar"));
			


			 int rv=0;
			 rv=dao.addName(name);
			 if (rv ==1)
				fwd = INSERT;
			 

        } 
		 else if (action.equalsIgnoreCase("list")){
			fwd=LIST;
				request.setAttribute("names", dao.getnamesbyNameid());
			


        }
        

         System.out.println("fwd="+fwd);

        RequestDispatcher view = request.getRequestDispatcher(fwd);
        System.out.println("request="+request);
        view.forward(request,response);
        return;

    }



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    {        doGet(request,response);    }
         return;

    }
}
