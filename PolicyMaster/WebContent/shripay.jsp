<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Shri_Res shrires1=(Shri_Res) session.getAttribute("shrires1");%>
<form action="http://119.226.131.2/PC10Web/PC10Web.AgentPortal/frmWSPayment.aspx" method="post" name="frmTransaction" id="frmTransaction">                              
<input name="PolicySysID" type="hidden" value="<%= shrires1.getPOL_SYS_ID()%>" /><br>
Total Premium: <%=shrires1.getTotalPremium() %>
<!-- <input name="ReturnURL" type="hidden" value="http://203.122.13.228:8080/PolicyMaster/ShPaDe" /><br> -->
<input name="ReturnURL" type="hidden" value="http://localhost:8080/PolicyMaster/ShPaDe" /><br>
<input type="submit" value="submit">
</form>
</body>
</html>