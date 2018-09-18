<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PolicyMaster</title>
 <link href="img/p.jpg" rel="icon">
<link href="userpanel/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="userpanel/css/brain-theme.css" rel="stylesheet" type="text/css">
<link href="userpanel/css/styles.css" rel="stylesheet" type="text/css">
<link href="userpanel/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href='http://fonts.googleapis.com/css?family=Cuprum' rel='stylesheet' type='text/css'>

<<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.2/jquery-ui.min.js"></script>
<script type="text/javascript" src="userpanel/js/plugins/forms/select2.min.js"></script>
<script type="text/javascript" src="userpanel/js/plugins/forms/autosize.js"></script>
<script type="text/javascript" src="userpanel/js/plugins/forms/inputlimit.min.js"></script>
<script type="text/javascript" src="userpanel/js/plugins/forms/listbox.js"></script>
<script type="text/javascript" src="userpanel/js/plugins/forms/multiselect.js"></script>
<script type="text/javascript" src="userpanel/js/plugins/forms/validate.min.js"></script>
<script type="text/javascript" src="userpanel/js/plugins/forms/tags.min.js"></script>
<script type="text/javascript" src="userpanel/js/plugins/interface/datatables.min.js"></script>
<script type="text/javascript" src="userpanel/js/plugins/interface/prettify.js"></script>
<script type="text/javascript" src="userpanel/js/plugins/interface/collapsible.min.js"></script>
<script type="text/javascript" src="userpanel/js/bootstrap.min.js"></script>
<script type="text/javascript" src="userpanel/js/application.js"></script>
</head>


<body>
 <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <div class="hidden-lg pull-right">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-right">
                        <span class="sr-only">Toggle navigation</span>
                        <i class="fa fa-chevron-down"></i>
                    </button>

                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar">
                        <span class="sr-only">Toggle sidebar</span>
                        <i class="fa fa-bars"></i>
                    </button>
                </div>

                <ul class="nav navbar-nav navbar-left-custom">
                    <li class="user dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown">
                            <img src="" alt="">
                            <span></span>
                            <i class="caret"></i>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="#"><i class="fa fa-user"></i> Profile</a></li>
                            <li><a href="#"><i class="fa fa-tasks"></i> Tasks</a></li>
                            <li><a href="#"><i class="fa fa-cogs"></i> Settings</a></li>
                            <li><a href="LogoutSer"><i class="fa fa-mail-forward"></i> Logout</a></li>
                        </ul>
                    </li>
                    <li><a class="nav-icon sidebar-toggle"><i class="fa fa-bars"></i></a></li>
                </ul>
            </div>

            <ul class="nav navbar-nav navbar-right collapse" id="navbar-right">
                <li>
                    <a href="#">
                        <i class="fa fa-rotate-right"></i>
                        <span>Updates</span>
                        <strong class="label label-danger">15</strong>
                    </a>
                </li>
                 

                <li>
                    <a href="index.jsp">
                        <i class="fa fa-tasks"></i>
                        <span>Home
                       </span>
                    </a>
                </li>
            </ul>
        </div>
    </div>
    <!-- /navbar -->


    <!-- Page header -->
    <div class="container-fluid">
        <div class="page-header">
            <div class="logo"><a href=" index.jsp" title=" policymaster"><img src="userpanel/images/logo.png" alt=""></a></div>
            <ul class="middle-nav">
               
                
              
            </ul>
        </div>
    </div>
    <!-- /page header -->


    <!-- Page container -->
    <div class="page-container container-fluid">
    	
    	<!-- Sidebar -->
        <div class="sidebar collapse">
        	<ul class="navigation">
            	<li class="active"><a href="user.jsp"><i class="fa fa-laptop"></i> Dashboard</a></li>
                <li><a href="<%=request.getContextPath()%>/UserManag?param=mypolicies"><i class="fa fa-file-text-o fa-fw"></i>My Policies</a></li>
                 <li><a href="<%=request.getContextPath()%>/UserManag?param=myprofile" ><i class="fa fa-user"></i> My Profile</a></li>
                <li><a href="#" class="expand"><i class="fa fa-car">My Vehicles</i></a></li>
             </ul>
             
        </div>
        <!-- /sidebar -->

    
        <!-- Page content -->
        <div class="page-content">

            <!-- Page title -->
        	<div class="page-title">
                <h5><i class="fa fa-bars"></i> Dashboard <small>Welcome User</small></h5>
                <div class="btn-group">
                    <a href="" class="btn btn-link btn-lg btn-icon dropdown-toggle" data-toggle="dropdown"><i class="fa fa-cogs"></i><span class="caret"></span></a>
                   
                </div>
             	
            </div>
            
            <!-- /page title -->
            <div class="container-fluid myCont">
				<div class="">

					<div class="col-md-7" >

						<img src="userpanel/images/policy.jpg" alt=""  >
						
									
						</div>
					</div>
            
            <div class="col-md-5">
            
            <div class="column">
  <div class="row">
    <img src="userpanel/images/insurance.png" alt="Snow" style="float:right ;padding:5px;margin:2px;" >
  </div>
  <div class="row">
    <img src="userpanel/images/family3.jpg" alt="Forest" style="float:right ;padding:5px;margin:2px">
  </div>
  
</div>
 </div>
 </div>
 
   			
</body>
</html>