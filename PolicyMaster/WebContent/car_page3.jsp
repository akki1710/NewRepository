<%@include file="include_css.jsp" %>
<link href="css/style1.css" rel="stylesheet">
        <link href="css/style9.css" rel="stylesheet" type="text/css" media="all"/>
        <style>
            body{background:url(img/xyz.jpg)no-repeat center center;background-size:cover;background-attachment:fixed;}
            .list-group button{padding: .75rem 1.25rem; cursor: pointer; }

	.bg_gray {
    background: #e5e5e5;
}
        </style>
<%@include file="menu.jsp" %>
          <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <p>CAR INSURANCE</p>
                    <h2><span class="label success">Select a Fuel Type</span></h2><br>   
                    <form action="Servlet1" method="post">
                        <div class="list-group">
                            <div class="">
                                <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="FuelType" value="Petrol">Petrol</button>
                                <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="FuelType" value="Diesel">Diesel</button>
                                <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="FuelType" value="CNG">CNG</button>
                                <!-- <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="FuelType" value="LPG">LPG</button> -->
                                <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="FuelType" value="External CNG kit">External CNG kit</button>
                            </div>
                        </div>

                    </form>
                </div>
            </div>
        </div>

<%@include file="footer.jsp" %>