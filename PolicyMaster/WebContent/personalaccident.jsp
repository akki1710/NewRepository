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

<!-- ---country and state file -->
<script src="js/jquery-my.js"> </script> 
<!-- Bootstrap CSS File -->
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Libraries CSS Files -->
  <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="lib/lightbox/css/lightbox.min.css" rel="stylesheet">

<!-- Meta tag Keywords -->
  <link href="css/style.css" rel="stylesheet">
<link href="css/style1.css" rel="stylesheet" type="text/css" media="all"/><!--style_sheet-->
<style>
body{
background-image: url('img/personalaccident.jpg');
background-size: cover;
background-attachment:fixed;
min-height: 700px;
font-family: 'Lato', sans-serif;
}
</style>

</head>
<body>
 <!--==========================
    Header
  ============================-->
  <header id="header">
    <div class="container-fluid">

      <div id="logo" class="pull-left">
         <!--   <h1><a href="index.html" class="scrollto">PolicyMaster.com</a></h1> -->
        <!-- Uncomment below if you prefer to use an image logo -->
         <a href="index"><img src="img/logo.png" alt="" title="" /></a> 
      </div>

      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li class="menu-active"><a href="index">Home</a></li>
          <li class="menu-has-children"><a href="lifeinsurance">LIFE INSURANCE</a>
		<ul>
		<li><a href="#"></a></li>
              <li><a href="terminsurance">TERM INSURANCE</a></li>
              <li><a href="investmentplan">INVESTMENT INSURANCE</a></li>
		<li><a href="childplans">CHILD PLANS</a></li>
		<li><a href="pensionplans">PENSION PLANS</a></li>
		<li><a href="ulip">ULIPS</a></li>
		<li><a href="moneyback">MONEY BACK POLICY</a></li>
		<li><a href="endowment">ENDOWMENT POLICY</a></li>
		<li><a href="incometax">INCOME TAX</a></li>
	</ul>
          </li>
          <li class="menu-has-children"><a href="healthinsurance">HEALTH INSURANCE</a>
		<ul>
		<li><a href="#"></a></li>
              <li><a href="healthplans">HEALTH PLANS</a></li>
              <li><a href="familyhealthplans">FAMILY HEALTH PLANS</a></li>
		<li><a href="seniorcitizen">SENIOR CITIZEN HEALTH INSURANCE</a></li>
		<li><a href="criticalillness">CRITICAL ILLNESS</a></li>
		<li><a href="mediclaim">MEDICLAIM POLICY</a></li>
		</ul>
          </li>
          <li class="menu-has-children"><a href="motorinsurance">MOTOR INSURANCE</a>
		<ul>
		<li><a href="#"></a></li>
              <li><a href="car_insurance">CAR INSURANCE</a></li>
              <li><a href="bike_insurance">BIKE INSURANCE</a></li>
		<li><a href="car_insurance">THIRD PARTY INSURANCE</a></li>
		</ul>
          </li>
		<li class="menu-has-children"><a href="otherinsurance">OTHER INSURANCE</a>
            <ul>
              <li><a href="#"></a></li>
              <li><a href="general">GENERAL INSURANCE</a></li>
              <li><a href="groupmediclaim">GROUP MEDICLAIM INSURANCE</a></li>
              <li><a href="corporate">CORPORATE INSURANCE</a></li>
              <li><a href="travel">TRAVEL INSURANCE</a></li>
              <li><a href="homeinsurance">HOME INSURANCE</a></li>
              <li><a href="personalaccident">PERSONAL ACCIDENT INSURANCE</a></li>
              <li><a href="cancer">CANCER INSURANCE</a></li>
            </ul>
          </li>
        <!--  <li><a href="#team.html">CONTACT</a></li> -->
          <li><a href="login">LOGIN</a></li>
		<li><a href="#contact.html">ADMIN</a></li>
        </ul>
      </nav><!-- #nav-menu-container -->
    </div>
  </header><!-- #header -->

<section id>
<h1>PERSONAL ACCIDENT</h1>
<div class="w3ls-main">
<h2>Free quotes from top insurers with lowest premiums</h2>
<!-- <p>Complete the form below to sign up for our membership service.</p> -->
<div class="w3ls-form">
<form action="MyServlet5" method="post">
<ul class="fields">
<div class="Refer_w3l">
<h3>Your details</h3>
	<li>	
		<label class="w3ls-opt">name :<span class="w3ls-star"> * </span></label>
		<div class="w3ls-name">	
			<input type="text" name="name"  placeholder="Enter Your Name" required=" "/>
		</div>
	</li>
	
						<li>
		<label class="w3ls-opt">phone number :<span class="w3ls-star"> * </span></label>	
			<span class="w3ls-text w3ls-name">
				<input type="text" name="phoneno" placeholder="phone number" pattern="[1-9]{1}[0-9]{9}" title="Enter 10 digit mobile number" required=""/>
			</span>
	</li>
						<li>
		   <div class="mail"> 
			<label class="w3ls-opt">e-mail :<span class="w3ls-star"> * </span></label>
			<span class="w3ls-text w3ls-name">
				<input type="email" name="email" placeholder="enter your e-mail" required=""/>
			</span>
		</div>
	</li>
	 <li>
		<label class="w3ls-opt">Address <span class="w3ls-star"> *</span></label>	
			<div class="w3ls-text w3ls-name">
				<span class="agile_sub-label">
					<select class="month" id="country" name="country"></select>
				
				</span>
				<span class="agile_sub-label xxx">
					<select class="month" id="state" name="city">
					<option value="">State</option>
					</select>
					<script language="javascript">
						populateCountries("country", "state");
         			</script>
				</span>
        	</div>
	</li>
								<li>
							<label class="w3ls-opt">Annual Income: <span class="w3ls-star"> * </span> </label>
								<div class="w3ls-text w3ls-name">
									<span class="agile_sub-label1">
										<select name="income" class="month">
											<option>select annual income</option>
											<option value="Upto3Lac"> Upto3Lac </option>
											<option value="3-5Lac"> 3-5Lac </option>
											<option value="5-7Lac"> 5-7Lac </option>
											<option value="7-10Lac"> 7-10Lac </option>
											<option value="10-15Lac"> 10-15Lac </option>
											<option value="15Lac+"> 15Lac+ </option>
											</select>
			</span>

			<div class="clear"></div>
		</div>
	</li>

	
		

<!--	<div class="Refer_w3l">
	<h3>Membership Rules</h3>
	
	<p>1. Praesent urna odio, rutrum sed malesuada nec, pulvinar sed metus</p>
	
	<p>2. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam non dolor et nulla tristique commodo nec eget nibh. </p>
	
	</div>  -->
	<p>*By clicking on "Compare & Save Big" you agree to our <a href="#"> privacy policy</a></p>  

<div class="clear"></div>
	<div class="w3ls-btn">
		<input type="submit" value="Compare & Save Big">
	</div>
	</div>
	</ul>
</form>
</div>
</div>
</section>
<footer>&copy; Copyright <strong>PolicyMaster.com</strong>. All Rights Reserved.<br>
IRDAI Licence : IRDAI/INT/WBA/48/2017
</footer>

  <!-- Contact Form JavaScript File -->
  <script src="contactform/contactform.js"></script>

<script src="lib/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Template Main Javascript File -->
  <script src="js/main.js"></script>
 



 
</body>
</html>