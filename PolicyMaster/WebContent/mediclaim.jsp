<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>PolicyMaster.com</title>

        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="assets/css/form-elements.css">
        <link rel="stylesheet" href="assets/css/style.css">
		<link rel="stylesheet" href="assets/css/style1.css">
		
		<!-- ---country and state file -->
		<script src="js/jquery-my.js"> </script> 
		
		<link href="css/style.css" rel="stylesheet">
		<link href="css/style1.css" rel="stylesheet" type="text/css" media="all"/><!--style_sheet-->

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/p.jpg">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
<style>
body{
background-image: url('assets/img/backgrounds/1.jpg');
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
		<li><a href="user.jsp">MYACCOUNT</a></li>
        </ul>
      </nav><!-- #nav-menu-container -->
    </div>
  </header><!-- #header -->

	<section id>
	<h1>MEDICLAIM POLICY</h1>
<div class="w3ls-main">
<h2>Free quotes from top insurers with lowest premiums</h2>
<!-- <p>Complete the form below to sign up for our membership service.</p> -->
<div class="w3ls-form">
<form action="ModalServlet" method="post">
<ul class="fields">
<div class="Refer_w3l">
<h3>Your details</h3>
	<li>	
		<label class="w3ls-opt">Members :<span class="w3ls-star"> * </span></label>
		<div class="w3ls-name">	
			<input type="text" name="members" value="<%= (String) session.getAttribute("members")%>" class="btn btn-link-1 launch-modal" data-modal-id="modal-login" required=" "/>
		</div>
	</li>
	</div>
	</ul>
</form>
<form action="ModalServlet1" method="post">
<ul class="fields">
<div class="Refer_w3l">
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
							<label class="w3ls-opt">Income: <span class="w3ls-star"> * </span> </label>
								<div class="w3ls-text w3ls-name">
									<span class="agile_sub-label xxx">
										<select name="income" class="month">
											<option>Income</option>
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

	<li>	
		<label class="w3ls-opt">name :<span class="w3ls-star"> * </span></label>
		<div class="w3ls-name">	
			<input type="name" name="name"  placeholder="Enter Your Name" required=" "/>
		</div>
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
				<div class="phoneno">
		<label class="w3ls-opt">phone number :<span class="w3ls-star"> * </span></label>	
			<span class="w3ls-text w3ls-name">
				<input type="phoneno" name="phoneno" placeholder="phone number" pattern="[1-9]{1}[0-9]{9}" title="Enter 10 digit mobile number" required=""/>
			</span>
			</div>
	</li>

					<div class="wthree-text">
					<h4>Any Medical Conditions </h4>
						<ul class="radio-w3ls">
							<li>
								<input type="radio" id="Yes" name="medical" value="Yes">
								 <label for="Yes">Yes</label>	
								<div class="check"></div>
							</li>
							<li>
								<input type="radio" id="No" name="medical" value="No"> 
								 <label for="No">No</label>
								<div class="check">
									<div class="inside"></div>
								</div>
								</li>
								</ul>
								</div>
							
		


<p>*By clicking on "Get Free Quotes" you agree to our <a href="#"> privacy policy</a></p>  

<div class="clear"></div>
	<div class="w3ls-btn">
		<input type="submit" value="Get Free Quotes">
	</div>
	
	</div>
	</ul>
</form>
</div>
</div>
</section>

<footer>&copy; Copyright <strong>PolicyMaster.com</strong>. All Rights Reserved.<br>
IRDAI Licence : IRDAI/INT/WBA/48/2017</footer>
	
	
	
					
					 
					 <!-- MODAL -->
        <div class="modal fade" id="modal-login" tabindex="-1" role="dialog" aria-labelledby="modal-login-label" aria-hidden="true">
        	<div class="modal-dialog">
        		<div class="modal-content">
        			
        			<div class="modal-header">
        				<button type="button" class="close" data-dismiss="modal">
        					<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
        				</button>
        				<h2 class="modal-title" id="modal-login-label">Add your family members</h2>
        				
        			</div>
        			
        			<div class="modal-body">
        				
	                    <form role="form" action="ModalServlet" method="post" class="login-form">
	                    	
							
							<li>
							<label class="w3ls-opt"><input type="checkbox" name="member" value="self">Self</label>
							<div class="w3ls-text w3ls-name">
									<span class="agile_sub-label xxx">
							<select name="age" class="month">
											<option>Age</option>
											<option value="18"> 18 </option>
											<option value="19"> 19 </option>
											<option value="20"> 20 </option>
											<option value="21"> 21 </option>
											<option value="22"> 22 </option>
											<option value="23"> 23 </option>
											<option value="24"> 24 </option>
											<option value="25"> 25 </option>
											<option value="26"> 26 </option>
											<option value="27"> 27 </option>
											<option value="28"> 28 </option>
											<option value="29"> 29 </option>
											<option value="30"> 30 </option>
											<option value="31"> 31 </option>
											<option value="32"> 32 </option>
											<option value="33"> 33 </option>
											<option value="34"> 34 </option>
											<option value="35"> 35 </option>
											<option value="36"> 36 </option>
											<option value="37"> 37 </option>
											<option value="38"> 38 </option>
											<option value="39"> 39 </option>
											<option value="40"> 40 </option>
											<option value="41"> 41 </option>
											<option value="42"> 42 </option>
											<option value="43"> 43 </option>
											<option value="44"> 44 </option>
											<option value="45"> 45 </option>
											<option value="46"> 46 </option>
											<option value="47"> 47 </option>
											<option value="48"> 48 </option>
											<option value="49"> 49 </option>
											<option value="50"> 50 </option>
											<option value="51"> 51 </option>
											<option value="52"> 52 </option>
											<option value="53"> 53 </option>
											<option value="54"> 54 </option>
											<option value="55"> 55 </option>
											<option value="56"> 56 </option>
											<option value="57"> 57 </option>
											<option value="58"> 58 </option>
											<option value="59"> 59 </option>
											<option value="60"> 60 </option>
											<option value="61"> 61 </option>
											<option value="62"> 62 </option>
											<option value="63"> 63 </option>
											<option value="64"> 64 </option>
											<option value="65"> 65 </option>
											<option value="66"> 66 </option>
											<option value="67"> 67 </option>
											<option value="68"> 68 </option>
											<option value="69"> 69 </option>
											<option value="70"> 70 </option>
											<option value="71"> 71 </option>
											<option value="72"> 72 </option>
											<option value="73"> 73 </option>
											<option value="74"> 74 </option>
											<option value="75"> 75 </option>
											<option value="76"> 76 </option>
											<option value="77"> 77 </option>
											<option value="78"> 78 </option>
											<option value="79"> 79 </option>
											<option value="80"> 80 </option>
											<option value="81"> 81 </option>
											<option value="82"> 82 </option>
											<option value="83"> 83 </option>
											<option value="84"> 84 </option>
											<option value="85"> 85 </option>
											<option value="86"> 86 </option>
											<option value="87"> 87 </option>
											<option value="88"> 88 </option>
											<option value="89"> 89 </option>
											<option value="90"> 90 </option>
											<option value="91"> 91 </option>
											<option value="92"> 92 </option>
											<option value="93"> 93 </option>
											<option value="94"> 94 </option>
											<option value="95"> 95 </option>
											<option value="96"> 96 </option>
											<option value="97"> 97 </option>
											<option value="98"> 98 </option>
											<option value="99"> 99 </option>
											<option value="100"> 100 </option>
											</select>
			</span>

			<div class="clear"></div>
		</div>
	</li>
							
							<li>
							<label class="w3ls-opt"><input type="checkbox" name="member1" value="spouse">Spouse</label>
							<div class="w3ls-text w3ls-name">
									<span class="agile_sub-label xxx">
							<select name="age1" class="day">
											<option>Age</option>
											<option value="18"> 18 </option>
											<option value="19"> 19 </option>
											<option value="20"> 20 </option>
											<option value="21"> 21 </option>
											<option value="22"> 22 </option>
											<option value="23"> 23 </option>
											<option value="24"> 24 </option>
											<option value="25"> 25 </option>
											<option value="26"> 26 </option>
											<option value="27"> 27 </option>
											<option value="28"> 28 </option>
											<option value="29"> 29 </option>
											<option value="30"> 30 </option>
											<option value="31"> 31 </option>
											<option value="32"> 32 </option>
											<option value="33"> 33 </option>
											<option value="34"> 34 </option>
											<option value="35"> 35 </option>
											<option value="36"> 36 </option>
											<option value="37"> 37 </option>
											<option value="38"> 38 </option>
											<option value="39"> 39 </option>
											<option value="40"> 40 </option>
											<option value="41"> 41 </option>
											<option value="42"> 42 </option>
											<option value="43"> 43 </option>
											<option value="44"> 44 </option>
											<option value="45"> 45 </option>
											<option value="46"> 46 </option>
											<option value="47"> 47 </option>
											<option value="48"> 48 </option>
											<option value="49"> 49 </option>
											<option value="50"> 50 </option>
											<option value="51"> 51 </option>
											<option value="52"> 52 </option>
											<option value="53"> 53 </option>
											<option value="54"> 54 </option>
											<option value="55"> 55 </option>
											<option value="56"> 56 </option>
											<option value="57"> 57 </option>
											<option value="58"> 58 </option>
											<option value="59"> 59 </option>
											<option value="60"> 60 </option>
											<option value="61"> 61 </option>
											<option value="62"> 62 </option>
											<option value="63"> 63 </option>
											<option value="64"> 64 </option>
											<option value="65"> 65 </option>
											<option value="66"> 66 </option>
											<option value="67"> 67 </option>
											<option value="68"> 68 </option>
											<option value="69"> 69 </option>
											<option value="70"> 70 </option>
											<option value="71"> 71 </option>
											<option value="72"> 72 </option>
											<option value="73"> 73 </option>
											<option value="74"> 74 </option>
											<option value="75"> 75 </option>
											<option value="76"> 76 </option>
											<option value="77"> 77 </option>
											<option value="78"> 78 </option>
											<option value="79"> 79 </option>
											<option value="80"> 80 </option>
											<option value="81"> 81 </option>
											<option value="82"> 82 </option>
											<option value="83"> 83 </option>
											<option value="84"> 84 </option>
											<option value="85"> 85 </option>
											<option value="86"> 86 </option>
											<option value="87"> 87 </option>
											<option value="88"> 88 </option>
											<option value="89"> 89 </option>
											<option value="90"> 90 </option>
											<option value="91"> 91 </option>
											<option value="92"> 92 </option>
											<option value="93"> 93 </option>
											<option value="94"> 94 </option>
											<option value="95"> 95 </option>
											<option value="96"> 96 </option>
											<option value="97"> 97 </option>
											<option value="98"> 98 </option>
											<option value="99"> 99 </option>
											<option value="100"> 100 </option>
											</select>
			</span>

			<div class="clear"></div>
		</div>
	</li>	
						
							<li>
							<label class="w3ls-opt"><input type="checkbox" name="member2" value="son">Son</label>
							<div class="w3ls-text w3ls-name">
									<span class="agile_sub-label xxx">
							<select name="age2" class="month">
											<option>Age</option>
											<option value="3-12Months"> 3-12Months </option>
											<option value="1"> 1 </option>
											<option value="2"> 2 </option>
											<option value="3"> 3 </option>
											<option value="4"> 4 </option>
											<option value="5"> 5 </option>
											<option value="6"> 6 </option>
											<option value="7"> 7 </option>
											<option value="8"> 8 </option>
											<option value="9"> 9 </option>
											<option value="10"> 10 </option>
											<option value="11"> 11</option>
											<option value="12"> 12 </option>
											<option value="13"> 13 </option>
											<option value="14"> 14 </option>
											<option value="15"> 15 </option>
											<option value="16"> 16 </option>
											<option value="17"> 17 </option>											
											</select>
			</span>

			<div class="clear"></div>
		</div>
	</li>	
								
							<li>
							<label class="w3ls-opt"><input type="checkbox" name="member3" value="daughter">Daughter</label>
							<div class="w3ls-text w3ls-name">
									<span class="agile_sub-label xxx">
							<select name="age3" class="month">
											<option>Age</option>
											<option value="3-12Months"> 3-12Months </option>
											<option value="1"> 1 </option>
											<option value="2"> 2 </option>
											<option value="3"> 3 </option>
											<option value="4"> 4 </option>
											<option value="5"> 5 </option>
											<option value="6"> 6 </option>
											<option value="7"> 7 </option>
											<option value="8"> 8 </option>
											<option value="9"> 9 </option>
											<option value="10"> 10 </option>
											<option value="11"> 11</option>
											<option value="12"> 12 </option>
											<option value="13"> 13 </option>
											<option value="14"> 14 </option>
											<option value="15"> 15 </option>
											<option value="16"> 16 </option>
											<option value="17"> 17 </option>	
											</select>
			</span>

			<div class="clear"></div>
		</div>
	</li>
				
							<li>
							<label class="w3ls-opt">Add More Members: </label>
							<div class="w3ls-text w3ls-name">
									<span class="agile_sub-label xxx">
							<select name="member4" class="month">
											<option>Members</option>
											<option value="Father"> Father </option>
											<option value="Mother"> Mother </option>
											<option value="Father-in-law"> Father-in-law </option>
											<option value="Mother-in-law"> Mother-in-law </option>
											<option value="GrandFather"> Grandfather </option>
											<option value="GrandMother"> Grandmother </option>
											</select>
			</span>
			
							<div class="w3ls-text w3ls-name">
									<span class="agile_sub-label xxx">
							<select name="age4" class="month">
											<option>Age</option>
											<option value="40"> 40 </option>
											<option value="41"> 41 </option>
											<option value="42"> 42 </option>
											<option value="43"> 43 </option>
											<option value="44"> 44 </option>
											<option value="45"> 45 </option>
											<option value="46"> 46 </option>
											<option value="47"> 47 </option>
											<option value="48"> 48 </option>
											<option value="49"> 49 </option>
											<option value="50"> 50 </option>
											<option value="51"> 51 </option>
											<option value="52"> 52 </option>
											<option value="53"> 53 </option>
											<option value="54"> 54 </option>
											<option value="55"> 55 </option>
											<option value="56"> 56 </option>
											<option value="57"> 57 </option>
											<option value="58"> 58 </option>
											<option value="59"> 59 </option>
											<option value="60"> 60 </option>
											<option value="61"> 61 </option>
											<option value="62"> 62 </option>
											<option value="63"> 63 </option>
											<option value="64"> 64 </option>
											<option value="65"> 65 </option>
											<option value="66"> 66 </option>
											<option value="67"> 67 </option>
											<option value="68"> 68 </option>
											<option value="69"> 69 </option>
											<option value="70"> 70 </option>
											<option value="71"> 71 </option>
											<option value="72"> 72 </option>
											<option value="73"> 73 </option>
											<option value="74"> 74 </option>
											<option value="75"> 75 </option>
											<option value="76"> 76 </option>
											<option value="77"> 77 </option>
											<option value="78"> 78 </option>
											<option value="79"> 79 </option>
											<option value="80"> 80 </option>
											<option value="81"> 81 </option>
											<option value="82"> 82 </option>
											<option value="83"> 83 </option>
											<option value="84"> 84 </option>
											<option value="85"> 85 </option>
											<option value="86"> 86 </option>
											<option value="87"> 87 </option>
											<option value="88"> 88 </option>
											<option value="89"> 89 </option>
											<option value="90"> 90 </option>
											<option value="91"> 91 </option>
											<option value="92"> 92 </option>
											<option value="93"> 93 </option>
											<option value="94"> 94 </option>
											<option value="95"> 95 </option>
											<option value="96"> 96 </option>
											<option value="97"> 97 </option>
											<option value="98"> 98 </option>
											<option value="99"> 99 </option>
											<option value="100"> 100 </option>
											</select>
			</span>

			<div class="clear"></div>
		</div>
	</li>

							
													
							
	                        <div class="text-center"><button type="submit" class="btn">Done</button></div>
	                    </form>
	                    
        			</div>
        			
        		</div>
        	</div>
        </div>
	
	
	<!-- Javascript -->
        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.backstretch.min.js"></script>
        <script src="assets/js/scripts.js"></script>
		
        
        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

    </body>

</html>