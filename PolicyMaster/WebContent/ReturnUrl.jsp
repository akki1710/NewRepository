<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ShPaDe" method="get">
ApprovePolNo: <%= (String) session.getAttribute("ApprovePolNo")%><br>
ApprovePolSysId: <%= (String) session.getAttribute("ApprovePolSysId")%><br>
</form>
 <form action="ShPaDe1" method="post">
<input type="submit" value="Click here for Policy URL"> 
</form>
</body>
</html>