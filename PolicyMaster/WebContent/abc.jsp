<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.Connection"%>
    <%@ page import="study.db.*" %>
    <%@ page import="beans.main_data" %>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.sql.SQLException" %>
    <%@ page import="java.sql.PreparedStatement" %>
    <%@ page import="java.sql.ResultSet" %>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.HashMap" %>
    <%@ page import="java.util.Map" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello</h1>
<%Map<String,String> al1=(HashMap<String,String>) session.getAttribute("al");
String Model=al1.get("Model");
String FuelType=al1.get("FuelType");
%>
Model : <%=Model %>
FuelType: <%=FuelType %>
Manufacturer: <%=al1.get("Manufacturer") %>
</body>
</html>