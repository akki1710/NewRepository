<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
</html> --%>

<!-- <input type='hidden' name='SURL' value='http://192.168.10.61:8080/PolicyMaster/LibIssuePolicyServlet' /> 
<input type='hidden' name='FURL' value='http://192.168.10.61:8080/PolicyMaster/fail.jsp' /> -->

<!-- <input type='hidden' name='SURL' value='http://203.122.13.228/PolicyMaster/LibIssuePolicyServlet' /> 
<input type='hidden' name='FURL' value='http://203.122.13.228/PolicyMaster/fail.jsp' />  --> 



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="com.*" %>
<!doctype html>

<html class="no-js" lang="">
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Form</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="apple-touch-icon" href="icon.png">
<!-- Place favicon.ico in the root directory -->
<script src="//code.jquery.com/jquery-3.2.1.min.js"
	crossorigin="anonymous"></script>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<link
	href="//stackpath.bootstrapcdn.com/bootswatch/4.1.3/united/bootstrap.min.css"
	rel="stylesheet" crossorigin="anonymous">
<!--<link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.min.css">-->
<link rel="stylesheet"
	href="//use.fontawesome.com/releases/v5.2.0/css/all.css"
	crossorigin="anonymous">
<!-- <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> -->
<!------ Include the above in your HEAD tag ---------->
<style>
/***********************************************/
/***************** Accordion ********************/
/***********************************************/
@import url('//fonts.googleapis.com/css?family=Tajawal');
/*@import url('//maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css');*/
@import
	url("//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css")
	;

fieldset.textborder {
	border: 1px groove #ddd !important;
	padding: 0 1.4em 1.4em 1.4em !important;
	margin: 0 0 1.5em 0 !important;
	-webkit-box-shadow: 0px 0px 0px 0px #000;
	box-shadow: 0px 0px 0px 0px #000;
}

legend.textborder {
	font-size: 1.2em !important;
	font-weight: bold !important;
	text-align: left !important;
	width: auto;
	padding: 0 10px;
	border-bottom: none;
}

.fleft {
	float: left;
}

.form-control {
	height: inherit;
	font-size: 14px
}

.input-group-prepend {
	background: #007b5e; /*#ef7642; /*text color Weight, Height*/
	line-height: 200%;
	padding: 0px;
	color: #fff;
	font-size: 13px;
}

.input-group-text {
	color: #fff;
	background-color: #ef7642; /*icon color */
	border: 1px solid #ef7642; /*icon color */
	border-radius: 0px;
	font-size: 15px;
}

.label_text {
	padding: 0px 4px;
	margin: auto;
	font-size: 11px;
	font-weight: bold;
}
/*********************************************************************************************************************************/
section {
	padding: 60px 0;
}

#accordion-style-1 h1, #accordion-style-1 a {
	color: #007b5e;
}

#accordion-style-1 .btn-link {
	font-weight: 400;
	color: #007b5e;
	background-color: transparent;
	text-decoration: none !important;
	font-size: 16px;
	font-weight: bold;
	padding-left: 25px;
}

#accordion-style-1 .card-body {
	border-top: 2px solid #007b5e;
}

#accordion-style-1 .card-header .btn.collapsed .fa.main {
	display: none;
}

#accordion-style-1 .card-header .btn .fa.main {
	background: #007b5e;
	padding: 13px 11px;
	color: #ffffff;
	width: 35px;
	height: 41px;
	position: absolute;
	left: -1px;
	top: 10px;
	border-top-right-radius: 7px;
	border-bottom-right-radius: 7px;
	display: block;
}

body {
	background-image: url('img/bk10.jpg');
	background-size: cover;
	background-attachment: fixed;
	min-height: 700px;
	font-family: 'Lato', sans-serif;
}
</style>
</head>
<%PostPremiumDetails finalresponse=(PostPremiumDetails) session.getAttribute("finalresponse"); %>
<body>
	<!-- Add your site or application content here -->

	<!-- Accordion -->
	<div class="container-fluid bg-gray" id="accordion-style-1">
		<div class="container">
			<section>
				<div class="row">
					<div class="col-12">
						<h1 class="text-green mb-4 text-center">Final Payment</h1>
					</div>
					<div class="col-md-12">
						<div class="accordion" id="accordionExample">
							<div class="card">
								<div class="card-header" id="headingOne">
									<h5 class="mb-0">
										<button class="btn btn-link btn-block text-left" type="button"
											data-toggle="collapse" data-target="#collapseOne"
											aria-expanded="true" aria-controls="collapseOne">
											<i class="fa fa-shopping-cart  main"></i><i
												class="fa fa- mr-3"></i>Checkout :
										</button>
									</h5>
								</div>

								<div id="collapseOne" class="collapse show fade"
									aria-labelledby="headingOne" data-parent="#accordionExample">
									<div class="card-body">
										<div class="">
											<form name='form' action='https://api.libertyinsurance.in/TPPayment/Home/CapturePayment' method='post'>
												<button type="button"
													class="btn btn-primary btn-lg btn-block">Proposal
													details have been mailed to Insurer</button>
												<br>
												<p>You will be redirected to the Payment Gateway on
													clicking Proceed to Payment
												<p />
												<fieldset class="textborder">

													<legend class=" btn btn-info btn-lg btn-block">
														<h2>Cart</h2>
													</legend>

													<div class="">
														<div class="">
															Car Premium<br> <span class="label success">Success</span>
														</div>
													</div>


												</fieldset>
												<fieldset>
													Grand Total <label>RS.<%= finalresponse.getTotalPremium()%></label><br> (Inclusive of all taxes)<br> <br>
													
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


													<input type="checkbox" id="checkme" name="term&conmditions"
											value="" required="required" />  I agree to all Terms &
										Conditions
													

													<button id="sendNewSms" class="btn btn-lg btn-success float-right"
														type="submit" data-toggle="collapse"
														data-target="#collapseTwo" aria-expanded="false"
														aria-controls="collapseTwo">PROCEED TO PAYMENT
														--></button>
												</fieldset>


											</form>
										</div>
									</div>

								</div>
							</div>
							
						</div>
					</div>
				</div>
			</section>
		</div>
	</div>
		<script type="text/javascript">
	
	var checker = document.getElementById('checkme');
	var sendbtn = document.getElementById('sendNewSms');
	checker.onchange = function() {
	  sendbtn.disabled = !this.checked;
	};
	
	
	</script>
	<!-- .// Accordion -->
</body>
</html>