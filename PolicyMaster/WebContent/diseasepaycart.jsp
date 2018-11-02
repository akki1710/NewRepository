<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        <script src="//code.jquery.com/jquery-3.2.1.min.js" crossorigin="anonymous"></script>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <link href="//stackpath.bootstrapcdn.com/bootswatch/4.1.3/united/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
        <!--<link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.min.css">--> 
        <link rel="stylesheet" href="//use.fontawesome.com/releases/v5.2.0/css/all.css" crossorigin="anonymous">
        <!-- <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> -->
        <!------ Include the above in your HEAD tag ---------->
        <style>
            /***********************************************/
            /***************** Accordion ********************/
            /***********************************************/
            @import url('//fonts.googleapis.com/css?family=Tajawal');
            /*@import url('//maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css');*/
            @import url("//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css");


            fieldset.textborder {
                border: 1px groove #ddd !important;
                padding: 0 1.4em 1.4em 1.4em !important;
                margin: 0 0 1.5em 0 !important;
                -webkit-box-shadow:  0px 0px 0px 0px #000;
                box-shadow:  0px 0px 0px 0px #000;
            }

            legend.textborder {
                font-size: 1.2em !important;
                font-weight: bold !important;
                text-align: left !important;
                width:auto;
                padding:0 10px;
                border-bottom:none;
            }
            .fleft{float:left;}
            .form-control{height:inherit;font-size: 14px}
            .input-group-prepend{background: #007b5e;/*#ef7642; /*text color Weight, Height*/
                                 line-height: 200%;
                                 padding: 0px;
                                 color: #fff;
                                 font-size: 13px;}
            .input-group-text {
                color: #fff;
                background-color: #ef7642;/*icon color */
                border: 1px solid #ef7642;/*icon color */
                border-radius: 0px;
                font-size: 15px;
            }
            .label_text{
                padding: 0px 4px;
                margin: auto;
                font-size: 11px;
                font-weight: bold;
            }
            /*********************************************************************************************************************************/
            section{
                padding: 60px 0;
            }

            #accordion-style-1 h1,
            #accordion-style-1 a{
                color:#007b5e;
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

            #accordion-style-1 .card-header .btn.collapsed .fa.main{
                display:none;
            }

            #accordion-style-1 .card-header .btn .fa.main{
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
                display:block;
            }
            body {
	             background-image: url('assets/img/backgrounds/1.jpg');
	             background-size: cover;
	             background-attachment: fixed;
	             min-height: 700px;
	             font-family: 'Lato', sans-serif;
                 }
        </style>
    </head>
    <body>
        <!-- Add your site or application content here -->

        <!-- Accordion -->
        <div class="container-fluid bg-gray" id="accordion-style-1">
            <div class="container">
                <section>
                    <div class="row">
                        <div class="col-12">
                            <h1 class="text-green mb-4 text-center">Final Payment</h1>
                        </div>
                        <div class="col-md-12">
                            <div class="accordion" id="accordionExample">
                                <div class="card">
                                    <div class="card-header" id="headingOne">
                                        <h5 class="mb-0">
                                            <button class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                                <i class="fa fa-shopping-cart  main"></i><i class="fa fa- mr-3"></i>Checkout : 
                                            </button>
                                        </h5>
                                    </div>

                                    <div id="collapseOne" class="collapse show fade" aria-labelledby="headingOne" data-parent="#accordionExample">
                                        <div class="card-body">
                                            <div class="">
                                                <form action="<%=(String) session.getAttribute("PaymentUrl") %>" method="post" class="">
                                                 <button type="button" class="btn btn-primary btn-lg btn-block">Proposal details have been mailed to Insurer</button>
                                                  <br> <p> You will be redirected to the Payment Gateway on clicking Proceed to Payment<p/>
                                                    <fieldset  class="textborder">
                                                    
                                                        <legend class=" btn btn-info btn-lg btn-block"><h2>Cart</h2>  </legend>
                                                         
                                                        <div class="">
                                                            <div class="">
                                                            <%=(String) session.getAttribute("health_policy") %><br>
                                                                <span class="label success">Success</span>
                                                            </div>
                                                        </div>


                                                    </fieldset>
                                                     <fieldset>
                                                     <%String health_policy=(String) session.getAttribute("health_policy");
                                                     if(health_policy.equals("Optima_Restore")){ %>
                                                     Grand Total:  <%=(String) session.getAttribute("TotalPremium") %><br>
                                                     <%} else{%>
                                                     Grand Total:  <%=(String) session.getAttribute("FloaterTotalPremium") %><br>
                                                     <%} %>
                                                     (Inclusive of all taxes)<br>
                                                  <br>
                                                     <button class="btn btn-lg btn-success float-right"  type="submit" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">PROCEED TO PAYMENT --> </button>
                                                      </fieldset>
                                                   
                                                   
                                                </form>
                                            </div>
                                        </div>

                                    </div>
                                </div>
<!--                                 <div class="card">
                                    <div class="card-header" id="headingTwo">
                                        <h5 class="mb-0">
                                            <button class="btn btn-link collapsed btn-block text-left" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                                <i class="fa fa-plus main"></i><i class="fa fa-angle-double-right mr-3"></i>There are many more.
                                            </button>
                                        </h5>
                                    </div>
                                    <div id="collapseTwo" class="collapse fade" aria-labelledby="headingTwo" data-parent="#accordionExample">
                                        <div class="card-body">
                                            Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.<a href="https://www.fiverr.com/sunlimetech/design-and-fix-your-bootstrap-4-issues" class="ml-3" target="_blank"><strong>View More designs <i class="fa fa-angle-double-right"></i></strong></a>
                                        </div>
                                    </div>
                                </div>
                                <div class="card">
                                    <div class="card-header" id="headingThree">
                                        <h5 class="mb-0">
                                            <button class="btn btn-link collapsed btn-block text-left" type="button" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                                <i class="fa fa-expeditedssl main"></i><i class="fa fa-angle-double-right mr-3"></i>How to enable two factor authentication.
                                            </button>
                                        </h5>
                                    </div>
                                    <div id="collapseThree" class="collapse fade" aria-labelledby="headingThree" data-parent="#accordionExample">
                                        <div class="card-body">
                                            Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.<a href="https://www.fiverr.com/sunlimetech/convert-bootstrap-or-html-to-wordpress-for-global-devices" class="ml-3" target="_blank"><strong>View More designs <i class="fa fa-angle-double-right"></i></strong></a>
                                        </div>
                                    </div>
                                </div>
                                <div class="card">
                                    <div class="card-header" id="headingFour">
                                        <h5 class="mb-0">
                                            <button class="btn btn-link collapsed btn-block text-left" type="button" data-toggle="collapse" data-target="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
                                                <i class="fa fa-envelope main"></i><i class="fa fa-angle-double-right mr-3"></i>How to contact us.
                                            </button>
                                        </h5>
                                    </div>
                                    <div id="collapseFour" class="collapse fade" aria-labelledby="headingFour" data-parent="#accordionExample">
                                        <div class="card-body">
                                            Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.<a href="https://www.fiverr.com/sunlimetech/do-web-development-in-pure-php-and-frameworks" class="ml-3" target="_blank"><strong>View More designs <i class="fa fa-angle-double-right"></i></strong></a>
                                        </div>
                                    </div>
                                </div> -->
                            </div>
                        </div>  
                    </div>
                </section>
            </div>
        </div>
        <!-- .// Accordion -->
    </body>
</html>