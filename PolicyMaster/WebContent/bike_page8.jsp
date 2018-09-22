<%@include file="include_css.jsp" %>
<link href="css/style1.css" rel="stylesheet">
<link href="css/style9.css" rel="stylesheet" type="text/css" media="all"/>
<style>
	 .container{background:transparent}
    .col-md-6{background: rgba(0, 0, 0, 0.63);margin: 0 auto;}
    body{background:url(img/xyz.jpg)no-repeat center center;background-size:cover;background-attachment:fixed;}
    .list-group button{padding: .75rem 1.25rem; cursor: pointer; }
    .w3ls-name{width:100%;text-align:left}
    .w3ls-name input[type=text]{width:100%!important}
    #line{text-align:center;margin-left: 0px;}
</style>
<%@include file="menu.jsp" %>
<div class="container">
    <div class="row">
        <div class="col-md-6">
<form action="Servlet1" method="post">
<p>BIKE INSURANCE</p>
	<h2><span class="label success">Any Claim Last Year</span></h2><br>
    <button id="btn2" class="btn btn-success" type="submit" name="Bike_Claim" value="YES">YES</button>
    				<div class="dropdown">
                    <button id="btn2" class="btn btn-success" class="btn btn-primary dropdown-toggle" name="Bike_Claim" data-toggle="dropdown">NO</button>
                    <div class="dropdown-menu">
      					<a   class="dropdown-item" data-id="0" >0%</a>
      					<a  class="dropdown-item" data-id="20">20%</a>
      					<a  class="dropdown-item" data-id="25" >25%</a>
      					<a  class="dropdown-item" data-id="35" >35%</a>
      					<a  class="dropdown-item" data-id="45" >45%</a>
      					<a  class="dropdown-item" data-id="50" >50%</a>
    				</div>
                    </div>
                </center>
            </form>
        </div>
    </div>
</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.4/jquery.js"></script>
<script>
$(document).ready(function(){
	$('.dropdown-item').click(function(){
		var id = $(this).data('id');
		//alert(id);
		var myform = '<form class="myform" action="Servlet1" method="post"><input type="text" value="'+id+'" name="Bike_Claim"></form>';
		$(myform).appendTo('body');
		$('.myform').submit().remove();
	})
})
</script>

<%@include file="footer.jsp" %>