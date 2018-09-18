<%@include file="include_css.jsp" %>
<link href="css/style1.css" rel="stylesheet">
        <link href="css/style9.css" rel="stylesheet" type="text/css" media="all"/>
<style>
 	.container{background:transparent}
    .col-md-6{background: rgba(0, 0, 0, 0.63);margin: 0 auto;}
   body{ background:url(img/bike.jpg)no-repeat center center!important;background-size:cover;background-attachment:fixed;}
 .list-group button{padding: .75rem 1.25rem; cursor: pointer; }
</style>
<%@include file="menu.jsp" %>
<div class="container">
	<div class="row">
		<div class="col-md-6">
<form action="Servlet1" method="post">
<div class="sub-group">
<h2><span class="label success">Select a Manufacturer</span></h2><br>
      <div class="row">
        <div class="col-lg-12">
          <p>
            <button type="submit" class="btn btn-sq-lg btn-primary" name="manufacturer2" value="honda">
                <img vspace="20" src="img/v/hondabike.jpg"/></i><br>
                HONDA
             </button>
             <button type="submit" class="btn btn-sq-lg btn-success" name="manufacturer2" value="bajaj">
              <img vspace="20" src="img/v/bajaj.jpg"/></i><br>
                BAJAJ
            </button>
            <button type="submit" class="btn btn-sq-lg btn-info" name="manufacturer2" value="KINETIC MOTORS">
              <img vspace="20" src="img/v/kinetic.jpg"/></i><br>
                KINETIC MOTORS
            </button>
            <button type="submit" class="btn btn-sq-lg btn-danger" name="manufacturer2" value="yamaha">
              <img vspace="23" src="img/v/yamaha.jpg"/></i><br>
                YAMAHA
            </button>
            </a>
          </p>
        </div>
	</div><br>
	<div class="row">
        <div class="col-lg-12">
          <p>
          
          <button type="submit" class="btn btn-sq-lg btn-primary" name="manufacturer2" value="tvs">
              <img vspace="18" src="img/v/tvs.jpg"/></i><br>
                TVS
            </button>
            <button type="submit" class="btn btn-sq-lg btn-success" name="manufacturer2" value="hero">
              <img vspace="22" src="img/v/heromotocrop.jpg"/></i><br>
                HERO
            </button>
            <button type="submit" class="btn btn-sq-lg btn-info" name="manufacturer2" value="royal">
              <img vspace="22" src="img/v/royal.jpg"/></i><br>
                ROYAL<br>ENFIELD
            </button>
            <button type="submit" class="btn btn-sq-lg btn-danger" name="manufacturer2" value="ktm">
              <img vspace="18" src="img/v/ktm.jpg"/></i><br>
                KTM
           </button>            
          </p>
        </div>
	</div><br>
	<div class="row">
        <div class="col-lg-12">
          <p>
            <button type="submit" class="btn btn-sq-lg btn-primary" name="manufacturer2" value="suzuki">
              <img vspace="22" src="img/v/suzuki.jpg"/></i><br>
                SUZUKI
            </button>
                        <button type="submit" class="btn btn-sq-lg btn-success" name="manufacturer2" value="harleydevidson">
              <img vspace="20" src="img/v/harley.jpg"/></i><br>
                HARLEY<br>DEVIDSON
            </button>
            <button type="submit" class="btn btn-sq-lg btn-info" name="manufacturer2" value="lml">
              <img vspace="23" src="img/v/lml.jpg"/></i><br>
                LML
            </button>
            <button type="submit" class="btn btn-sq-lg btn-danger" name="manufacturer2" value="mahindra">
              <img vspace="22" src="img/v/mahindra.jpg"/></i><br>
                MAHINDRA
            </button>
          </p>
        </div>
	</div>
</div><br>
</form>
	 <button class="button button2">Others</button><br>
        </div>
</div>
</div>
   
<%@include file="footer.jsp" %>