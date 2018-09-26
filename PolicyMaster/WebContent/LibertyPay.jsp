<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment Gateway</title>
</head>
<body onload='document.forms[0].submit()'>
<form name='form' action='http://168.87.83.122:80/Home/CapturePayment' method='post'>
<input type='hidden' name='txnid' value='<%= (String) session.getAttribute("tnx")%>' /> 
<input type='hidden' name='amount' value='<%= (Double) session.getAttribute("TotalPremium")%>' /> 
<input type='hidden' name='productinfo' value='Payment for Liberty GI' /> 
<input type='hidden' name='SURL' value='http://203.122.13.228/PolicyMaster/LibIssuePolicyServlet' /> 
<input type='hidden' name='FURL' value='http://203.122.13.228/PolicyMaster/fail.jsp' />
<!-- <input type='hidden' name='SURL' value='http://192.168.10.61:8080/PolicyMaster/LibIssuePolicyServlet' /> 
<input type='hidden' name='FURL' value='http://192.168.10.61:8080/PolicyMaster/fail.jsp' /> -->
<!-- <input type='hidden' name='SURL' value='http://localhost:8082/PolicyMaster/LibIssuePolicyServlet' /> 
<input type='hidden' name='FURL' value='http://localhost:8082/PolicyMaster/fail.jsp' />  --> 
<input type='hidden' name='key' value='TPService' />
<input type='hidden' name='FirstName' value='<%= (String) session.getAttribute("Fullname")%>' /> 
<input type='hidden' name='Email' value='<%= (String) session.getAttribute("Email")%>'/>
<input type='hidden' name='Phone' value='<%= (String) session.getAttribute("MobileNo")%>' /> 
<input type='hidden' name='quotationNumber' value='<%= (String) session.getAttribute("QuotationNumber")%>' /> 
<input type='hidden' name='customerID' value='<%= (String) session.getAttribute("CustomerID")%>' /> 
</form> 
</body> 
</html>

<!-- <input type='hidden' name='SURL' value='http://192.168.10.61:8080/PolicyMaster/LibIssuePolicyServlet' /> 
<input type='hidden' name='FURL' value='http://192.168.10.61:8080/PolicyMaster/fail.jsp' /> -->

<!-- <input type='hidden' name='SURL' value='http://localhost:8082/PolicyMaster/LibIssuePolicyServlet' /> 
<input type='hidden' name='FURL' value='http://localhost:8082/PolicyMaster/fail.jsp' />  --> 