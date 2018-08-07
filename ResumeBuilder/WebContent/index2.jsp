<%@page import="com.cg.servelet.resume.Resume"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resume Builder</title>
</head>
<body>
	<%! Resume resume = new Resume(); %>
	<h1 align="center">Resume</h1></br></br>
	First Name : <% String fName = request.getParameter("resume.getFirstName"); %>
	<%= fName %> </br></br>
	Last Name : <% String lName = request.getParameter("LastName"); %>
	<%= lName %>
	
	

</body>
</html>