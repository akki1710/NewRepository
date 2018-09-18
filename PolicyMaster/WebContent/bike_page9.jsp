<%@include file="include_css.jsp" %>
<link href="css/style1.css" rel="stylesheet">
<link href="css/style9.css" rel="stylesheet" type="text/css" media="all"/>
<style>
.container{background:transparent}
    .col-md-6{background: rgba(0, 0, 0, 0.63);margin: 0 auto;}
    body{background:url(img/xyz.jpg)no-repeat center center;background-size:cover;background-attachment:fixed;}
    .list-group button{padding: .75rem 1.25rem; cursor: pointer; }
    .w3ls-name{width:100%;text-align:left}
    .w3ls-name input[type=text],.contactForm input[type=text]{width:100%!important}
    #line{text-align:center;margin-left: 0px;}
</style>
<%@include file="menu.jsp" %>
<div class="container">
    <div class="row">
        <div class="col-md-6">
<form action="Servlet1" method="post">
<p>BIKE INSURANCE</p>
	<h2><span class="label success">Select Policy Expiry Date</span></h2><br>
	
	 <input type="date" class="form-control" name="BikeExpiryDate" required="required"> 
	<input type="submit" value="Next"/>

<a href="#abc"><p id="p1">Don't know your policy expiry date? Click here</p></a>
</form>   
</div>
</div>
</div>

<%@include file="footer.jsp" %>