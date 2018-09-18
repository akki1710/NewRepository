<%@include file="include_css.jsp" %>
<link href="css/style1.css" rel="stylesheet">
        <link href="css/style9.css" rel="stylesheet" type="text/css" media="all"/>
<style>
	.container{background:transparent}
    .col-md-8{background: rgba(0, 0, 0, 0.63);margin: 0 auto;}
    body{background:url(img/xyz.jpg)no-repeat center center;background-size:cover;background-attachment:fixed;}
    .list-group button{padding: .75rem 1.25rem; cursor: pointer; }
</style>
<%@include file="menu.jsp" %>
<div class="container">
    <div class="row">
        <div class="col-md-8">
            <p>CAR INSURANCE</p>
            <h2><span class="label success">Select a Registration Year</span></h2><br>
            <form action="Servlet1" method="post">
                <div class="list-group">
                    <div class="">

                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="Brandnew">I have a Brand New Car</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2017">2017</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2016">2016</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2015">2015</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2014">2014</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2013">2013</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2012">2012</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2011">2011</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2010">2010</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2009">2009</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2008">2008</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2007">2007</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2006">2006</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2005">2005</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2004">2004</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2003">2003</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2002">2002</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2001">2001</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="2000">2000</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="1999">1999</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="1998">1998</button>
                        <button id="btn1_1"  class="col-md-4 list-group-item list-group-item-success" type="submit" name="Regyr" value="1997">1997</button>

                    </div>
                </div>

            </form>

        </div>
    </div>
</div>
<%@include file="footer.jsp" %>

