
jQuery(document).ready(function() {
	
    
    $('#top-navbar-1').on('shown.bs.collapse', function(){
    	$.backstretch("resize");
    });
    $('#top-navbar-1').on('hidden.bs.collapse', function(){
    	$.backstretch("resize");
    });
    
    /*
        Form
    */
    $('.registration-form fieldset:first-child').fadeIn('slow');
    
    $('.registration-form input[type="text"], .registration-form input[type="password"], .registration-form input[type="email"], .registration-form textarea, .registration-form select').on('focus', function() {
    	$(this).removeClass('input-error');
    });
    $('.registration-form').find('input[type="text"], input[type="password"], input[type="email"], textarea,select').each(function() {
		if( $(this).val() == "" ||  $(this).val() == "null" ) {
			 $(this).val("");
		}
    });
    // next step
    $('.registration-form .btn-next').on('click', function() {
    	var parent_fieldset = $(this).parents('fieldset');
    	var next_step = true;
    	
    	parent_fieldset.find('input[type="text"], input[type="password"], input[type="email"], textarea,select').each(function() {
    		if( $(this).val() == "" ||  $(this).val() == "null" ) {
    			 $(this).val("");
    			$(this).addClass();
    			next_step = false;
    		}
    		else {
    			
    			$(this).removeClass('input-error');
    		}
    	});
    	
    	if( next_step ) {
    		parent_fieldset.fadeOut(400, function() {
	    		$(this).next().fadeIn();
	    	});
    	}
    	
    });
    
    // previous step
    $('.registration-form .btn-previous').on('click', function() {
    	$(this).parents('fieldset').fadeOut(400, function() {
    		$(this).prev().fadeIn();
    	});
    });
    
    // submit
    $('.registration-form .btn-page3').on('submit', function(e) {
    	var parent_fieldset = $(this).parents('fieldset');
    	var next_step = true;
    	
    	$(this).find('input[type="text"], input[type="password"], textarea,select,').each(function() {
    		if( $(this).val() == "" ) {
    			 $(this).val("");
     			$(this).addClass();
    		}
    		else {
    			$(this).removeClass('input-error');
    		}
    	});

    	
    });
    
    
});
