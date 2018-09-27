<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="obj" class="Royal.DATA"/>
<jsp:useBean id="obj1" class="Royal.proposerDetails"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form id="PostForm" name="PostForm" autocomplete="off" action="https://www.royalsundaram.net/web/dtctest/paymentgateway" method="post">
	
<input type="hidden" name="reqType" id="reqType" value="JSON">
<input type="hidden" name="process"  value="paymentOption">


	<input type="hidden" name="apikey" id="apikey" value="310ZQmv/bYJMYrWQ1iYa7s43084=">
	<input type="hidden" name="agentId" id="agentId" value="AG033023">
	
	<% obj=(Royal.DATA)session.getAttribute("data2"); %> 
	<% obj1=(Royal.proposerDetails)session.getAttribute( "proposerDetails" ); %>
	<input type="hidden" name="premium" value="RS. <%=obj.getPREMIUM() %>">
	<label>RS. <%=obj.getPREMIUM() %></label></br>
	<input type="hidden" name="quoteId" id="quoteId" value=" <%=obj.getQUOTE_ID() %> ">
 <input type="hidden" name="version_no" id="version_no" value="">
<input type="hidden" name="strFirstName" id="strFirstName" value=" <%=obj1.getFirstName() %>">
<input type="hidden" name="strEmail" id="strEmail" value=" <%=obj1.getEmailId() %> ">
	
<input type="hidden" name="isQuickRenew" id="isQuickRenew" value="">
<input type="hidden" name="crossSellProduct" id="crossSellProduct" value="">
<input type="hidden" name="crossSellQuoteid" id="crossSellQuoteid" value="">
<input type="hidden" name="Pdfroyal" id="returnUrl" value='http://203.122.13.228/PolicyMaster/Pdfroyal'>

	<input type="hidden" value="privatePassengerCar" name="vehicleSubLine" id="vehicleSubLine">
	<input type="hidden" value="" name="elc_value" id="elc_value">
	<input type="hidden" value="" name="nonelc_value" id="nonelc_value">						

 <input type="hidden"   value="billDesk"  name="paymentType"/>
	
<input type="submit" class="btn-view-summary" value="Submit" title="Submit">
</form>
</body>
</html>