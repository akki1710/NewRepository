<%@include file="include_css.jsp" %>
<!-- ---country and state file -->
<script src="js/jquery-my.js"></script> 
<link href="css/style1.css" rel="stylesheet">
<link href="css/style9.css" rel="stylesheet" type="text/css" media="all"/>
<style>
form .form-group label{color:#fff}
form label{clear:both}
form input[type="submit"]{width:auto}
 .container{background:transparent}
    .col-md-6{background: rgba(0, 0, 0, 0.63);margin: 0 auto;padding:20px 30px}
    body{background:url('img/endowment.jpg')no-repeat center center;background-size:cover;background-attachment:fixed;}
    .list-group button{padding: .75rem 1.25rem; cursor: pointer; }
    .w3ls-name{*width:100%;*text-align:left}
    .w3ls-name input[type=text],.contactForm input[type=text],.agile_sub-label1{width:100%!important;}
    #line{text-align:center;margin-left: 0px;}
    .col-md-6 h2,.col-md-6 h1{font-size:normal!important;letter-spacing:normal}
    .col-md-6 p {color: #fff;font-size: 15px;text-align: left;}
    @media (max-width:768px){
        .col-md-6 p {color: #fff;font-size: 15px;text-align: left;margin-top: 15px;}
        .col-md-6 h2,.col-md-12 h1{font-size:medium!important;}
    }

</style>
<%@include file="menu.jsp" %>

<div class="container">
    <div class="row">
        <div class="col-md-6">
<h1>ENDOWMENT POLICY</h1>
<h2>Compare now to earn high returns from your investments</h2>
<!-- <p>Complete the form below to sign up for our membership service.</p> -->
<div class="w3ls-form">
<form action="MyServlet2" method="post">
<ul class="fields">
<div class="Refer_w3l">
<h3>Your Details : </h3>
	<li>	
		<label class="w3ls-opt">Invest (/month) :<span class="w3ls-star"> * </span></label>
		<div class="w3ls-name">	
			<input type="text" name="cover"  placeholder="5,000/- (minimum)" required=" "/>
		</div>
	</li>
	
						<li>	
							<label class="w3ls-opt">Age :<span class="w3ls-star"> * </span></label>
								<div class="w3ls-name">	
									<input type="text" name="age"  placeholder="Your Age" required=" "/>
								</div>
						</li> 
						<li>
							<label class="w3ls-opt">Term: <span class="w3ls-star"> * </span> </label>
								<div class="w3ls-text w3ls-name">
									<span class="agile_sub-label1">
										<select name="term" class="month">
											<option>Select Term</option>
											<option value="5 Years"> 5 Years </option>
											<option value="10 Years"> 10 Years </option>
											<option value="15 Years"> 15 Years </option>
											<option value="20 Years"> 20 Years </option>
											<option value="25 Years"> 25 Years </option>
											<option value="30 Years"> 30 Years </option>
											</select>
			</span>

			<div class="clear"></div>
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
		
		
	<li>	
		<label class="w3ls-opt">name :<span class="w3ls-star"> * </span></label>
		<div class="w3ls-name">	
			<input type="text" name="name"  placeholder="Enter Your Name" required=" "/>
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
		<label class="w3ls-opt">phone number :<span class="w3ls-star"> * </span></label>	
			<span class="w3ls-text w3ls-name">
				<input type="text" name="phoneno" placeholder="phone number" pattern="[1-9]{1}[0-9]{9}" title="Enter 10 digit mobile number" required=""/>
			</span>
	</li>
		
		

<!--	<div class="Refer_w3l">
	<h3>Membership Rules</h3>
	
	<p>1. Praesent urna odio, rutrum sed malesuada nec, pulvinar sed metus</p>
	
	<p>2. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam non dolor et nulla tristique commodo nec eget nibh. </p>
	
	</div>  -->
	<p>*By clicking on ''Get Free Quotes'' you agree to our <a href="#"> privacy policy</a></p>  

<div class="clear"></div>
	<div class="w3ls-btn">
		<input type="submit" value="Get Free Quotes">
	</div>
	</div>
	</ul>
</form>
            </div>
        </div></div></div>
<%@include file="footer.jsp" %>