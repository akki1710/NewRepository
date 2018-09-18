<%@include file="include_css.jsp" %>
<!-- ---country and state file -->
<script src="js/jquery-my.js"></script> 
<link href="css/style1.css" rel="stylesheet">
<link href="css/style9.css" rel="stylesheet" type="text/css" media="all"/>
<style>
form .form-group label{color:#fff}
form label{clear:both}
form input[type="submit"]{width:auto}
 .container{background:transparent}
    .col-md-6{background: rgba(0, 0, 0, 0.63);margin: 0 auto;padding:20px 30px}
    body{background:url(img/other.png)no-repeat center center;background-size:cover;background-attachment:fixed;}
    .list-group button{padding: .75rem 1.25rem; cursor: pointer; }
    .w3ls-name{*width:100%;*text-align:left}
    .w3ls-name input[type=text],.contactForm input[type=text],.agile_sub-label1{width:100%!important;}
    #line{text-align:center;margin-left: 0px;}
    .col-md-6 h2,.col-md-6 h1{font-size:normal!important;letter-spacing:normal}
    .col-md-6 p {color: #fff;font-size: 15px;text-align: left;}
    @media (max-width:768px){
        .col-md-6 p {color: #fff;font-size: 15px;text-align: left;margin-top: 15px;}
        .col-md-6 h2,.col-md-12 h1{font-size:medium!important;}
    }

</style>
<%@include file="menu.jsp" %>
<div class="container">
    <div class="row">
        <div class="col-md-6">
            <h1>TERM INSURANCE</h1>
            <h2>Compare Premiums in 30 Seconds</h2>
            <div class="w3ls-form">
                <form action="MyServlet" method="post">
                    <ul class="fields">
                        <div class="Refer_w3l">
                            <h3>Your details</h3>
                            <li>	
                                <label class="w3ls-opt">Cover :<span class="w3ls-star"> * </span></label>
                                <div class="w3ls-name">	
                                    <input type="text" name="cover"  placeholder="1,00,00,000" required=" "/>
                                </div>
                            </li>

                            <li>
                                <label class="w3ls-opt">Birth Date :<span class="w3ls-star"> * </span></label>	
                                <div class="w3ls-text w3ls-name">
                                    <span class="agile_sub-label">
                                        <select name="day" class="day">
                                            <option>Day</option>
                                            <option value="1"> 1 </option>
                                            <option value="2"> 2 </option>
                                            <option value="3"> 3 </option>
                                            <option value="4"> 4 </option>
                                            <option value="5"> 5 </option>
                                            <option value="6"> 6 </option>
                                            <option value="7"> 7 </option>
                                            <option value="8"> 8 </option>
                                            <option value="9"> 9 </option>
                                            <option value="10"> 10 </option>
                                            <option value="11"> 11 </option>
                                            <option value="12"> 12 </option>
                                            <option value="13"> 13 </option>
                                            <option value="14"> 14 </option>
                                            <option value="15"> 15 </option>
                                            <option value="16"> 16 </option>
                                            <option value="17"> 17 </option>
                                            <option value="18"> 18 </option>
                                            <option value="19"> 19 </option>
                                            <option value="20"> 20 </option>
                                            <option value="21"> 21 </option>
                                            <option value="22"> 22 </option>
                                            <option value="23"> 23 </option>
                                            <option value="24"> 24 </option>
                                            <option value="25"> 25 </option>
                                            <option value="26"> 26 </option>
                                            <option value="27"> 27 </option>
                                            <option value="28"> 28 </option>
                                            <option value="29"> 29 </option>
                                            <option value="30"> 30 </option>
                                            <option value="31"> 31 </option>
                                        </select>

                                    </span>
                                    <span class="agile_sub-label xxx">
                                        <select name="month" class="month">
                                            <option>Month</option>
                                            <option value="01"> January </option>
                                            <option value="02"> February </option>
                                            <option value="03"> March </option>
                                            <option value="04"> April </option>
                                            <option value="05"> May </option>
                                            <option value="06"> June </option>
                                            <option value="07"> July </option>
                                            <option value="08"> August </option>
                                            <option value="09"> September </option>
                                            <option value="10"> October </option>
                                            <option value="11"> November </option>
                                            <option value="12"> December </option>
                                        </select>

                                    </span>
                                    <span class="agile_sub-label">
                                        <select name="year" class="year">
                                            <option>Year</option>
                                            <option value="2000"> 2000 </option>
                                            <option value="1999"> 1999 </option>
                                            <option value="1998"> 1998 </option>
                                            <option value="1997"> 1997 </option>
                                            <option value="1996"> 1996 </option>
                                            <option value="1995"> 1995 </option>
                                            <option value="1994"> 1994 </option>
                                            <option value="1993"> 1993 </option>
                                            <option value="1992"> 1992 </option>
                                            <option value="1991"> 1991 </option>
                                            <option value="1990"> 1990 </option>
                                            <option value="1989"> 1989 </option>
                                            <option value="1988"> 1988 </option>
                                            <option value="1987"> 1987 </option>
                                            <option value="1986"> 1986 </option>
                                            <option value="1985"> 1985 </option>
                                            <option value="1984"> 1984 </option>
                                            <option value="1983"> 1983 </option>
                                            <option value="1982"> 1982 </option>
                                            <option value="1981"> 1981 </option>
                                            <option value="1980"> 1980 </option>
                                            <option value="1979"> 1979 </option>
                                            <option value="1978"> 1978 </option>
                                            <option value="1977"> 1977 </option>
                                            <option value="1976"> 1976 </option>
                                            <option value="1975"> 1975 </option>
                                            <option value="1974"> 1974 </option>
                                            <option value="1973"> 1973 </option>
                                            <option value="1972"> 1972 </option>
                                            <option value="1971"> 1971 </option>
                                            <option value="1970"> 1970 </option>
                                        </select>	
                                    </span>
                                    <div class="clear"></div>
                                </div>
                            </li> 
                            <li>

                                <label class="w3ls-opt">Smoke?<span class="w3ls-star"> * </span></label>
                                <div class="form-group">
                                    <div class="col-6">
                                        <label for="Yes"><input type="radio" id="Yes" name="smoke" value="Yes"> Yes</label>	
                                        <label for="No"><input type="radio" id="No" name="smoke" value="No"> No</label>
                                    </div>
                            <div class="clear"></div>
                            </li>
                            <li>
                                <label class="w3ls-opt clear">Annual Income: <span class="w3ls-star"> * </span> </label>
                                <div class="w3ls-text w3ls-name">
                                    <span class="agile_sub-label1">
                                        <select name="income" class="month">
                                            <option>select annual income</option>
                                            <option value="Upto3Lac"> Upto3Lac </option>
                                            <option value="3-5Lac"> 3-5Lac </option>
                                            <option value="5-7Lac"> 5-7Lac </option>
                                            <option value="7-10Lac"> 7-10Lac </option>
                                            <option value="10-15Lac"> 10-15Lac </option>
                                            <option value="15Lac+"> 15Lac+ </option>
                                        </select>
                                    </span>

                                    <div class="clear"></div>
                                </div>
                            </li>

                            <li>	
                                <label class="w3ls-opt">name :<span class="w3ls-star"> * </span></label>
                                <div class="w3ls-name">	
                                    <input type="text" name="name"  placeholder="Enter Your Name" required=" "/>
                                </div>
                            </li>

                            <li>
                                <div class="mail"> 
                                    <label class="w3ls-opt">e-mail :<span class="w3ls-star"> * </span></label>
                                    <span class="w3ls-text w3ls-name">
                                        <input type="email" name="email" placeholder="enter your e-mail" required=""/>
                                    </span>
                                </div>
                            </li>
                            <li>
                                <label class="w3ls-opt">Address <span class="w3ls-star"> *</span></label>	
                                <div class="w3ls-text w3ls-name">
                                    <span class="agile_sub-label">
                                        <select class="month" id="country" name="country"></select>

                                    </span>
                                    <span class="agile_sub-label xxx">
                                        <select class="month" id="state" name="city">
                                            <option value="">City</option>
                                        </select>
                                        <script language="javascript">
                                            populateCountries("country", "state");
                                        </script>
                                    </span>
                                </div>
                            </li>

                            <li>
                                <label class="w3ls-opt">phone number :<span class="w3ls-star"> * </span></label>	
                                <span class="w3ls-text w3ls-name">
                                    <input type="text" name="phoneno" placeholder="phone number" pattern="[1-9]{1}[0-9]{9}" title="Enter 10 digit mobile number" required=""/>
                                </span>
                            </li>



                            <p>*By clicking on "Compare & Save Big" you agree to our <a href="#"> privacy policy</a></p>  

                            <div class="clear"></div>
                            <div class="">
                                <input type="submit" class="btn" value="Compare & Save Big">
                            </div>
                        </div>
                    </ul>
                </form>
            </div>
        </div></div></div>
<%@include file="footer.jsp" %>