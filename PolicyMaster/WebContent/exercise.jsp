<%@include file="include_css.jsp" %>
<link href="css/style1.css" rel="stylesheet">
        <link href="css/style9.css" rel="stylesheet" type="text/css" media="all"/>
<style>
    .container{background:transparent}
    .col-md-6{background: rgba(0, 0, 0, 0.63);margin: 0 auto;}
    body{background:url(img/motor.jpg)no-repeat center center;background-size:cover;background-attachment:fixed;}
    .list-group button{padding: .75rem 1.25rem; cursor: pointer; }
    .w3ls-name{width:100%;text-align:left}
    .w3ls-name input[type=text]{width:100%!important}
    #line{text-align:center;margin-left: 0px;}
</style>
<%@include file="menu.jsp" %>
<div class="top-content">
		<div class="inner-bg">
		<form action="" method="post" class="motor-form">
    		 <fieldset>
			<div class="container">
   			 <div class="row">
        <div class="col-md-6">
            <p>CAR INSURANCE</p>
            <h2><span class="label success">Select a Registration Year</span></h2><br>
                <ul class="fields">
                    <div class="Refer_w3l">
                        <h3>&nbsp;&nbsp;&nbsp;&nbsp;Get Free Quotes From Top Insurers</h3><br>

                        <div class="w3ls-name">	
                            <div id="regno"><i class="fa fa-car iconpos "></i> &nbsp;Reg. No.</div>
                            <input type="text" class="form-control" name="RegNo" id="cartextbox_1" placeholder="E.G.: DL01AB1234" pattern="^[a-z|A-Z]{2}[0-9]{1,2}[a-z|A-Z]{1,2}[0-9]{1,4}$" required=" "/>
                        </div>
                        <div class="w3ls-btn">
                            <input type="submit" value="Compare & Save Big" name="next" class="btn btn-reg">
                        </div><br><br>
                        <div class="dontKnow dontKnow2" id="line">
                            "Compare plans from 15+ insurers & save up to 60%"
                        </div>
                    </div>
                </ul>
        </div>

    </div>
</div>
</fieldset>
<fieldset>
<div class="container">
	<div class="row">
		<div class="col-md-6">
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
            <button class="button button2">Others</button><br>
        </div>
</div>
</div>
</fieldset>
</form>
</div>
</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.4/jquery.js"></script>
<script>
jQuery(document).ready(function() {
    $('.motor-form .btn-reg').on('click', function() {
    	//jQuery time
    	var current_fs, next_fs, previous_fs; //fieldsets
    	var left, opacity, scale; //fieldset properties which we will animate
    	var animating; //flag to prevent quick multi-click glitches

    	$(".next").click(function(){
    		if(animating) return false;
    		animating = true;
    		
    		current_fs = $(this).parent();
    		next_fs = $(this).parent().next();
    		
    		//activate next step on progressbar using the index of next_fs
    		$("#progressbar li").eq($("fieldset").index(next_fs)).addClass("active");
    		
    		//show the next fieldset
    		next_fs.show(); 
    		//hide the current fieldset with style
    		current_fs.animate({opacity: 0}, {
    			step: function(now, mx) {
    				//as the opacity of current_fs reduces to 0 - stored in "now"
    				//1. scale current_fs down to 80%
    				scale = 1 - (1 - now) * 0.2;
    				//2. bring next_fs from the right(50%)
    				left = (now * 50)+"%";
    				//3. increase opacity of next_fs to 1 as it moves in
    				opacity = 1 - now;
    				current_fs.css({'transform': 'scale('+scale+')'});
    				next_fs.css({'left': left, 'opacity': opacity});
    			}, 
    			duration: 800, 
    			complete: function(){
    				current_fs.hide();
    				animating = false;
    			}, 
    			//this comes from the custom easing plugin
    			easing: 'easeInOutBack'
    		});
    	});

    	$(".previous").click(function(){
    		if(animating) return false;
    		animating = true;
    		
    		current_fs = $(this).parent();
    		previous_fs = $(this).parent().prev();
    		
    		//de-activate current step on progressbar
    		$("#progressbar li").eq($("fieldset").index(current_fs)).removeClass("active");
    		
    		//show the previous fieldset
    		previous_fs.show(); 
    		//hide the current fieldset with style
    		current_fs.animate({opacity: 0}, {
    			step: function(now, mx) {
    				//as the opacity of current_fs reduces to 0 - stored in "now"
    				//1. scale previous_fs from 80% to 100%
    				scale = 0.8 + (1 - now) * 0.2;
    				//2. take current_fs to the right(50%) - from 0%
    				left = ((1-now) * 50)+"%";
    				//3. increase opacity of previous_fs to 1 as it moves in
    				opacity = 1 - now;
    				current_fs.css({'left': left});
    				previous_fs.css({'transform': 'scale('+scale+')', 'opacity': opacity});
    			}, 
    			duration: 800, 
    			complete: function(){
    				current_fs.hide();
    				animating = false;
    			}, 
    			//this comes from the custom easing plugin
    			easing: 'easeInOutBack'
    		});
    	});

    
});

</script>
<%@include file="footer.jsp" %>