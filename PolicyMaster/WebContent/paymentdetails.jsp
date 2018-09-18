<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>PolicyMaster.com</title>
<!-- metatags-->
<meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">
<link href="img/p.jpg" rel="icon">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } </script>

<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Montserrat:300,400,500,700" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Josefin+Sans:100,300,400,600,700" rel="stylesheet">
<!--online_fonts-->
<link href="//fonts.googleapis.com/css?family=Lato" rel="stylesheet"><!--online_fonts-->

<!-- Bootstrap CSS File -->
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- Libraries CSS Files -->
  <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="lib/lightbox/css/lightbox.min.css" rel="stylesheet">

<!-- Meta tag Keywords -->
<link href="css/style9.css" rel="stylesheet" type="text/css" media="all"/><!--style_sheet-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/><!--style_sheet-->

<style>
body{
	background-image:url(img/card.jpg);
}
</style>
</head>
<body class="paybody">
  <!--==========================
    Header
  ============================-->
  <header id="header">
    <div class="container-fluid">

      <div id="logo" class="pull-left">
        <a href="index"><img src="img/pm3.png" alt="" title="" /></a>
      </div>

     
    </div>
  </header><!-- #header -->
<br>

<div class='paycontainer'>
<form action="#" method="post">
<img style="width:330px;" src="img/card_img1.png"><div class="xyz" style="float:right;"><span class="payspan">Proposal No. : <%= (String) session.getAttribute("ec1")%></span><br><span class="payspan1">Transaction No. : <%= (String) session.getAttribute("transid")%></span></div>
<p class="pay_p">Payment Details</p>
Card Number :	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" pattern="^[0-9]{16}$" placeholder="Enter Card Number" name="card_no" required=" "/><br><br>
Card Holder Name : <input type="text" pattern="^[a-z|A-Z|" "]$" placeholder="Card Holder Name" name="card_holder" required="" /><br><br>
Card Type : &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="radio" name="card_type" value="visa/master">&nbsp&nbsp<img src="img/card_b1.png">&nbsp&nbsp&nbsp<input type="radio" name="card_type" value="american_express">&nbsp&nbsp<img src="img/card_b2.png"><br><br>
Card valid upto : <span class="agile_sub-label xxx">
								&nbsp&nbsp&nbsp&nbsp&nbsp<select name="month" class="month" required="required">
										<option>Month</option>
										<option value="01"> 01 </option>
										<option value="02"> 02 </option>
										<option value="03"> 03 </option>
										<option value="04"> 04 </option>
										<option value="05"> 05 </option>
										<option value="06"> 06 </option>
										<option value="07"> 07 </option>
										<option value="08"> 08 </option>
										<option value="09"> 09 </option>
										<option value="10"> 10 </option>
										<option value="11"> 11 </option>
										<option value="12"> 12 </option>
									 </select>
									
								</span>
								<span class="agile_sub-label">
									<select name="year" class="year" required="required">
									<option>Year</option>
									<option value="2018"> 2018 </option>
									<option value="2019"> 2019 </option>
										<option value="2020"> 2020 </option>
										<option value="2021"> 2021 </option>
										<option value="2022"> 2022 </option>
										<option value="2023"> 2023 </option>
										<option value="2024"> 2024 </option>
										<option value="2025"> 2025 </option>
										<option value="2026"> 2026 </option>
										<option value="2027"> 2027 </option>
										<option value="2028"> 2028 </option>
										<option value="2029"> 2029 </option>
										<option value="2030"> 2030 </option>
								</select>	
								</span><br><br>
Bank Name :	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" pattern="^[a-z|A-Z|" "]$" placeholder="Enter Bank Name" name="bank_name" required=" "/><br><br>
Branch Name :	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" pattern="^[a-z|A-Z|" "]$" placeholder="Enter Branch Name" name="branch_name" required=" "/><br><br>
Transaction Date : &nbsp<input type="date" name="date" style="width:338px;" required="required">
<span><input type="submit" class="paysubmit" value="Submit"></span>
</form>
</div>
 <!--==========================
    Footer
  ============================-->
  <!-- Contact Form JavaScript File -->
  <script src="contactform/contactform.js"></script>

<script src="lib/bootstrap/js/bootstrap.bundle.min.js"></script>3

  <!-- Template Main Javascript File -->
  <script src="js/main.js"></script>
 
</body>
</html>