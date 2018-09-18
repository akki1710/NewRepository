

jQuery(document).ready(function() {
	
    
    
    /*
	    Modals
	*/
	$('.launch-modal').on('click', function(e){
		e.preventDefault();
		$( '#' + $(this).data('modal-id') ).modal();
	});
    
    /*
        Form validation
    */
//	$('.login-form input[type="checkbox"], .login-form input[type="password"], .login-form class="month"').on('focus', function() {
//    	$(this).removeClass('input-error');
//    });
    
//	$('button#submit').click(function(e){
//	 $.ajax({
//	        url: 'ModalServlet',
//	        type: 'POST',
//	        data: {member: $('.modal-body #member').val(),
//	               age: $('.modal-body #age').val()
//	               },
//	        success: function(response) {
//	            //show response to user
//	        },
//	        error: function(jqXHR, e) {
//	            alert('error'+e);
//	        }
//	      });
//	    e.preventDefault();
//	});
    	
    });
    
    

