<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="rp" class="ServeletBean.RegPJ"/>
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
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
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
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password] {
    width:100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
    background-color: #ddd;
    outline: none;
}

hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 286px;
    border: none;
    cursor: pointer;
    width: 70%;
    opacity: 0.9;
}

button:hover {
    opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container {
    padding: 16px;
}

/* Clear floats */
.clearfix::after {
    content: "";
    clear: both;
    display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
       width: 100%;
    }
}
</style>
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
                            <li><a href="#"><i class="fa fa-cog"></i> Settings</a></li>
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
                        <span>Home</span>
                    </a>
                </li>
            </ul>
        </div>
    </div>
    <!-- /navbar -->


    <!-- Page header -->
    <div class="container-fluid">
        <div class="page-header">
            <div class="logo"><a href=" index.jsp" title=""><img src="userpanel/images/logo.png" alt=""></a></div>
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
                 <li>
                    <a href="MyProfile.jsp" class="expand"><i class="fa fa-user">My Profile</i></a>
                    
                </li>
                <li>
                    <a href="#" class="expand"><i class="fa fa-cab">My Vehicles</i></a>
                    
                </li>
             
            </ul>
        </div>
        <!-- /sidebar -->

    
        <!-- Page content -->
        <div class="page-content">

            <!-- Page title -->
        	<div class="page-title">
                <h5><i class="fa fa-bars"></i> Dashboard <small>Welcome User</small></h5>
                <div class="btn-group">
                    <a href="#" class="btn btn-link btn-lg btn-icon dropdown-toggle" data-toggle="dropdown"><i class="fa fa-cogs"></i><span class="caret"></span></a>
                    
                </div>
     
   
  
  </div>  
            <!-- /page title -->
            <form action="UserManag" method="get">
 <div class="container" style="border:1px solid #ccc;padding:60px; float:left;">

    <h1>MY Profile</h1>
   
    <hr>
	<%try{
	rp=(ServeletBean.RegPJ)session.getAttribute( "rp" ); %>
   <label for="Phoneno"><b>Mobile no </b></label>
    <input type="text" placeholder="Enter Mobile no " name="Phoneno" value="<%= rp.getPhoneno()%>" required>
    <br>
     <label for="Name"><b>Name</b></label>
    <input type="text" placeholder="Enter  Name" name="Name" value="<%= rp.getName()%>" required>
    <br>
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="Email"  value="<%= rp.getEmail()%>"required>
    
    <br>
    <label for="BirthDate"><b>Date of Birth</b></label>
    <input type="text" placeholder="Enter Date of Birth" name="BirthDate" value="<%= rp.getBirthdate()%>" required>
    <br>
    <label for="City"><b>City</b></label>
    <input type="text" placeholder="Enter City" name="City"  value="<%= rp.getCity()%>"required>
    <br>
    <%} catch (Exception e){ 
    }%>
 <div class="clearfix">
    </div>
  </div>
  </form>
 
  <div class="column">
  <div class="row">
    <img src="userpanel/images/insurance.png" alt="Snow" style="float:right ;padding:5px;margin:5px;" >
    <div class="row">
    <img src="userpanel/images/family3.jpg" alt="Forest" style="float:right ;padding:5px;margin:5px">
  </div>
  
  
  </div>
  </div>
</form>

</body>
</html>
