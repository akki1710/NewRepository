<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment Gateway</title>
</head>
<%PostPremiumDetails finalresponse=(PostPremiumDetails) session.getAttribute("finalresponse"); %>
<body onload='document.forms[0].submit()'>
<form name='form' action='https://api.libertyinsurance.in/TPPayment/Home/CapturePayment' method='post'>
<!-- <form name='form' action='http://168.87.83.122:80/Home/CapturePayment' method='post'> -->
<input type='hidden' name='txnid' value='<%= finalresponse.getTxn()%>' /> 
<input type='hidden' name='amount' value='<%= finalresponse.getTotalPremium()%>' /> 
<input type='hidden' name='productinfo' value='Payment for Liberty GI' /> 
<!-- <input type='hidden' name='SURL' value='http://localhost:8080/PolicyMaster/LibIssuePolicyServlet' /> 
<input type='hidden' name='FURL' value='http://localhost:8080/PolicyMaster/fail.jsp' /> -->
<input type='hidden' name='SURL' value='http://192.168.10.61:8080/PolicyMaster/LibIssuePolicyServlet' /> 
<input type='hidden' name='FURL' value='http://192.168.10.61:8080/PolicyMaster/fail.jsp' />
<input type='hidden' name='key' value='TPService' />
<input type='hidden' name='FirstName' value='<%= finalresponse.getFullName()%>' /> 
<input type='hidden' name='Email' value='<%= finalresponse.getEmailID()%>'/>
<input type='hidden' name='Phone' value='<%= finalresponse.getMobileNumber()%>' /> 
<input type='hidden' name='quotationNumber' value='<%= finalresponse.getQuotationNumber()%>' /> 
<input type='hidden' name='customerID' value='<%= finalresponse.getCustomerID()%>' /> 
</form> 
</body> 
</html>

<!-- <input type='hidden' name='SURL' value='http://192.168.10.61:8080/PolicyMaster/LibIssuePolicyServlet' /> 
<input type='hidden' name='FURL' value='http://192.168.10.61:8080/PolicyMaster/fail.jsp' /> -->

<!-- <input type='hidden' name='SURL' value='http://203.122.13.228/PolicyMaster/LibIssuePolicyServlet' /> 
<input type='hidden' name='FURL' value='http://203.122.13.228/PolicyMaster/fail.jsp' />  --> 