<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css" href="css/table.css" />
<title>List of Names</title>
<script type="text/javascript">
function openMain() 
{
  window.location.href = "index.html";
}
</script>
</head>
<body>
    

<BODY>
<br>

    <table border="1" width="75%" >
        <!--<thead> -->
            <tr>
                <th>ID</th>
				<th>First Name</th>
                <th>Last Name</th>
                <th>Aadhar</th>
                
                
            </tr>
       <!-- </thead>  -->
        <tbody>
            <c:forEach items="${names}"  var="nm" varStatus="nmstat">
            
                <tr>
                    <td><c:out value="${names[nmstat.index].getnameid()}" /></td>
					<td><c:out value="${names[nmstat.index].getfirstname()}" /></td>
                    <td><c:out value="${names[nmstat.index].getlastname()}" /></td>
                    <td><c:out value="${names[nmstat.index].getaadhar()}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p>
    <input id ="action" type="hidden" value="list" name="action" >
     <button type="button" name="Back to Menu" onclick="openMain()">Back to Main Menu</button>

    </p>
   
</body>
		    
</html>
