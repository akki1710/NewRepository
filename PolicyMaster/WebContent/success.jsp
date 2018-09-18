<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Congratulations !!!!</h1>
Your Policy has been Successfully Generated.

<h1>Response : <%= (String) session.getAttribute("Message")%></h1>
<h1>PolicyNumber : <%= (String) session.getAttribute("PolicyNumber")%></h1>
<h1>PolicyID : <%= (Double) session.getAttribute("PolicyID")%></h1>

<!-- <form name='form' action='http://168.87.83.122:8180/Home/GetPolicySchedulePDF' method='post'>
<input type="submit" value="Click for Policy-PDF">
</form> -->
<a href="http://168.87.83.122:8180/Home/GetPolicySchedulePDF">Click for Policy-PDF</a>
</body>
</html>