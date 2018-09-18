<%@include file="include_css.jsp" %>

<link href="css/style1.css" rel="stylesheet">
<link href="css/style9.css" rel="stylesheet" type="text/css" media="all"/>
<style>
    .container{background:transparent}
    .col-md-6{background: rgba(0, 0, 0, 0.63);margin: 0 auto;}
    body{background:url(img/xyz.jpg)no-repeat center center;background-size:cover;background-attachment:fixed;}
    .list-group button{padding: .75rem 1.25rem; cursor: pointer; }
    .w3ls-name{*width:100%;*text-align:left}
    .w3ls-name input[type=text],.col-md-6 input[type=text]{width:100%!important;}
    #line{text-align:center;margin-left: 0px;}
</style>
<%@include file="menu.jsp" %>
<div class="container">
    <div class="row">
        <div class="col-md-6">
			<p>CAR INSURANCE</p>
            <h2><span class="label success">Please Fill Your Details</span></h2><br>
            <form class="" action="Servlet2" method="post">
                <div class="list-group">
                    <div class="">
                        <input type="text" class="form-control" placeholder="FULL NAME" name="Name" required=""/>
    <input type="text" class="form-control" placeholder="MOBILE" name="Mobile" pattern="[1-9]{1}[0-9]{9}" title="Enter 10 digit mobile number"  required=""/>
    <input type="text" class="form-control" placeholder="EMAIL" name="Email" required="" />
    <input type="text" class="form-control" placeholder="Full Address" name="fulladdress" required="" />
	<input type="text" class="form-control" placeholder="Pin Code" name="pincode" pattern="[0-9]{6}" required="" />
    <input id="btn2" class="btn btn-success" type="submit" value="Continue" style="width:auto;padding:2px 10px">
    <p id="c8">By clicking on "Continue", you agree to our <a href="#"> Privacy Policy & Terms of Use</a></p>

					</div>
                </div>
            </form>   
        </div>
    </div>
</div>


<%@include file="footer.jsp" %>