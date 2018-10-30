<%@ page import="study.db.*"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.util.List"%>
<%@page import="java.sql.Connection"%><%@ page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.*"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>PolicyMaster.com</title>

<!-- CSS -->
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
<link rel="stylesheet" href="assets1/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="assets1/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="assets1/css/form-elements.css">
<link rel="stylesheet" href="assets1/css/style.css">
<link rel="stylesheet" href="assets1/css/form.css">



<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

<!-- Favicon and touch icons -->
<link href="assets1/ico/p.jpg" rel="icon">
<link rel="shortcut icon" href="assets/ico/p.jpg">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="assets/ico/apple-touch-icon-57-precomposed.png">

<style>
body {
	background-image: url('img/bk10.jpg');
	background-size: cover;
	background-attachment: fixed;
	min-height: 700px;
	font-family: 'Lato', sans-serif;
}

.minor_fields {
	display: none
}
</style>

</head>

<body>
	<header id="header">
		<div class="container-fluid">

			<div id="logo" class="pull-left">
				<!-- <h1><a href="index.html" class="scrollto">PolicyMaster.com</a></h1>
         Uncomment below if you prefer to use an image logo -->
				<a href="index"><img src="img/logo.png" alt="" title="" /></a>
			</div>
		</div>
	</header>

	<div class="top-content">

		<div class="inner-bg">
			<div class="container">
				<div class="row">
					<div class="col-sm-8 col-sm-offset-2 text"></div>
				</div>
				<div class="row">
					<div class="col-sm-6 col-sm-offset-3 form-box">

						<form role="form" action="Servlet3" method="post"
							class="registration-form">
							<fieldset>
								<div class="Car-top">
									<div class="form-top">
										<div class="form-top-left">


											<h2>Proposal Form</h2>
											<h3>Step 1 / 3</h3>
										</div>
										<div class="form-top-right">
											<i class="fa fa-user"></i>
										</div>
									</div>


								</div>
								<div class="form-bottom">
									<div class="form-group">

										<label class="Car-text"> Title : </label>
										<div class=" wthree-name">
											<span class="agile_sub-label"> <select
												class="title day" name="title" required="Required">

													<option selected value="">Choose</option>
													<option value="Mr.">Mr.</option>
													<option value="Mrs.">Mrs.</option>
													<option value="Miss.">Miss.</option>
											</select>
											</span>
										</div>
									</div>
									<div class="clearfix"></div>



									<div class="form-group">

										<label class="Car-text">Owner's Full Name :</label> <input
											type="text" class="Owner_Name" name="Owner_Name"
											value="<%=(String) session.getAttribute("Fullname")%>"
											placeholder="Owner's Full Name" required>

									</div>




									<div class="form-group">
										<div class="Car-text">
											<label class="Car-text">Phone number : </label> <input
												type="text" name="pno"
												value="<%=(String) session.getAttribute("Mobile")%>"
												placeholder="PhoneNumber" pattern="[1-9]{1}[0-9]{9}"
												title="Enter 10 digit mobile number" required=" " />
											<div class="check">
												<div class="inside"></div>
											</div>
										</div>

									</div>
									<div class="form-group">
										<div class="Car-text">
											<label class="Car-text">Email :</label> <input type="text"
												name="email"
												value="<%=(String) session.getAttribute("Email")%>"
												placeholder="Email" required="" />



											<div class="check">
												<div class="inside"></div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="Car-text">Registration Address :</label> <input
											type="text" name="Registration_Address"
											value="<%=(String) session.getAttribute("FullAddress")%>"
											placeholder="Registration Address" required="" />

									</div>

									<div class="form-group">

										<label class="Car-text"> Your Birth of Date : </label>
										<div class="Car-text wthree-name">
											<span class="agile_sub-label"> <select name="day"
												class="day" required="">
													<option value="">Day</option>
													<option value="1">1</option>
													<option value="2">2</option>
													<option value="3">3</option>
													<option value="4">4</option>
													<option value="5">5</option>
													<option value="6">6</option>
													<option value="7">7</option>
													<option value="8">8</option>
													<option value="9">9</option>
													<option value="10">10</option>
													<option value="11">11</option>
													<option value="12">12</option>
													<option value="13">13</option>
													<option value="14">14</option>
													<option value="15">15</option>
													<option value="16">16</option>
													<option value="17">17</option>
													<option value="18">18</option>
													<option value="19">19</option>
													<option value="20">20</option>
													<option value="21">21</option>
													<option value="22">22</option>
													<option value="23">23</option>
													<option value="24">24</option>
													<option value="25">25</option>
													<option value="26">26</option>
													<option value="27">27</option>
													<option value="28">28</option>
													<option value="29">29</option>
													<option value="30">30</option>
													<option value="31">31</option>
											</select>

											</span> <span class="agile_sub-label xxx"> <select
												name="month" class="month" required="">
													<option value="">Month</option>
													<option value="01">January</option>
													<option value="02">February</option>
													<option value="03">March</option>
													<option value="04">April</option>
													<option value="05">May</option>
													<option value="06">June</option>
													<option value="07">July</option>
													<option value="08">August</option>
													<option value="09">September</option>
													<option value="10">October</option>
													<option value="11">November</option>
													<option value="12">December</option>
											</select>

											</span> <span class="agile_sub-label"> <select name="year"
												class="year" required="">
													<option value="">Year</option>
													<option value="2000">2000</option>
													<option value="1999">1999</option>
													<option value="1998">1998</option>
													<option value="1997">1997</option>
													<option value="1996">1996</option>
													<option value="1995">1995</option>
													<option value="1994">1994</option>
													<option value="1993">1993</option>
													<option value="1992">1992</option>
													<option value="1991">1991</option>
													<option value="1990">1990</option>
													<option value="1989">1989</option>
													<option value="1988">1988</option>
													<option value="1987">1987</option>
													<option value="1986">1986</option>
													<option value="1985">1985</option>
													<option value="1984">1984</option>
													<option value="1983">1983</option>
													<option value="1982">1982</option>
													<option value="1981">1981</option>
													<option value="1980">1980</option>
													<option value="1979">1979</option>
													<option value="1978">1978</option>
													<option value="1977">1977</option>
													<option value="1976">1976</option>
													<option value="1975">1975</option>
													<option value="1974">1974</option>
													<option value="1973">1973</option>
													<option value="1972">1972</option>
													<option value="1971">1971</option>
													<option value="1970">1970</option>
											</select>
											</span>
										</div>

										<button type="button" class="btn btn-next page1">Next</button>

									</div>
								</div>
							</fieldset>
							<fieldset>
								<div class="Car-top">
									<div class="form-top">
										<div class="form-top-left">
											<h2>Proposal Form</h2>
											<h3>Step 2 / 3</h3>
										</div>
										<div class="form-top-right">
											<i class="fa fa-user"></i>
										</div>
									</div>

								</div>
								<div class="Car-bottom">
									<div class="form-bottom">
										<label class="Car-text">Nominee Name : </label> <input
											type="text" name="nomines_name"
											placeholder=" Name of Nominee" required="" />
										<div class="form-group">
											<div class="wthree-text"></div>
											<div class="form-group">
												<label class="Car-text">Nominee Relation : </label>

												<!-- <input type="name" name="nomines_relation"  placeholder=" Nominee's Relation" required=""/> -->
												<select class="age" name="nomines_relation" required="">
													<option value="">Select</option>
													<option value="Spouse">Spouse</option>
													<option value="Father">Father</option>
													<option value="Mother">Mother</option>
													<option value="Brother">Brother</option>
													<option value="Sister">Sister</option>
													<option value="Son">Son</option>
													<option value="Daughter">Daughter</option>
													<option value="Other">Other</option>
												</select>

											</div>

											<div class="Carr">
												<label class="Car-text">Nominee's Age : </label> <select
													name="selectage" class="age" id="ddmenu" required="">
													<option value="">Age</option>
													<option value="1">1</option>
													<option value="2">2</option>
													<option value="3">3</option>
													<option value="4">4</option>
													<option value="5">5</option>
													<option value="6">6</option>
													<option value="7">7</option>
													<option value="8">8</option>
													<option value="9">9</option>
													<option value="10">10</option>
													<option value="11">11</option>
													<option value="12">12</option>
													<option value="13">13</option>
													<option value="14">14</option>
													<option value="15">15</option>
													<option value="16">16</option>
													<option value="17">17</option>
													<option value="18">18</option>
													<option value="19">19</option>
													<option value="20">20</option>
													<option value="21">21</option>
													<option value="22">22</option>
													<option value="23">23</option>
													<option value="24">24</option>
													<option value="25">25</option>
													<option value="26">26</option>
													<option value="27">27</option>
													<option value="28">28</option>
													<option value="29">29</option>
													<option value="30">30</option>
													<option value="31">31</option>
													<option value="32">32</option>
													<option value="33">33</option>
													<option value="34">34</option>
													<option value="35">35</option>
													<option value="36">36</option>
													<option value="37">37</option>
													<option value="38">38</option>
													<option value="39">39</option>
													<option value="40">40</option>
													<option value="41">41</option>
													<option value="42">42</option>
													<option value="43">43</option>
													<option value="44">44</option>
													<option value="45">45</option>
													<option value="46">46</option>
													<option value="47">47</option>
													<option value="48">48</option>
													<option value="49">49</option>
													<option value="50">50</option>
													<option value="51">51</option>
													<option value="52">52</option>
													<option value="53">53</option>
													<option value="54">54</option>
													<option value="55">55</option>
													<option value="56">56</option>
													<option value="57">57</option>
													<option value="58">58</option>
													<option value="59">59</option>
													<option value="60">60</option>
													<option value="61">61</option>
													<option value="62">62</option>
													<option value="63">63</option>
													<option value="64">64</option>
													<option value="65">65</option>
													<option value="66">66</option>
													<option value="67">67</option>
													<option value="68">68</option>
													<option value="69">69</option>
													<option value="70">70</option>
													<option value="71">71</option>
													<option value="72">72</option>
													<option value="73">73</option>
												</select> </span>
												<div class="minor_fields">
													Appointee Name : <input type="name" name="appointee_name"
														placeholder="Name of the Appointee for this insurance"><br>
													<br> Appointee Relation : <input type="name"
														name="appointee_relation"
														placeholder="How is the Appointee related to the Nominee">
												</div>
												<br>
												<script
													src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.4/jquery.js"></script>
												<script>
													// $('.minor_fields').slideUp();
													$(document)
															.ready(
																	function() {
																		getage($(
																				'#ddmenu')
																				.val());
																		function getage(
																				age) {
																			// var age = $(this).val();
																			if (age < 18
																					&& age != "") {
																				$(
																						'.minor_fields')
																						.show();
																			} else {
																				$(
																						'.minor_fields')
																						.hide();
																			}
																		}
																		$(
																				'#ddmenu')
																				.change(
																						function() {
																							getage($(
																									this)
																									.val());
																						})
																	})
												</script>
												<%try{ %>
												<%
													User userpoj = (User) session.getAttribute("userpoj");
												%>
												<label class="Car-text">Registration Number : </label> <input
													type="text" name="Car_RegNo" onkeydown="upperCaseF(this)"
													id="cartextbox" value="<%=userpoj.getRegNo()%>"
													placeholder=" E.G.: DL01AB1234"
													pattern="^[a-z|A-Z]{2}[0-9]{1,2}[a-z|A-Z]{1,2}[0-9]{1,4}$"
													required="" />
												<%} catch(Exception e){
												  }%>
											</div>

										</div>
										<button type="button" class="btn btn-previous">Previous</button>
										<button type="button" class="btn btn-next page2">Next</button>
									</div>
							</fieldset>

							<fieldset>
								<div class="Car-top">
									<div class="form-top">
										<div class="form-top-left">
											<h2>Proposal form</h2>
											<h3>Step 3/ 3</h3>
										</div>
										<div class="form-top-right">
											<i class="fa fa-user"></i>
										</div>
									</div>
								</div>
								<div class="Car-bottom">
									<div class="form-bottom">
										<div class="form-group">

											<label class="Car-text"> PAN Card No. : </label> <input
												type="text" name="pan" required=""
												placeholder="Enter PAN Card"
												pattern="^[a-z|A-Z]{5}[0-9]{4}[a-z|A-Z]{1}$" /> <label
												class="Car-text"> Engine Number : </label> <input
												type="text" name="engine_number" required=""
												placeholder=" Engine Number" pattern="[0-9|a-z|A-Z]{6,}"
												title="Enter atleast 6 digit engine number" /> <label
												class="Car-text"> Chassis Number : </label> <input
												type="text" name="chassis_number" required=""
												placeholder=" Chassis Number" pattern="[0-9|a-z|A-Z]{6,}"
												title="Enter atleast 6 digit chassis number" />

											<div class="w3ls-text w3ls-name">
												<!-- <span class="agile_sub-label xxx"> <label
													class="Car-text"> Month : </label> 
													<select name="month1" class="month" required="">
														<option>Month</option>
														<option value="01">January</option>
														<option value="02">February</option>
														<option value="03">March</option>
														<option value="04">April</option>
														<option value="05">May</option>
														<option value="06">June</option>
														<option value="07">July</option>
														<option value="08">August</option>
														<option value="09">September</option>
														<option value="10">October</option>
														<option value="11">November</option>
														<option value="12">December</option>
												</select>
												</span> 
												<span class="agile_sub-label"> <label
													class="Car-text"> Year : </label> <select name="year1"
													class="year" required="">
														<option>Year</option>
														<option value="2017">2017</option>
														<option value="2018">2018</option>
												</select>
												</span>  -->
												<label class="Car-text"> On an average, How long do
													you drive your car/bike in a day? :</label> <span
													class="agile_sub-label"> <select name="selectime"
													class="Car" required="">
														<option value="">Select</option>
														<option value="Less than 30 minutes">Less than 30
															minutes</option>
														<option value="minute to 1 hour">minute to 1 hour</option>
														<option value="1 to 2 hour">1 to 2 hour</option>
														<option value="more than  2 hour">more than 2
															hour</option>
												</select>
												</span> <label class="Car-text">How long have you been
													driving cars/bike? :</label> <span class="agile_sub-label">
													<select name="driving" class="Car" required="">
														<option value="">Select</option>
														<option value="up to 1 year">up to 1 year</option>
														<option value="1 to 2 year">1 to 2 year</option>
														<option value="2 to 3  year">2 to 3 year</option>
														<option value="3 to 4  year">3 to 4 year</option>
														<option value="4 to 5  year">4 to 5 year</option>
														<option value="5 to 6  year">5 to 6 year</option>
														<option value="6 to 7 year">6 to 7 year</option>
														<option value="7 to 8  year">7 to 8 year</option>
														<option value="8 to 9  year">8 to 9 year</option>
														<option value="9 to 10  year">9 to 10 year</option>
														<option value="Above 10  year">Above 10 year</option>

												</select>
												</span> <label class="Car-text"> Where do you park your
													car/bike in the evening? :</label> <span class="agile_sub-label">
													<select name="evening" class="Car" required="">
														<option value="">Select</option>
														<option>in the society parking with closed roof</option>
														<option>in the society with no roof</option>
														<option>in the house parking with closed roof</option>
														<option>in the house parking with no roof</option>
														<option>outside the gate on the road</option>

												</select>
												</span><br>
											</div>



											<div class="form-group">
												<div class="wthree-text">
													<label class="Car-text">if car/bike is financed? :</label>
													<ul class="radio-w3ls">
														<li><input type="radio" class="is_financed1" id="Yes"
															name="financed" Value="Yes" required=""> <label
															for="Yes">Yes</label></li>
														<li><input type="radio" class="is_financed2" id="No"
															name="financed" Value="No" required=""> <label
															for="No">No</label>
															<!-- <div class="check">
																<div class="inside"></div>
															</div> --></li>
													</ul>
												</div>
											</div>

											<%
												String FIN_CATEGORY_CODE = "00";
												String FINANCIERNAME = null;
												List<String> al = new ArrayList<String>();
												try {
													//String FINANCIERNAME="kashi motors";
													Connection con = Db.myGetConnection();
													String query1 = "select FINANCIERNAME from royalsundram where FIN_CATEGORY_CODE like ?";
													PreparedStatement stmt = con.prepareStatement(query1);
													stmt.setString(1, FIN_CATEGORY_CODE + "%");

													ResultSet rs = stmt.executeQuery();
													while (rs.next()) {

														FINANCIERNAME = rs.getString("FINANCIERNAME");

														al.add(FINANCIERNAME);
													}
													rs.close();
													stmt.close();
													con.close();
												} catch (SQLException e) {
													e.printStackTrace();
												} catch (NullPointerException e) {
													e.printStackTrace();
												}
											%>
											<div class="form-group">
												<div id="financier_div" class="w3ls-text w3ls-name">
													<span class="agile_sub-label"> <label
														class="Car-text">Financier :</label> <select class="Car"
														name="financiername" required="">
															<option value="Financier Name">Financier Name</option>
															<%
																for (String financiername : al) {
															%>

															<option value="<%=financiername%>"><%=financiername%></option>
															<%
																}
															%>
													</select>
													</span>

													<!-- <br>
												<label class="Car-text">Financier City:</label><br>
												<br>
												<input type="text"  name="financed">
 -->
												</div>
												<div id="financier_div1" class="wthree-text">
													<label class="Car-text">Financier City :</label><br> <input
														type="text" name="financercity">
												</div>
											</div>
											



											



											<button type="button" class="btn btn-previous">Previous</button>
											<button type="submit" class="btn btn-page3">Save&View</button>

										</div>
									</div>
								</div>
							</fieldset>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


<script>
												// $('.minor_fields').slideUp();
												$(document)
														.ready(

																function() {
																	$(
																			'#financier_div')
																			.hide();
																	$(
																			'#financier_div1')
																			.hide();
																	$(
																			'.is_financed2')
																			.click(
																					function() {

																						$(
																								'#financier_div')
																								.hide();
																						$(
																								'#financier_div1')
																								.hide();

																					})
																	$(
																			'.is_financed1')
																			.click(
																					function() {

																						$(
																								'#financier_div')
																								.show();
																						$(
																								'#financier_div1')
																								.show();
																					})

																})
											</script>



	<script>
		function validate_step_1() {
			var title = $(".title").val();
			var name = $(".Owner_Name").val();

			if (title == "null" || title == "") {
				alert("Please select the title");
				$(".title").focus();
				return;
			}
			if (name == "null" || name == "") {
				alert("Please select the name");
				$(".Owner_Name").val("").focus();
				return;
			}
			return true;
		}
		function validate_step_2() {
			alert("calling step 2");
			return true;
			/* var title = $(".title").val();
			var name = $(".Owner_Name").val();
			
			if(title == "null" || title == ""){
				alert("Please select the title"); $(".title").focus(); return ;
			}
			if(name == "null" || name == ""){
				alert("Please select the name"); $(".Owner_Name").val("").focus(); return ;
			} 
			return true; */
		}
	</script>


	<script src="assets1/js/jquery-1.11.1.min.js"></script>
	<script src="assets1/bootstrap/js/bootstrap.min.js"></script>
	<script src="assets1/js/jquery.backstretch.min.js"></script>
	<script src="assets1/js/retina-1.1.0.min.js"></script>
	<script src="assets1/js/scripts.js"></script>
	<!-- <script src="assets1/js/validate.js"></script> -->


	</script>


	<!-- <script src="assets/js/placeholder.js"></script>
        <![endif] -->
	<script>
		function upperCaseF(a) {
			setTimeout(function() {
				a.value = a.value.toUpperCase();
			}, 1);
		}
	</script>

</body>

</html>