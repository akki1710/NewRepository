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
        <link rel="stylesheet" href="assets1/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets1/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="assets1/css/form-elements.css">
        <link rel="stylesheet" href="assets1/css/style.css">
        
        <!-- ---country and state file -->
		<script src="js/jquery-my.js"> </script> 
		


        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
		<link href="assets1/ico/p.jpg" rel="icon">
        <link rel="shortcut icon" href="assets/ico/p.jpg">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
		
		<style>
body{
background-image: url('assets1/img/backgrounds/bg15.jpg');
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
		<li><a href="#contact.html">ADMIN</a></li>
        </ul>
      </nav><!-- #nav-menu-container -->
    </div>
  </header><!-- #header -->

        <!-- Top content -->
        <div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>Home Insurance</strong></h1>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	
                        	<form role="form" action="MyServlet6" method="post" class="registration-form">
                        		
                        		<fieldset>
		                        	<div class="form-top">
		                        		<div class="form-top-left">
		                        			<h3>Step 1 / 6</h3>
		                            		<p>Your Details</p>
		                        		</div>
		                        		<div class="form-top-right">
		                        			<i class="fa fa-user"></i>
		                        		</div>
		                            </div>
		                            <div class="form-bottom">
				                    	 <div class="form-group">
										
				                        	<label class="w3ls-opt">Age of Property :</label>	
											<div class="w3ls-text w3ls-name">
											<span class="agile_sub-label1">
				                        	<select name="ageproperty" class="day">
										<option>select age of property</option>
										<option value="Upto 30 Years"> Upto 30 Years </option>
										<option value="31-50 Years"> 31-50 Years </option>
										<option value="More than 50 Years"> More than 50 Years </option>
										
									</select>
									</span>
									
								<div class="clear"></div>
								</div>
								</div>
				                       <div class="form-group">
										
				                    		<div class="wthree-text">
										<label class="w3ls-opt">House Rented? <span class="w3ls-star"> * </span> </label>
										<ul class="radio-w3ls">
				                        	<li> 
				                        	<input type="radio" id="Yes" name="house" Value="Rented">
											<label for="Yes">Rented</label>
										    </li> 
											<li> 
											<input type="radio" id="No" name="house" Value="Owned">
											<label for="No">Owned</label>
											<div class="check">
									<div class="inside"></div>
									</div>
									</li>
									</ul>
				                    </div>
											
											</div>
										<div class="form-group">
										<div class="wthree-text">
										<label class="w3ls-opt">Type of Property? </label>
										<ul class="radio-w3ls">
				                        	<li>
				                        	<input type="radio" id="Yes" name="type" Value="Flat/Apartment">
											<label for="Yes">Flat/Apartment</label>
											</li>
											<li>
											<input type="radio" id="No" name="type" Value="Individual House">
											<label for="No">Individual House</label>
											<div class="check">
									<div class="inside"></div>
									</div>
									</li>
									</ul>
				                    </div>
									</div>
										
										<button type="button" class="btn btn-next">Next</button>
										 </div>
										</fieldset>
										 <fieldset>
		                        	<div class="form-top">
		                        		<div class="form-top-left">
		                        			<h3>Step 2 / 6</h3>
		                            		<p>Your Details</p>
		                        		</div>
		                        		<div class="form-top-right">
		                        			<i class="fa fa-user"></i>
		                        		</div>
		                            </div>
		                            <div class="form-bottom">
				                     
				                        <div class="form-group">
										<div class="wthree-text">
										<h4>Risk Covered :<span class="w3ls-star"> * </span></h4>
										<ul class="radio-w3ls">
				                        	<li>
				                        	<input type="radio" id="Yes" name="riskcovered" Value="Structure+Content">
											<label for="Yes">Structure+Content</label>
											</li>
											<li>
											<input type="radio" id="No" name="riskcovered" Value="Only Content">
											<label for="No">Only Content</label>
											</li>
											<li>
											<input type="radio" id="Yes" name="riskcovered" Value="Only Structure">
											<label for="Yes">Only Structure</label>
											<div class="check">
									<div class="inside"></div>
									</div>
									</li>
									</ul>
				                    </div>	
												
				                        </div>
										<button type="button" class="btn btn-previous">Previous</button>
				                        <button type="button" class="btn btn-next">Next</button>
				                    </div>
			                    </fieldset>
			                    
			                    <fieldset>
		                        	<div class="form-top">
		                        		<div class="form-top-left">
		                        			<h3>Step 3 / 6</h3>
		                            		<p>Your Details</p>
		                        		</div>
		                        		<div class="form-top-right">
		                        			<i class="fa fa-user"></i>
		                        		</div>
		                            </div>
		                            <div class="form-bottom">
				                       <div class="form-group">
				                    	<label class="w3ls-opt">Str. Cover :<span class="w3ls-star"> * </span></label>	
											<div class="w3ls-text w3ls-name">
											<span class="agile_sub-label1">
				                        	<select name="structurecover" class="day">
										<option>Please select amount</option>
										<option value="10,00,000"> 10,00,000 </option>
										<option value="20,00,000"> 20,00,000 </option>
										<option value="30,00,000"> 30,00,000 </option>
										<option value="40,00,000"> 40,00,000 </option>
										<option value="50,00,000"> 50,00,000 </option>
										<option value="60,00,000"> 60,00,000 </option>
										<option value="70,00,000"> 70,00,000 </option>
										<option value="80,00,000"> 80,00,000 </option>
										<option value="90,00,000"> 90,00,000 </option>
										
									</select>
									</span>
									
								<div class="clear"></div>
										
				                        </div>
										</div>
				                        <div class="form-group">
				                        
											<label class="w3ls-opt">Furniture :<span class="w3ls-star"> * </span></label>	
											<div class="w3ls-text w3ls-name">
											<span class="agile_sub-label1">
				                        	<select name="furniture" class="day">
										<option>Please select amount</option>
										<option value="1,00,000"> 1,00,000 </option>
										<option value="2,00,000"> 2,00,000 </option>
										<option value="3,00,000"> 3,00,000 </option>
										<option value="4,00,000"> 4,00,000 </option>
										<option value="5,00,000"> 5,00,000 </option>
										<option value="6,00,000"> 6,00,000 </option>
										<option value="7,00,000"> 7,00,000 </option>
										<option value="8,00,000"> 8,00,000 </option>
										<option value="9,00,000"> 9,00,000 </option>
										<option value="10,00,000"> 10,00,000 </option>
									</select>
									</span>
									
								<div class="clear"></div>
										
				                        </div>
										</div>
										
				                        <div class="form-group">
				                        	
												<label class="w3ls-opt">Electrical Appliances: <span class="w3ls-star"> * </span></label>
												<div class="w3ls-text w3ls-name">
												<span class="agile_sub-label1">
				                        	<select name="appliances" class="month">
										<option>Please select amount</option>
										<option value="50,000"> 50,000 </option>
										<option value="1,00,000"> 1,00,000 </option>
										<option value="1,50,000"> 1,50,000 </option>
										<option value="2,00,000"> 2,00,000 </option>
										<option value="2,50,000"> 2,50,000 </option>
										<option value="3,00,000"> 3,00,000 </option>
											</select>
											</span>
											
										<div class="clear"></div>
										</div>
										
				                        </div>
										<div class="form-group">
				                        	<div class="wthree-text">
										<label class="w3ls-opt">Burglary Cover? <span class="w3ls-star"> * </span> </label>
										<ul class="radio-w3ls">
				                        	<li>
				                        	<input type="radio" id="Yes" name="cover" Value="Yes">
											<label for="Yes">Yes</label>
											</li>
											<li>
											<input type="radio" id="No" name="cover" Value="No">
											<label for="No">No</label>
											<div class="check">
									<div class="inside"></div>
									</div>
									</li>
									</ul>
				                    </div>
											
				                        </div>
										
				                        <button type="button" class="btn btn-previous">Previous</button>
				                        <button type="button" class="btn btn-next">Next</button>
				                    </div>
			                    </fieldset>
			                    
			                    <fieldset>
		                        	<div class="form-top">
		                        		<div class="form-top-left">
		                        			<h3>Step 4 / 6</h3>
		                            		<p>Your Details</p>
		                        		</div>
		                        		<div class="form-top-right">
		                        			<i class="fa fa-user"></i>
		                        		</div>
		                            </div>
		                            <div class="form-bottom">
				                    	<div class="form-group">
										<label class="w3ls-opt">name :<span class="w3ls-star"> * </span></label>
										<div class="w3ls-name">	
										<input type="text" name="name"  placeholder="Enter Your Name">
										</div>
										</div>
				                      
				                       <div class="form-group">
										<label class="w3ls-opt">Birth Date :<span class="w3ls-star"> * </span></label>	
											<div class="w3ls-text w3ls-name">
											<span class="agile_sub-label">
				                        	<select name="day" class="day">
										<option>Day</option>
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
										<option value="11"> 11 </option>
										<option value="12"> 12 </option>
										<option value="13"> 13 </option>
										<option value="14"> 14 </option>
										<option value="15"> 15 </option>
										<option value="16"> 16 </option>
										<option value="17"> 17 </option>
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
									</select>
									</span>
									<span class="agile_sub-label xxx">
									<select name="month" class="month">
										<option>Month</option>
										<option value="01"> January </option>
										<option value="02"> February </option>
										<option value="03"> March </option>
										<option value="04"> April </option>
										<option value="05"> May </option>
										<option value="06"> June </option>
										<option value="07"> July </option>
										<option value="08"> August </option>
										<option value="09"> September </option>
										<option value="10"> October </option>
										<option value="11"> November </option>
										<option value="12"> December </option>
									 </select>
									 </span>
									 <span class="agile_sub-label">
									 <select name="year" class="year">
										<option>Year</option>
										<option value="2000"> 2000 </option>
										<option value="1999"> 1999 </option>
										<option value="1998"> 1998 </option>
										<option value="1997"> 1997 </option>
										<option value="1996"> 1996 </option>
										<option value="1995"> 1995 </option>
										<option value="1994"> 1994 </option>
										<option value="1993"> 1993 </option>
										<option value="1992"> 1992 </option>
										<option value="1991"> 1991 </option>
										<option value="1990"> 1990 </option>
										<option value="1989"> 1989 </option>
										<option value="1988"> 1988 </option>
										<option value="1987"> 1987 </option>
										<option value="1986"> 1986 </option>
										<option value="1985"> 1985 </option>
										<option value="1984"> 1984 </option>
										<option value="1983"> 1983 </option>
										<option value="1982"> 1982 </option>
										<option value="1981"> 1981 </option>
										<option value="1980"> 1980 </option>
										<option value="1979"> 1979 </option>
										<option value="1978"> 1978 </option>
										<option value="1977"> 1977 </option>
										<option value="1976"> 1976 </option>
										<option value="1975"> 1975 </option>
										<option value="1974"> 1974 </option>
										<option value="1973"> 1973 </option>
										<option value="1972"> 1972 </option>
										<option value="1971"> 1971 </option>
										<option value="1970"> 1970 </option>
								</select>	
								</span>
								<div class="clear"></div>
								</div>
										</div>
										<div class="form-group">
										 
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
										</div>
										 <div class="form-group">
										<div class="wthree-text">
										<label class="w3ls-opt">Gender: <span class="w3ls-star"> * </span> </label>
										<ul class="radio-w3ls">
				                        	<li>
				                        	<input type="radio" id="Yes" name="gender" Value="Male">
											<label for="Yes">Male</label>
											</li>
											<li>
											<input type="radio" id="No" name="gender" Value="Female">
											<label for="No">Female</label>
											<div class="check">
									<div class="inside"></div>
									</div>
									</li>
									</ul>
				                    </div>
									</div>
				                        <button type="button" class="btn btn-previous">Previous</button>
				                        <button type="button" class="btn btn-next">Next</button>
				                    </div>
			                    </fieldset>
								<fieldset>
		                        	<div class="form-top">
		                        		<div class="form-top-left">
		                        			<h3>Step 5 / 6</h3>
		                            		<p>Your Details</p>
		                        		</div>
		                        		<div class="form-top-right">
		                        			<i class="fa fa-user"></i>
		                        		</div>
		                            </div>
		                            <div class="form-bottom">
				                    	<div class="form-group">
										<label class="w3ls-opt">Income: <span class="w3ls-star"> * </span> </label>
								<div class="w3ls-text w3ls-name">
									<span class="agile_sub-label1 xxx">
										<select name="income" class="month">
											<option>please select income</option>
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
										</div>
									<div class="form-group">
										<div class="mail">
											<label class="w3ls-opt">e-mail :<span class="w3ls-star"> * </span></label>
											<span class="w3ls-text w3ls-name">
											<input type="email" name="email" placeholder="enter your e-mail" required=""/>
											</span>
											</div>
										</div>
										<div class="form-group">
										<label class="w3ls-opt">phone number :<span class="w3ls-star"> * </span></label>	
				                        	<span class="w3ls-text w3ls-name">
											<input type="text" name="phoneno" placeholder="phone number" pattern="[1-9]{1}[0-9]{9}" title="Enter 10 digit mobile number" required=""/>
											</span>
										</div>
									
									<button type="button" class="btn btn-previous">Previous</button>
				                    <button type="button" class="btn btn-next">Next</button>
										</div>
										
		                    </fieldset>
							<fieldset>
		                        	<div class="form-top">
		                        		<div class="form-top-left">
		                        			<h3>Step 6 / 6</h3>
		                            		<p>Your Details</p>
		                        		</div>
		                        		<div class="form-top-right">
		                        			<i class="fa fa-user"></i>
		                        		</div>
		                            </div>
		                            <div class="form-bottom">
				                    	<div class="form-group">
										<div class="wthree-text">
										<h4>Marital Status :<span class="w3ls-star"> * </span></h4>
										<ul class="radio-w3ls">
				                        	<li>
				                        	<input type="radio" id="Yes" name="status" Value="Single">
											<label for="Yes">Single</label>
											</li>
											<li>
											<input type="radio" id="No" name="status" Value="Married">
											<label for="No">Married</label>
											</li>
											<li>
											<input type="radio" id="other" name="status" Value="Others">
											<label for="other">Others</label>
											<div class="check">
									<div class="inside"></div>
									</div>
									</li>
									</ul>
				                    </div>
									</div>
									<button type="button" class="btn btn-previous">Previous</button>
				                    <button type="submit" class="btn">Compare & Save Big</button>
										</div>
										
		                    </fieldset>
									
							
		                    </form>
		                    
                        </div>
                    </div>
                </div>
            </div>
            
        </div>

		<!-- ---country and state file -->
		<script src="js/jquery-my.js"> </script> 

        <!-- Javascript -->
        <script src="assets1/js/jquery-1.11.1.min.js"></script>
        <script src="assets1/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets1/js/jquery.backstretch.min.js"></script>
        <script src="assets1/js/retina-1.1.0.min.js"></script>
        <script src="assets1/js/scripts.js"></script>
		
        
        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

    </body>

</html>