<%@include file="include_css.jsp" %>
<style>
    #intro{background:url(img/other1.jpg)no-repeat center center;background-size:cover;background-attachment:fixed;}
    @media (max-width:768px){
        .carousel-content {margin-top:30px;}
        .carousel-content i{font-size:3em;}
        .carousel-content h4,.carousel-content h2{font-size:medium!important;}
    }
</style>
<%@include file="menu.jsp" %>
  <section id="intro">
            <div class="intro-container">
                <div id="introCarousel" class="carousel  slide carousel-fade" data-ride="carousel">
                    <ol class="carousel-indicators"></ol>
                    <div class="carousel-inner" role="listbox">
                        <div class="carousel-item active">
                            <div class="carousel-container ">
                                <div class="carousel-content"> 
                            <h2>Other Insurance Plans</h2>
                            <div class="row">
                                <div class="col-3 wow bounceInLeft" data-wow-duration="2s" data-wow-delay="0.9s">
                                    <div class="align-center">
                                        <i class="fa fa-hospital-o fa-5x" style="color:white"></i>
                                        <h4 class="title"><a href="general">General Insurance</a></h4>
                                    </div>
                                </div>
                                <div class="col-3 wow bounceInLeft" data-wow-duration="2s" data-wow-delay="0.6s" onclick=newDoc1()>
                                    <div class="align-center">
                                        <i class="fa fa-group fa-5x" style="color:white"></i>
                                        <h4 class="title"><a href="groupmediclaim">Group Medical Insurance</a></h4>
                                    </div>
                                </div>

                                <div class="col-3 wow bounceInLeft" data-wow-duration="2s" data-wow-delay="0.6s">
                                    <div class="align-center">
                                        <i class="fa fa-building fa-5x" style="color:white"></i>
                                        <h4 class="title"><a href="corporate">Corporate Insurance</a></h4>
                                    </div>
                                </div>

                                <div class="col-3 wow bounceInLeft" data-wow-duration="2s" data-wow-delay="0.6s">
                                    <div class="align-center">
                                        <i class="fa fa-plane fa-5x" style="color:white"></i>
                                        <h4 class="title"><a href="travel">Travel Insurance</a></h4>
                                    </div>
                                </div>     	

                                <div class="col-4 wow bounceInLeft" data-wow-duration="2s" data-wow-delay="0.6s">
                                    <div class="align-center">
                                        <i class="fa fa-home fa-5x" style="color:white"></i>
                                        <h4 class="title"><a href="homeinsurance">Home Insurance</a></h4>
                                    </div>
                                </div>
                                <div class="col-4 wow bounceInLeft" data-wow-duration="2s" data-wow-delay="0.6s">
                                     <div class="align-center">
                                        <i class="fa fa-car fa-5x" style="color:white"></i>
                                        <h4 class="title"><a href="personalaccident">Personal Accident Insurance</a></h4>
                                    </div>
                                </div>
                                <div class="col-4 wow bounceInLeft" data-wow-duration="2s" data-wow-delay="0.6s">
                                    <div class="align-center">
                                        <i class="fa fa-plus-circle fa-5x" style="color:white"></i>
                                        <h4 class="title"><a href="cancer">Cancer Insurance</a></h4>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>  

        </div>
    </div>
</section>

<section id="about">
    <div class="container">
        <h3>Other Insurance</h3>
        <hr>
        <div class="row">
            <div class="col-md-4">

                <h3 class="title">A. General Insurance</h3>
                <p>
                    Personal Accident Insurance is one shield that keeps you financially protected in times of adversities.
                    At PolicyMaster.com, we offer the best insurance plans that efficiently cover your accidental claims & medical expenses.
                    At such a time of insecurities, stepping out on the roads can cause you life threatening injuries.
                    Not only you may fall to a minor injury but also face major consequences of a road accident including death.
                    To ensure that you have a protective shield against all the financial repercussions that arise due to any road.
                </p>
            </div>



            <div class="col-md-4">

                <h3 class="title">B. Travel Insurance </h3>
                <p>
                    Travelling is a great experience! It's the best way to make memories and cherish them forever.
                    From domestic to international, travelling is as simple as pinpointing a place on the globe.
                    And you just need to pack your bags with the basic essentials and run away to your dream vacation.
                    However, the most important thing to carry in that bag is the travel insurance.
                    No matter where and with whom you are travelling, insurance is a must to have. It gives you an upper hand at security and safety of you and your belongings.
                </p>

            </div>

            <div class="col-md-4">
                <h3 class="title">C. Home Insurance </h3>
                <p>
                    A 'House' is a dream for many. Those who are fortunate enough to have their own house enjoy the homely warmth and the cozy feeling of their home with their near and dear ones.
                    Owning a house is a proud moment for any individual and is perhaps the biggest investment ever done in his/her lifetime as it involves huge expenditure of money, time and emotions.
                    Keeping all these in mind, it becomes imperative that you ensure your house and its belongings against threats like burglary, natural disasters, fire etc.
                </p>

            </div>
        </div>
    </div>
</section>

<footer id="footer">
    <div class="footer-top">
        <div class="container">
            <div class="row">

                <div class="col-lg-3 col-md-6 footer-info">
                    <h3>PolicyMaster</h3>
                    <p>Insurance is the subject matter of Solicitation. For more details on risk factors, associate terms and conditions and exclusions, please read the product brochure before concluding a sale.</p>
                </div>

                <div class="col-lg-3 col-md-6 footer-links">
                    <h4>Useful Links</h4>
                    <ul>
                        <li><i class="ion-ios-arrow-right"></i> <a href="#">Home</a></li>
                        <li><i class="ion-ios-arrow-right"></i> <a href="#">About us</a></li>
                        <li><i class="ion-ios-arrow-right"></i> <a href="#">Services</a></li>
                        <li><i class="ion-ios-arrow-right"></i> <a href="#">Terms of service</a></li>
                        <li><i class="ion-ios-arrow-right"></i> <a href="#">Privacy policy</a></li>
                    </ul>
                </div>

                <div class="col-lg-3 col-md-6 footer-contact">
                    <h4>Contact Us</h4>
                    <p>
                        B-09,10th Floor <br>
                        ITL Twin Tower<br>
                        NSP,Delhi-34 <br>
                        <strong>Phone:</strong> +91- 9545853079<br>
                        <strong>Email:</strong> akashchauhan@gmail.com<br>
                    </p>

                    <div class="social-links">
                        <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
                        <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
                        <a href="#" class="instagram"><i class="fa fa-instagram"></i></a>
                        <a href="#" class="google-plus"><i class="fa fa-google-plus"></i></a>
                        <a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a>
                    </div>

                </div>

                <div class="col-lg-3 col-md-6 footer-newsletter">
                    <h4>Our Newsletter</h4>
                    <p>Insurance is the subject matter of Solicitation. For more details on risk factors, associate terms and conditions and exclusions, please read the product brochure before concluding a sale.</p>
                    <form action="" method="post">
                        <input type="email" name="email"><input type="submit"  value="Subscribe">
                    </form>
                </div>

            </div>
        </div>
    </div>
<%@include file="footer.jsp" %>
</footer>	