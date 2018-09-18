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
<link href="css/style1.css" rel="stylesheet" type="text/css" media="all"/>
<link href="css/style.css" rel="stylesheet">
<style>
body{
	background-image:url(img/bike.jpg);
}
</style>
</head>
<body>
<header id="header">
      <div id="logo" class="pull-left">
        <a href="index.jsp"><img src="img/pm3.png" alt="" title="" /></a>
      </div>
      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li class="menu-active"><a href="index.jsp">Home</a></li>
          <li class="menu-has-children"><a href="lifeinsurance.jsp">LIFE INSURANCE</a>
		<ul>
		<li><a href="#"></a></li>
              <li><a href="terminsurance.jsp">TERM INSURANCE</a></li>
              <li><a href="investmentplan.jsp">INVESTMENT INSURANCE</a></li>
		<li><a href="childplans.jsp">CHILD PLANS</a></li>
		<li><a href="pensionplans.jsp">PENSION PLANS</a></li>
		<li><a href="ulip.jsp">ULIPS</a></li>
		<li><a href="moneyback.jsp">MONEY BACK POLICY</a></li>
		<li><a href="endowment.jsp">ENDOWMENT POLICY</a></li>
		<li><a href="tax.jsp">INCOME TAX</a></li>
	</ul>
          </li>
          <li class="menu-has-children"><a href="healthinsurance.jsp">HEALTH INSURANCE</a>
		<ul>
		<li><a href="#"></a></li>
              <li><a href="healthplans.jsp">HEALTH PLANS</a></li>
              <li><a href="familyhealthplans.jsp">FAMILY HEALTH PLANS</a></li>
		<li><a href="seniorcitizen.jsp">SENIOR CITIZEN HEALTH INSURANCE</a></li>
		<li><a href="criticalillness.jsp">CRITICAL ILLNESS</a></li>
		<li><a href="mediclaim.jsp">MEDICLAIM POLICY</a></li>
		</ul>
          </li>
          <li class="menu-has-children"><a href="motorinsurance.jsp">MOTOR INSURANCE</a>
		<ul>
		<li><a href="#"></a></li>
              <li><a href="car_insurance.jsp">CAR INSURANCE</a></li>
              <li><a href="bike_insurance.jsp">BIKE INSURANCE</a></li>
		<li><a href="car_insurance.jsp">THIRD PARTY INSURANCE</a></li>
		</ul>
          </li>
		<li class="menu-has-children"><a href="otherinsurance.jsp">OTHER INSURANCE</a>
            <ul>
              <li><a href="#"></a></li>
              <li><a href="generalinsurance.jsp">GENERAL INSURANCE</a></li>
              <li><a href="groupmediclaim.jsp">GROUP MEDICLAIM INSURANCE</a></li>
              <li><a href="corporate.jsp">CORPORATE INSURANCE</a></li>
              <li><a href="#travel.jsp">TRAVEL INSURANCE</a></li>
              <li><a href="#homeinsurance.jsp">HOME INSURANCE</a></li>
              <li><a href="personalaccident.jsp">PERSONAL ACCIDENT INSURANCE</a></li>
              <li><a href="cancer.jsp">CANCER INSURANCE</a></li>
            </ul>
          </li>
        <!--  <li><a href="#team.html">CONTACT</a></li> -->
          <li><a href="login.jsp">LOGIN</a></li>
		<li><a href="#contact.html">ADMIN</a></li>
        </ul>
      </nav><!-- #nav-menu-container -->
    </div>
</header><!-- #header -->
<br>

<div class='container' style="width:50%">
<form action="Servlet2" method="post">
<p>BIKE INSURANCE</p>
	<h2><span class="label success">Select Policy Type & Expiry </span></h2><br>

<label class="w3ls-opt">Select Policy Type :<span class="w3ls-star"> * </span></label>	
							<div class="w3ls-text w3ls-name">
								<span class="agile_sub-label1">
									<select name="policytype" class="day">
										<option value="Comprehensive">Comprehensive</option>
										<option value="Third Party">Third Party</option>
									</select>
									
								</span>
								</div><br><br>
<label class="w3ls-opt">Select Policy Expiry :<span class="w3ls-star"> * </span></label>	
							<div class="w3ls-text w3ls-name">
								<span class="agile_sub-label1">
									<select name="policyexpiry" class="day">
										<option value="No Expired">No Expired</option>
										<option value="Expired with in 90 days">Expired with in 90 days</option>
										<option value="Expired more than 90 days">Expired more than 90 days</option>
									</select>
								</span>
								</div>
								
								<div class="w3ls-btn">
									<input type="submit" value="VIEW QUOTES">
								</div>
</form>
</div>
 <!--==========================
    Footer
  ============================-->
<footer>&copy; Copyright <strong>PolicyMaster.com</strong>. All Rights Reserved.</footer> 
  <!-- Contact Form JavaScript File -->
  <script src="contactform/contactform.js"></script>

<script src="lib/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Template Main Javascript File -->
  <script src="js/main.js"></script>
 
</body>
</html>