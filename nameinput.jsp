<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.lang.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<%@page import="name.getNameid"%>
<jsp:useBean id="obj" class="name.Name"/>
<jsp:setProperty property="*" name="obj"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter Name Details</title>
    

<script type='text/javascript' src='http://code.jquery.com/jquery.min.js'></script>
<script src="datetimepicker_css.js"></script>

<script for="document" event=onkeydown>

// Check if this is a Backspace
 if (window.event.keyCode == 8)
 {
    // Cancel backspace if not in a text element
    if(document.activeElement.type != "text")
    {
        window.event.returnValue=false;
    }
 }
 </script>

<script type="text/javascript">
function openMenu() 
{
  window.location.href = "index.html";
}
</script>

<script language="JavaScript" type="text/javascript">
 
 function checkform ( form )
 { 
 
   if (form.firstname.value == "") {
     alert( "Please enter FirstName" );
     form.firstname.focus();
     return false ;
   }
   if (form.lastname.value == "") {
      alert( "Please enter LastName" );
      form.lastname.focus();
      return false ;
   }
   if (form.aadhar.value == "") {
      alert( "Please enter aadhar" );
      form.aadhar.focus();
      return false ;
   }

   
   return true ;
 }
 </script>



</head>
<body>
</head>
      <body>
      <h3>Add Name Details</h3>
       <hr>
	<form method="POST" action="NameController" name="NameController" onsubmit="return checkform(this);">

                       
            Nameid &nbsp	: <input name="nameid" type="text" size="6"  value="<%=(getNameid.getnameid(obj)+1)%>" readonly/> <br><br><br>
            First Name &nbsp   	: <input  name="firstname" type="text" size="25"  /> 	 &nbsp&nbsp&nbsp 
	    Last Name &nbsp   	: <input name="lastname" type="text" size="25"  /> <br><br>	  
	    Aadhar &nbsp  :<input name="aadhar" type="text" size="25"  /> <br><br>	  
	    <br><br>
	     <input id ="action" type="hidden" value="insert" name="action" >
	     <input value="Submit" type="submit" name="Submit"> 
	     <button type="button" name="Back to Menu" onclick="openMenu()">Back to Main Menu</button>
			<button><a style="text-decoration:none" href="NameController?action=list">List of Names</a></button>
	    </form>
	    
	    
</body></html>