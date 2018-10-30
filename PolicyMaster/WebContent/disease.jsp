<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PolicyMaster.com</title>
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
background-image: url('assets/img/backgrounds/1.jpg');
background-size: cover;
background-attachment:fixed;
min-height: 700px;
font-family: 'Lato', sans-serif;
}
.mytable th{color: #e9ecef!important;
    font-weight: normal;}
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
          <li class="menu-active"><a href="#intro">Home</a></li>
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
   <h1>HEALTH INSURENCE</h1>
    <div class="w3ls-main">
    <h2>Widest Choice Of Health Insurance Plans</h2>
    <!-- <p>Complete the form below to sign up for our membership service.</p> -->
    <div class="w3ls-form">
    <!--  <form action="Disease" method="post"> -->
  <form action="HealthSer" method="post">
       <div class="Refer_w3l">
        <h3>Your details</h3>
         
         <%String s = (String)session.getAttribute("members");
    		String a[] = s.split(",");
    		
         %>
         
           <table class="table mytable">
            <tr>
             <th></th>
             <th>Asthma</th>
             <th>Diabetes</th>
             <th>Heart Ailments</th>
             <th>Hypertension</th>
             <th>Thyroid</th>
            </tr>
            
              <%
                 for(int i=0; i<a.length; i++)
                 {
                	 if(a[i]!=null)
                	 {
                		 %>
                		 
                		 <tr>
                          <th><%= a[i] %></th>
                          <td><input type="checkbox" id="Yes" name="member_disease" value="asthma" /></td>
                          <td><input type="checkbox" id="Yes" name="member_disease" value="diabetes" /></td>
                          <td><input type="checkbox" id="Yes" name="member_disease" value="heart ailments" /></td>
                          <td><input type="checkbox" id="Yes" name="member_disease" value="hypertension" /></td>
                          <td><input type="checkbox" id="Yes" name="member_disease" value="thyroid" /></td>
             
                         </tr>
                		 
                 <%	 }} %>
                 
             
            
            
            
           </table>
           <div class="clear"></div>
	       <div class="w3ls-btn">
		     <input type="submit" value="Proceed">
	       </div>
       </div>
      </ul>
     </form>
    </div>
    </div>
  
  
  
  
  
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