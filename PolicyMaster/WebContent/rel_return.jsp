<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<form action="Rel_Pol_Status" method="post">
PolicyNumber: <%= (String) session.getAttribute("policy_num")%><br>
PropasalNumber: <%= (String) session.getAttribute("rel_proposal_num")%><br>
</form>
<form action="Rel_Pol_Status1" method="post">
<input type="submit" value="Click here for Policy URL"> 
</form>
</body>
</html>