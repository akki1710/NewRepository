<%@include file="include_css.jsp" %>
<link href="css/style1.css" rel="stylesheet">
        <link href="css/style9.css" rel="stylesheet" type="text/css" media="all"/>
<style>
 	.container{background:transparent}
    .col-md-6{background: rgba(0, 0, 0, 0.63);margin: 0 auto;}
   body{ background:url(img/motor.jpg)no-repeat center center!important;background-size:cover;background-attachment:fixed;}
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

                                <button type="submit" class="btn btn-sq-lg btn-primary" name="Manufacturer" value="maruti suzuki">
                                    <img vspace="20" src="img/v/maruti.png"/></i><br>
                                    MARUTI
                                </button>
                                <button type="submit" class="btn btn-sq-lg btn-success" name="Manufacturer" value="hyundai">
                                    <img vspace="20" src="img/v/hyundai.jpg"/></i><br>
                                    HYUNDAI
                                </button>
                                <button type="submit" class="btn btn-sq-lg btn-info" name="Manufacturer" value="honda">
                                    <img vspace="20" src="img/v/honda.jpg"/></i><br>
                                    HONDA
                                </button>
                                <button type="submit" class="btn btn-sq-lg btn-danger" name="Manufacturer" value="chevrolet">
                                    <img vspace="23" src="img/v/chevrolet.jpg"/></i><br>
                                    CHEVROLET
                                </button>
                            </p>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-lg-12">
                            <p>
                                <button type="submit" class="btn btn-sq-lg btn-primary" name="Manufacturer" value="fiat">
                                    <img vspace="18" src="img/v/fiat.jpg"/></i><br>
                                    FIAT
                                </button>
                                <button type="submit" class="btn btn-sq-lg btn-success" name="Manufacturer" value="ford">
                                    <img vspace="22" src="img/v/ford.jpg"/></i><br>
                                    FORD
                                </button>
                                <button type="submit" class="btn btn-sq-lg btn-info" name="Manufacturer" value="renault">
                                    <img vspace="22" src="img/v/renault.jpg"/></i><br>
                                    RENAULT
                                </button>
                                <button type="submit" class="btn btn-sq-lg btn-danger" name="Manufacturer" value="MERCEDES BENZ">
                                    <img vspace="18" src="img/v/mers.jpg"/></i><br>
                                    MERCEDES
                                </button>
                            </p>
                        </div>
                    </div><br>
                    <div class="row">
                        <div class="col-lg-12">
                            <p>
                                <button type="submit" class="btn btn-sq-lg btn-primary" name="Manufacturer" value="toyota">
                                    <img vspace="22" src="img/v/toyota.jpg"/></i><br>
                                    TOYOTA
                                </button>
                                <button type="submit" class="btn btn-sq-lg btn-success" name="Manufacturer" value="volkswagen">
                                    <img vspace="20" src="img/v/volkswagen.jpg"/></i><br>
                                    VOLKSWAGEN
                                </button>
                                <button type="submit" class="btn btn-sq-lg btn-info" name="Manufacturer" value="tata motors">
                                    <img vspace="23" src="img/v/tata.jpg"/></i><br>
                                    TATA
                                </button>
                                <button type="submit" class="btn btn-sq-lg btn-danger" name="Manufacturer" value="mahindra">
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