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
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.js"
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
	background-image: url('assets/img/backgrounds/1.jpg');
	background-size: cover;
	background-attachment: fixed;
	min-height: 700px;
	font-family: 'Lato', sans-serif;
}
</style>

<!--alert box  -->
<script>
	function myFunction() {
		alert("Please note - based on your inputs, the selected plan can be made available only after a medical examination. Please click 'OK' to proceed with the same selection, or 'Cancel' to change plan selection.");
	}
</script>

<!--  -->

</head>
<body>
	<!-- Add your site or application content here -->

	<!-- Accordion -->
	<div class="container-fluid bg-gray" id="accordion-style-1">
		<div class="container">
			<section>
				<div class="row">
					<div class="col-12">
						<h1 class="text-green mb-4 text-center">Health Insurance</h1>
					</div>
					<div class="col-md-12">
					<form action="MemberDetails" method="post">
						<div class="accordion" id="accordionExample">
						<%
													apollo_proposal_pojo ap = (apollo_proposal_pojo) session.getAttribute("ap");
													String s = (String) session.getAttribute("members");
													String a[] = s.split(",");
												%>

							<div class="card">
								<div class="card-header" id="headingOne">
									<h5 class="mb-0">
										<button class="btn btn-link btn-block text-left" type="button"
											data-toggle="collapse" data-target="#collapseOne"
											aria-expanded="true" aria-controls="collapseOne">
											<i class="fa fa-medkit  main"></i><i
												class="fa fa-angle-double-right mr-3"></i>Insured Members
										</button>
									</h5>
								</div>

								<div id="collapseOne" class="collapse show fade"
									aria-labelledby="headingOne" data-parent="#accordionExample">
									<div class="card-body">
										<div class="col-md-12">
											

												


												<fieldset class="textborder">

													<%
														for (int i = 0; i < a.length; i++) {
															if (a[i] != null) {
													%>
													<legend class="textborder btn btn-danger"><%=a[i]%></legend>
													<div class="row">
														<div class="container">
															<div class="col-md-12">
																<div class="col-md-2 fleft">
																	<label for="exampleAmount"></label>
																	<div class="input-group">
																		<div class="input-group-prepend">
																			<span class="input-group-text"><i
																				class="fa fa-graduation-cap fa-2x"></i></span>
																		</div>
																		<select name="salutation" id="salutation"
																			required="required">
																			<option>Select</option>
																			<option value="Mr.">Mr.</option>
																			<option value="Mrs.">Mrs.</option>
																			<option value="Miss.">Miss.</option>
																			<!-- <option value="MASTER">Master</option>
																			<option value="MASTER">Baby boy</option>
																			<option value="BABY">Baby girl</option> -->
																		</select>
																	</div>
																</div>
																<div class="col-md-5 fleft">
																	<label for="exampleAmount"></label>
																	<div class="input-group">
																		<div class="input-group-prepend">
																			<span class="input-group-text"><i
																				class="fa fa-user fa-2x"></i></span><label
																				class="label_text">Name</label>
																		</div>
																		<input type="text" class="form-control" id="name"
																			name="fullname" placeholder="" required="required">
																	</div>
																</div>
																<div class="col-md-5 fleft">
																	<label for=""></label>
																	<div class="input-group">
																		<div class="input-group-prepend">
																			<span class="input-group-text"><i
																				class="fa fa-birthday-cake fa-2x"></i></span><label
																				class="label_text">DOB</label>
																		</div>
																		<input type="date" name="dob" id="dob"
																			placeholder="DOB" required="required">
																	</div>
																</div>
																<div class="clearfix"></div>
																<br>
																<div class="col-md-4 fleft">
																	<label for="exampleAmount"></label>
																	<div class="input-group">
																		<div class="input-group-prepend">
																			<span class="input-group-text"><i
																				class="fa fa-briefcase fa-2x"></i></span><label
																				class="label_text">Occupation</label>
																		</div>
																		<select name="occupation" id="occupation"
																			required="required">
																			<option>Select</option>
																			<option value="1">Salaried</option>
																			<option value="2">Self Employed</option>
																			<option value="3">Student</option>
																			<option value="4">Retired</option>
																			<option value="5">House Wife</option>
																		</select>
																	</div>
																</div>
																<div class="col-md-4 fleft">
																	<label for="exampleAmount"></label>
																	<div class="input-group">
																		<div class="input-group-prepend">
																			<span class="input-group-text"><i
																				class="fa fa-life-ring fa-2x"></i></span><label
																				class="label_text">Marital Status</label>
																		</div>
																		<select name="maritalstatus" id="maritalstatus"
																			required="required">
																			<option>Select</option>
																			<option value="1">Married</option>
																			<option value="2">Single</option>
																			<option value="3">Widowed</option>
																			<option value="4">Divorced</option>
																			<option value="5">Separated</option>
																		</select>
																	</div>
																</div>
																<div class="col-md-4 fleft">
																	<label for="exampleAmount"></label>
																	<div class="input-group">
																		<div class="input-group-prepend">
																			<span class="input-group-text"><i
																				class="fa fa-ruler-vertical fa-2x"></i></span><label
																				class="label_text">Height</label>
																		</div>
																		<select name="height" id="height" required="required">
																			<option>Feet</option>
																			<option value="1">1feet</option>
																			<option value="2">2feet</option>
																			<option value="3">3feet</option>
																			<option value="4">4feet</option>
																			<option value="5">5feet</option>
																			<option value="6">6feet</option>
																			<option value="7">7feet</option>
																			<option value="8">8feet</option>
																		</select> <select name="height1" id="height"
																			required="required">
																			<option>Inch</option>
																			<option value="8">0inch</option>
																			<option value="1">1inch</option>
																			<option value="2">2inch</option>
																			<option value="3">3inch</option>
																			<option value="4">4inch</option>
																			<option value="5">5inch</option>
																			<option value="6">6inch</option>
																			<option value="7">7inch</option>
																			<option value="8">8inch</option>
																			<option value="9">9inch</option>
																			<option value="10">10inch</option>
																			<option value="11">11inch</option>
																		</select>

																	</div>
																</div>
																<div class="col-md-3 fleft">
																	<label for="exampleAmount"></label>
																	<div class="input-group">
																		<div class="input-group-prepend">
																			<span class="input-group-text"><i
																				class="fa fa-weight fa-2x"></i> </span> <label
																				class="label_text">Weight (in Kg)</label>
																		</div>
																		<input type="text" class="form-control" name="weight"
																			id="weight" placeholder="KG" pattern="[1-9]{1,2,3}"
																			title="please enter weight betwwen 1 to 200"
																			required="required">
																	</div>
																</div>
															</div>
														</div>
													</div>
													<%
														}
														}
													%>

												</fieldset>

												<button class="btn btn-lg btn-success pull-right"
													id="savenextsubmmit1" type="button" data-toggle="collapse"
													data-target="#collapseTwo" aria-expanded="false"
													aria-controls="collapseTwo">Save & Next</button>
										</div>
									</div>

								</div>
							</div>
							<div class="card">
								<div class="card-header" id="headingTwo">
									<h5 class="mb-0">
										<button class="btn btn-link collapsed btn-block text-left"
											type="button" data-toggle="collapse"
											data-target="#collapseTwo" aria-expanded="false"
											aria-controls="collapseTwo">
											<i class="fa fa-plus main"></i><i
												class="fa fa-angle-double-right mr-3"></i>Address &
											Communication
										</button>
									</h5>
								</div>
								<div id="collapseTwo" class="collapse fade"
									aria-labelledby="headingTwo" data-parent="#accordionExample">
									<fieldset class="textborder">
										<div class="row">
											<div class="container">
												<div class="col-md-12">
													<div class="col-md-5 fleft">
														<label for="exampleAmount"></label>
														<div class="input-group">
															<div class="input-group-prepend">
																<span class="input-group-text"><i
																	class="fa fa-mobile-alt fa-2x"></i></span><label
																	class="label_text">Mobile</label>
															</div>
															<input type="text" class="form-control" name="mobile"  value="<%=ap.getMobile() %>"
																id="mobile" placeholder="phone number"
																pattern="[1-9]{1}[0-9]{9}"
																title="Enter 10 digit mobile number" required=" " />
														</div>
													</div>
													<div class="col-md-5 fleft">
														<label for="exampleAmount"></label>
														<div class="input-group">
															<div class="input-group-prepend">
																<span class="input-group-text"><i
																	class="fa fa-envelope fa-2x"></i></span><label
																	class="label_text">Email Id</label>
															</div>
															<input type="email" id="email" name="email" value="<%=ap.getEmail() %>"
																class="form-control" placeholder="enter your e-mail"
																required="" />
														</div>
													</div>
													<div class="col-md-5 fleft">
														<label for="exampleAmount"></label>
														<div class="input-group">
															<div class="input-group-prepend">
																<span class="input-group-text"><i
																	class="fa fa-map-marker-alt fa-2x"></i></span><label
																	class="label_text">Address</label>
															</div>
															<input type="text" class="form-control" name="address"
																id="address" placeholder="Address" required="required">
														</div>
													</div>
													<div class="col-md-5 fleft">
														<label for=""></label>
														<div class="input-group">
															<div class="input-group-prepend">
																<span class="input-group-text"><i
																	class="fa fa-hotel fa-2x"></i></span><label class="label_text">
																	City </label>
															</div>
															<input type="text" class="form-control" name="city" value="<%=ap.getCity() %>"
																id="city" placeholder="City" required="required">
														</div>
													</div>

													<div class="col-md-5 fleft">
														<label for="exampleAmount"></label>
														<div class="input-group">
															<div class="input-group-prepend">
																<span class="input-group-text"><i
																	class="fa fa-globe-americas fa-2x"></i></span><label
																	class="label_text">State</label>
															</div>
															<input type="text" class="form-control" name="state"
																id="state" placeholder="State" required="required">
														</div>
													</div>
													<div class="col-md-5 fleft">
														<label for="exampleAmount"></label>
														<div class="input-group">
															<div class="input-group-prepend">
																<span class="input-group-text"><i
																	class="fa fa-digital-tachograph fa-2x"></i></span><label
																	class="label_text">Pin Code</label>
															</div>
															<input type="text" class="form-control" name="pincode"
																id="pincode" placeholder="Pin code" id="pincode"
																placeholder="pincode" pattern="[0-9]{6}"
																title="Enter number" required="required">
														</div>
													</div>
													
												</div>
											</div>
										</div>


									</fieldset>
									<button class="btn btn-lg btn-success pull-right"
										id="savenextsubmmit2" type="button" data-toggle="collapse"
										data-target="#collapseThree" aria-expanded="false"
										aria-controls="collapseTwo">Save & Next</button>
										
								</div>
							</div>
							<div class="card">
								<div class="card-header" id="headingThree">
									<h5 class="mb-0">
										<button class="btn btn-link collapsed btn-block text-left"
											type="button" data-toggle="collapse"
											data-target="#collapseThree" aria-expanded="false"
											aria-controls="collapseThree">
											<i class="fa fa-expeditedssl main"></i><i
												class="fa fa-angle-double-right mr-3"></i>Basic Medical
											History
										</button>
									</h5>
								</div>
								<div id="collapseThree" class="collapse fade"
									aria-labelledby="headingThree" data-parent="#accordionExample">
									<div class="card-body">

										<div class="input-group-prepend">
											<span class="input-group-text"><i
												class="fa fa-question-circle fa-2x"></i></span><label
												class="label_text">Do you wish to port your existing
												policy?</label>
										</div>
										Do you wish to port your existing policy? <br> <input
											class="saveandnext savecheckbox" type="checkbox"
											id="checkbox1" name="term&conmditions" value="" /> No for
										all members to all medical questions <br> <input
											class="saveandnext savecheckbox" type="checkbox"
											name="term&conmditions" value="" /> No for all members <br>
										<input class="savecheckbox" type="checkbox"
											name="term&conmditions" value="" /> Yes for all members
										<div class="text-danger">
											<label class="label label-danger" id="required_checkbox"
												style="display: none;">Required</label>
										</div>
									</div>
									<!-- <button class="btn btn-lg btn-success pull-right"
						type="button" onclick="myFunction()"  ondata-toggle="collapse"
						data-target="#collapseFour" aria-expanded="false
						aria-controls="collapseThree">Save & Next</button> -->
									<button id="saveandnext"
										class="btn btn-lg btn-success pull-right" type=""
										ondata-toggle="collapse" data-target="#collapseFour"
										aria-expanded="false"
						aria-controls="collapseFour">Save
										& Next</button>
								</div>
							</div>
							<div id="myid" class="card">
								<div class="card-header" id="headingThree">
									<h5 class="mb-0">
										<button id="nominee_details" class="btn btn-link collapsed btn-block text-left"
											type="button" data-toggle="collapse"
											data-target="#collapseFour" aria-expanded="false"
											aria-controls="collapseFour">
											<i class="fa fa-expeditedssl main"></i><i
												class="fa fa-angle-double-right mr-3"></i>Medical And Life
								Style Questions:
										</button>
									</h5>
								</div>
								<div id="collapseFour" class="collapse fade"
									aria-labelledby="headingFour" data-parent="#accordionExample">

									<fieldset class="textborder">
										<div class="row">
											<div class="container">
												<div class="col-md-12">

													<fieldset class="textborder">
													
													<div class="row">

													<div class="col-md-11">

														<label for="exampleAmount">Section A: Have any of
															the person proposed to be insured ever suffered from are/
															currently suffering from any of the following: </label>
													</div>
													



												</div>
												<div class="row">

													<div class="col-md-1">

														<label for="exampleAmount">Q1: </label>
													</div>
													<div class="col-md-11">
														<label for="exampleAmount">Diabetes</label>
														<br>
														<%
														for (int i = 0; i < a.length; i++) {
															if (a[i] != null) {
													%>
														<input type="checkbox" id="Yes" name="self_disease"
															value="diabetes"><label for="exampleAmount"><%=a[i]%></label> 
															
															<%
														}
														}
													%>
													</div>
													
													
												</div>
												<div class="row">

													<div class="col-md-1">

														<label for="exampleAmount">Q2: </label>
													</div>
													
													<div class="col-md-11">
														<label for="exampleAmount">Thyroid Disorder</label>
														<br>
														<%
														for (int i = 0; i < a.length; i++) {
															if (a[i] != null) {
													%>
														<input type="checkbox" id="Yes" name="self_disease"
															value="diabetes"><label for="exampleAmount"><%=a[i]%></label> 
															
															<%
														}
														}
													%>
													</div>
													
													


												</div>
													<div class="row">

													<div class="col-md-1">

														<label for="exampleAmount">Q3: </label>
													</div>
													
													<div class="col-md-11">
														<label for="exampleAmount">Nervous
															Disorder,Fits,Mental Disorder</label>
														<br>
														<%
														for (int i = 0; i < a.length; i++) {
															if (a[i] != null) {
													%>
														<input type="checkbox" id="Yes" name="self_disease"
															value="diabetes"><label for="exampleAmount"><%=a[i]%></label> 
															
															<%
														}
														}
													%>
													</div>



												</div>	
												<div class="row">

													<div class="col-md-1">

														<label for="exampleAmount">Q4: </label>
													</div>
													
													<div class="col-md-11">
														<label for="exampleAmount">Heart & Circulatory
															Disorders</label>
														<br>
														<%
														for (int i = 0; i < a.length; i++) {
															if (a[i] != null) {
													%>
														<input type="checkbox" id="Yes" name="self_disease"
															value="diabetes"><label for="exampleAmount"><%=a[i]%></label> 
															
															<%
														}
														}
													%>
													</div>
													
													



												</div>
												<div class="row">

													<div class="col-md-1">

														<label for="exampleAmount">Q5: </label>
													</div>
													
													
													<div class="col-md-11">
														<label for="exampleAmount">Respiratory Disorder</label>
														<br>
														<%
														for (int i = 0; i < a.length; i++) {
															if (a[i] != null) {
													%>
														<input type="checkbox" id="Yes" name="self_disease"
															value="diabetes"><label for="exampleAmount"><%=a[i]%></label> 
															
															<%
														}
														}
													%>
													</div>
													
													



												</div>
												<div class="row">

													<div class="col-md-1">

														<label for="exampleAmount">Q6: </label>
													</div>
													
													<div class="col-md-11">
														<label for="exampleAmount">Disorders of the
															stomach including intestine,Kidney, Prostate</label>
														<br>
														<%
														for (int i = 0; i < a.length; i++) {
															if (a[i] != null) {
													%>
														<input type="checkbox" id="Yes" name="self_disease"
															value="diabetes"><label for="exampleAmount"><%=a[i]%></label> 
															
															<%
														}
														}
													%>
													</div>



												</div>
												<div class="row">

													<div class="col-md-1">

														<label for="exampleAmount">Q7: </label>
													</div>
													
													<div class="col-md-11">
														<label for="exampleAmount">Disorder of spine and
															joints</label>
														<br>
														<%
														for (int i = 0; i < a.length; i++) {
															if (a[i] != null) {
													%>
														<input type="checkbox" id="Yes" name="self_disease"
															value="diabetes"><label for="exampleAmount"><%=a[i]%></label> 
															
															<%
														}
														}
													%>
													</div>



												</div>
												
												<div class="row">

													<div class="col-md-1">

														<label for="exampleAmount">Q8: </label>
													</div>
													
													<div class="col-md-11">
														<label for="exampleAmount">Tumour or Cancer</label>
														<br>
														<%
														for (int i = 0; i < a.length; i++) {
															if (a[i] != null) {
													%>
														<input type="checkbox" id="Yes" name="self_disease"
															value="diabetes"><label for="exampleAmount"><%=a[i]%></label> 
															
															<%
														}
														}
													%>
													</div>
													


												</div>
												<div class="row">

													<div class="col-md-1">

														<label for="exampleAmount">Q9: </label>
													</div>
													
													<div class="col-md-11">
														<label for="exampleAmount">Any ongoing diseases or
															ailment requiring surgical or medical treatment</label>
														<br>
														<%
														for (int i = 0; i < a.length; i++) {
															if (a[i] != null) {
													%>
														<input type="checkbox" id="Yes" name="self_disease"
															value="diabetes"><label for="exampleAmount"><%=a[i]%></label> 
															
															<%
														}
														}
													%>
													</div>



												</div>
												
												<div class="row">

													<div class="col-md-1">

														<label for="exampleAmount">Q10: </label>
													</div>
													
													<div class="col-md-11">
														<label for="exampleAmount">Have you or any other
															member proposed to be insured under this policy sought
															medical advice or undergone any treatment medical or
															surgical in past 5 years due to any of the
															diseases/conditions listed above or otherwise or attended
															follow up for any diseases/condition/ailment/addiction
															(except for infrequent common illness for example
															fever,common,cold,loose motions,cough and
															cold,headaches,acidity)?</label>
														<br>
														<%
														for (int i = 0; i < a.length; i++) {
															if (a[i] != null) {
													%>
														<input type="checkbox" id="Yes" name="self_disease"
															value="diabetes"><label for="exampleAmount"><%=a[i]%></label> 
															
															<%
														}
														}
													%>
													</div>



												</div>
												<div class="row">

													<div class="col-md-1">

														<label for="exampleAmount">Q11: </label>
													</div>
													
													<div class="col-md-11">
														<label for="exampleAmount">Is any of the insured
															pregnant? If yes please mention the expected date of
															delivery.</label>
														<br>
														<%
														for (int i = 0; i < a.length; i++) {
															if (a[i] != null) {
													%>
														<input type="checkbox" id="Yes" name="self_disease"
															value="diabetes"><label for="exampleAmount"><%=a[i]%></label> 
															
															<%
														}
														}
													%>
													</div>


												</div>
															<div class="card-body">
											<div class="col-md-12">

												<div class="row">

													<div class="col-md-4">

														<label for="exampleAmount">Section B: Does any
															person proposed to be insured smoke or consume guthka/Pan
															masala or alcohol. If yes, please indicate the name and
															quantity per week: </label>
													</div>
													<div class="col-md-2">
														<label for="exampleAmount">Alcohol (30ml pegs of
															hard liquar/bottles of beer/glass of wines)</label>
													</div>
													<div class="col-md-2">
														<label for="exampleAmount">Smoke <br> (No. of
															Cigarette/bidi sticks)
														</label>
													</div>
													<div class="col-md-2">
														<label for="exampleAmount">Pan Masala/Guthka(No of
															pouches)</label>
													</div>
													<div class="col-md-2">
														<label for="exampleAmount">others</label>
													</div>



												</div>
											</div>


										</div>	
										
										<div class="card-body">
											<div class="col-md-12">

												<div class="row">
												<%
														for (int i = 0; i < a.length; i++) {
															if (a[i] != null) {
													%>
													<div class="col-md-4">
													<label for="exampleAmount"><%=a[i]%></label>
													</div>
														
													
													<div class="col-md-2">
														<input type="text" placeholder=""> </br>
													</div>
													<div class="col-md-2">
														<input type="text" placeholder=""></br>
													</div>
													<div class="col-md-2">
														<input type="text" placeholder=""></br>
													</div>
													<div class="col-md-2">
														<input type="text" placeholder="" style="size: 20px;">
													</div>
													
													
														
															<%
														}
														}
													%>
														

												</div>
											</div>


										</div>
										
										
											
											</fieldset>
											</div>
										</div>


									</fieldset>

									<button class="btn btn-lg btn-success pull-right" 
									id="savenextsubmmit3" type="button"
										data-toggle="collapse" data-target="#collapseFive"
										aria-expanded="false
						aria-controls="collapseThree">Save
										& Next</button>
								</div>
							</div>

							<!-- <div class="card">
								<div class="card-header" id="headingFour">
									<h5 class="mb-0">
										<button id="nominee_details"
											class="btn btn-link collapsed btn-block text-left"
											type="button" data-toggle="collapse"
											data-target="#collapseFour" aria-expanded="false"
											aria-controls="collapseFour">
											<i class="fa fa-envelope main"></i><i
												class="fa fa-angle-double-right mr-3"></i>Nominee & Other
											Details
										</button>
									</h5>
								</div>
								<div id="collapseThree" class="collapse fade"
									aria-labelledby="headingThree" data-parent="#accordionExample">
									<div class="card-body">

										<div class="input-group-prepend">
											<span class="input-group-text"><i
												class="fa fa-question-circle fa-2x"></i></span><label
												class="label_text">Do you wish to port your existing
												policy?</label>
										</div>
										Do you wish to port your existing policy? <br> <input
											class="saveandnext savecheckbox" type="checkbox"
											id="checkbox1" name="term&conmditions" value="" /> No for
										all members to all medical questions <br> <input
											class="saveandnext savecheckbox" type="checkbox"
											name="term&conmditions" value="" /> No for all members <br>
										<input class="savecheckbox" type="checkbox"
											name="term&conmditions" value="" /> Yes for all members
										<div class="text-danger">
											<label class="label label-danger" id="required_checkbox"
												style="display: none;">Required</label>
										</div>
									</div>
									<button class="btn btn-lg btn-success pull-right"
						type="button" onclick="myFunction()"  ondata-toggle="collapse"
						data-target="#collapseFour" aria-expanded="false
						aria-controls="collapseThree">Save & Next</button>
									<button id="saveandnext"
										class="btn btn-lg btn-success pull-right" type=""
										ondata-toggle="collapse" data-target="#collapseFour"
										aria-expanded="false
						aria-controls="collapseThree">Save
										& Next</button>
								</div>
							</div> -->


							<div class="card">
								<div class="card-header" id="headingFour">
									<h5 class="mb-0">
										<button id=""
											class="btn btn-link collapsed btn-block text-left"
											type="button" data-toggle="collapse"
											data-target="#collapseFive" aria-expanded="false"
											aria-controls="collapseFive">
											<i class="fa fa-envelope main"></i><i
												class="fa fa-angle-double-right mr-3"></i>Nominee & Other
											Details
										</button>
									</h5>
								</div>
								<div id="collapseFive" class="collapse fade"
									aria-labelledby="headingFive" data-parent="#accordionExample">

									<fieldset class="textborder">
										<div class="row">
											<div class="container">
												<div class="col-md-12">

													<div class="col-md-5 fleft">
														<label for="exampleAmount"></label>
														<div class="input-group">
															<div class="input-group-prepend">
																<span class="input-group-text"><i
																	class="fa fa-graduation-cap fa-2x"></i></span>
															</div>
															<select name="nomsalutation" id="nomsalutation"
																required="required">
																<option>Select</option>
																<option value="Mr.">Mr.</option>
																<option value="Mrs.">Mrs.</option>
																<option value="Miss.">Miss.</option>
																<option value="MASTER">master</option>
																<option value="MASTER">baby boy</option>
																<option value="BABY">baby girl</option>
																
															</select>
														</div>
													</div>
													
													<div class="col-md-5 fleft">
																	<label for="exampleAmount"></label>
																	<div class="input-group">
																		<div class="input-group-prepend">
																			<span class="input-group-text"><i
																				class="fa fa-user fa-2x"></i></span><label
																				class="label_text">Name</label>
																		</div>
																		<input type="text"  name="nomname" class="form-control" id="nomname"
																			placeholder="" required="required">
																	</div>
																</div>
																
																
																<div class="col-md-5 fleft">
																	<label for="exampleAmount"></label>
																	<div class="input-group">
																		<div class="input-group-prepend">
																			<span class="input-group-text"><i
																				class="fa fa-user fa-2x"></i></span><label
																				class="label_text">Nominee Relation</label>
																		</div>
																		<select name="nomrelation" id="nomrelation"
																			required="required">
																			<option>Select</option>
																			<option value="Husband">Husband</option>
																			<option value="Wife">Wife</option>
																			<option value="Brother">Brother</option>
																			<option value="Sister">Sister</option>
																			<option value="Son">Son </option>
																			<option value="Daughter">Daughter </option>
																		</select>
																	</div>
																</div>
																
																
																<div class="col-md-5 fleft">
														<label for="exampleAmount"></label>
														<div class="input-group">
															<div class="input-group-prepend">
																<span class="input-group-text"><i
																	class="fa fa-mobile-alt fa-2x"></i></span><label
																	class="label_text">Mobile</label>
															</div>
															<input type="text" class="form-control"  name="nommobile" id="nommobile"
																placeholder="phone number" pattern="[1-9]{1}[0-9]{9}"
																title="Enter 10 digit mobile number" required=" " />
														</div>
													</div>
													
													<div class="col-md-5 fleft">
																	<label for=""></label>
																	<div class="input-group">
																		<div class="input-group-prepend">
																			<span class="input-group-text"><i
																				class="fa fa-birthday-cake fa-2x"></i></span><label
																				class="label_text">DOB</label>
																		</div>
																		<input type="date" name="nomdob" id="nomdob" placeholder="DOB"
																			required="required">
																	</div>
																</div>
																
																<div class="col-md-4 fleft">
																	<label for="exampleAmount"></label>
																	<div class="input-group">
																		<div class="input-group-prepend">
																			<span class="input-group-text"><i
																				class="fa fa-briefcase fa-2x"></i></span><label
																				class="label_text">Occupation</label>
																		</div>
																		<select name="nomoccupation" id="nomoccupation"
																			required="required">
																			<option>Select</option>
																			<option value="1">Salaried</option>
																			<option value="2">Self Employed</option>
																			<option value="3">Student</option>
																			<option value="4">Retired</option>
																			<option value="5">House Wife</option>
																		</select>
																	</div>
																</div>
																
																
																<div class="col-md-5 fleft">
														<label for="exampleAmount"></label>
														<div class="input-group">
															<div class="input-group-prepend">
																<span class="input-group-text"><i
																	class="fa fa-envelope fa-2x"></i></span><label
																	class="label_text">Email Id</label>
															</div>
															<input type="email" id="nomemail" name="nomemail"
																class="form-control" placeholder="enter your e-mail"
																required="" />
														</div>
													</div>
													
													<div class="col-md-5 fleft">
														<label for="exampleAmount"></label>
														<div class="input-group">
															<div class="input-group-prepend">
																<span class="input-group-text"><i
																	class="fa fa-map-marker-alt fa-2x"></i></span><label
																	class="label_text">Address</label>
															</div>
															<input type="text"  name="nomaddress"class="form-control" id="nomaddress"
																placeholder="Address" required="required">
														</div>
													</div>
													
													
													<div class="col-md-5 fleft">
														<label for=""></label>
														<div class="input-group">
															<div class="input-group-prepend">
																<span class="input-group-text"><i
																	class="fa fa-hotel fa-2x"></i></span><label class="label_text">
																	City </label>
															</div>
															<input type="text" class="form-control"  name="nomcity"id="nomcity"
																placeholder="City" required="required">
														</div>
													</div>
													
													
													<div class="col-md-5 fleft">
														<label for="exampleAmount"></label>
														<div class="input-group">
															<div class="input-group-prepend">
																<span class="input-group-text"><i
																	class="fa fa-globe-americas fa-2x"></i></span><label
																	class="label_text">State</label>
															</div>
															<input type="text" class="form-control" name="nomstate"  id="nomstate"
																placeholder="State" required="required">
														</div>
													</div>
													
													
													<div class="col-md-5 fleft">
														<label for="exampleAmount"></label>
														<div class="input-group">
															<div class="input-group-prepend">
																<span class="input-group-text"><i
																	class="fa fa-digital-tachograph fa-2x"></i></span><label
																	class="label_text">Pin Code</label>
															</div>
															<input type="text" class="form-control" name="nompincode" id="nompincode"
																placeholder="Pin code" 
																 pattern="[0-9]{6}"
																title="Enter number" required="required">
														</div>
													</div>
													
													
													
													


												</div>
											</div>
										</div>


									</fieldset>

									<button class="btn btn-lg btn-success pull-right" 
									id="savenextsubmmit4" type="button"
										data-toggle="collapse" data-target="#collapseSix"
										aria-expanded="false
						aria-controls="collapseThree">Save
										& Next</button>
								</div>
							</div>

							<div class="card">
								<div class="card-header" id="headingFour">
									<h5 class="mb-0">
										<button class="btn btn-link collapsed btn-block text-left"
											type="button" data-toggle="collapse"
											data-target="#collapseSix" aria-expanded="false"
											aria-controls="collapseSix">
											<i class="fa fa-envelope main"></i><i
												class="fa fa-angle-double-right mr-3"></i>Declaration
										</button>
									</h5>
								</div>
								<div id="collapseSix" class="collapse fade"
									aria-labelledby="headingFive" data-parent="#accordionExample">
									<div class="card-body">
										<input type="checkbox" id="Yes" name="term&conmditions"
											value="" required="required" /> I hereby declare that all
										information provided above is true, and I accept all Terms &
										Conditions

									</div>
									<button class="btn btn-lg btn-success pull-right" type="submit"
										data-toggle="collapse">Proceed</button>
								</div>
							</div>

						</div>

						</form>
					</div>
				</div>
		</div>
		</section>
	</div>
	</div>
	
	<script src="contactform/contactform.js"></script>

	<script src="lib/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript">
		$('#checkbox1').click(function() {
			$('.saveandnext').prop('checked', $('#checkbox1').prop('checked'));
		});//required_checkbox
		$('.savecheckbox').click(function() {
			var countchecked = 0;
			$('.savecheckbox').each(function() {
				if ($(this).prop('checked')) {
					countchecked++;
				}
			});
			if (countchecked == 0) {
				$('#required_checkbox').show();
			} else {
				$('#required_checkbox').hide();
			}
		});
		$('#saveandnext')
				.click(
						function() {
							var countchecked = 0;
							$('.savecheckbox').each(function() {
								if ($(this).prop('checked')) {
									countchecked++;
								}
							});
							if (countchecked == 0) {
								$('#required_checkbox').show();
							} else {
								$('#required_checkbox').hide();
								if (confirm("Please note - based on your inputs, the selected plan can be made available only after a medical examination. Please click 'OK' to proceed with the same selection, or 'Cancel' to change plan selection.")) {
									$('#nominee_details').trigger('click');
								}
							}

						});

		$(document).ready(function() {
			$('#savenextsubmmit2').click(function() { // This button is your save and next button put ID of your save and next

				//mobile
				var mobile = $('#mobile').val(); // this will store the input box value into Jquery variable
				if (mobile == "") { // checking if your input box value is empty or not
					alert('Please Enter Mobile Number'); // this is your message what you want to show to your user
					return false; // this will prevent submitting the form in case your input is empty
				}
				//email
				var email = $('#email').val();
				if (email == "") {
					alert('Please Enter Email ');
					return false;
				}
				//address
				var address = $('#address').val();
				if (address == "") {
					alert('Please Enter Address ');
					return false;
				}
				//state
				var state = $('#state').val();
				if (state == "") {
					alert('Please Enter State ');
					return false;
				}
				//city
				var city = $('#city').val();
				if (city == "") {
					alert('Please Enter City ');
					return false;
				}
				//pincode
				var pincode = $('#pincode').val();
				if (pincode == "") {
					alert('Please Enter Pincode')
				}

			});
		});

		$(document).ready(function() {
			$('#savenextsubmmit1').click(function() {
				//salutation
				var salutation = $('#salutation').val();
				if (salutation == "Select") {
					alert('Please Enter Salutation')
					return false;
				}
				//name
				var name = $('#name').val();
				if (name == "") {
					alert('Please Enter Name')
					return false;
				}
				//dob
				var dob = $('#dob').val();
				if (dob == "") {
					alert('Please Enter Date of Birth')
					return false;
				}
				//occupation
				var occupation = $('#occupation').val();
				if (occupation == "Select") {
					alert('Please Enter Occupation')
					return false;
				}
				//height
				var height = $('#height').val();
				if (height == "Feet" && "Inch") {
					alert('Please Enter Height')
					return false;
				}
				//weight
				var weight = $('#weight').val();
				if (weight == "") {
					alert('Please Enter weight')
					return false;
				}
			});

		});
		
		
		$(document).ready(function() {
			$('#savenextsubmmit4').click(function() {
				
				//Nominee salutation
				var nomsalutation = $('#nomsalutation').val();
				if (nomsalutation == "Select") {
					alert('Please Enter Nominee Salutation')
					return false;
				}
				
				//Nominee name
				var nomname = $('#nomname').val();
				if (nomname == "") {
					alert('Please Enter Nominee Name')
					return false;
				}
				
				//Nominee relation
				var nomrelation = $('#nomrelation').val();
				if (nomrelation == "") {
					alert('Please Enter Nominee Relationship with Insurer')
					return false;
				}
				
				//Nominee mobile
				var nommobile = $('#nommobile').val();
				if (nommobile == "") { 
					alert('Please Enter Nominee Mobile Number'); 
					return false;
				}
				
				//Nominee dob
				var nomdob = $('#nomdob').val();
				if (nomdob == "") {
					alert('Please Enter Nominee Date of Birth')
					return false;
				}
				
				//Nominee occupation
				var nomoccupation = $('#nomoccupation').val();
				if (nomoccupation == "Select") {
					alert('Please Enter Nominee Occupation')
					return false;
				}
				
				//Nominee email
				var nomemail = $('#nomemail').val();
				if (nomemail == "") {
					alert('Please Enter Nominee Email ');
					return false;
				}
				
				//Nominee address
				var nomaddress = $('#nomaddress').val();
				if (nomaddress == "") {
					alert('Please Enter Nominee Address ');
					return false;
				}
				//Nominee state
				var nomstate = $('#nomstate').val();
				if (nomstate == "") {
					alert('Please Enter Nominee State ');
					return false;
				}
				//Nominee city
				var nomcity = $('#nomcity').val();
				if (nomcity == "") {
					alert('Please Enter Nominee City ');
					return false;
				}
				//Nominee pincode
				var nompincode = $('#nompincode').val();
				if (nompincode == "") {
					alert('Please Enter Nominee Pincode')
				}
				
			});

		});
	</script>
	<script src="text/javascript">
	  console.log(localStorage['yes']);
	

	</script>

	<!-- .// Accordion -->
</body>
								
</html>