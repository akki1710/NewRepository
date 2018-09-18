<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="http://119.226.131.2/PC10Web/PC10Web.AgentPortal/frmWSPayment.aspx" method="post" name="frmTransaction" id="frmTransaction">                              
PolicySysID: <input name="PolicySysID" type="hidden" value="<%= (String) session.getAttribute("POL_SYS_ID")%>" /><br>
<input name="ReturnURL" type="hidden" value="http://203.122.13.228:8080/PolicyMaster/ShPaDe" /><br>
<!-- <input name="ReturnURL" type="hidden" value="http://localhost:8082/PolicyMaster/ShPaDe" /><br> -->
<input type="submit" value="submit">
</form>
</body>
</html>