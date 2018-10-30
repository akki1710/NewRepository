<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.List" %>
<%@ page import="ServeletBean.RegPJ" %>
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
.myCont {
	padding: 0 30px 0 0;
}
.col-md-8{
padding: 0px; margin: 0px
}
.col{
float: right; padding: 5px; margin: 5px
}
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
			<div class="logo">
				<a href="index.jsp" title="PolicyMaster"><img
					src="userpanel/images/logo.png" alt=""></a>
			</div>

		</div>
	</div>
	<!-- /page header -->


	<!-- Page container -->
	<div class="page-container container-fluid">

		<!-- Sidebar -->
		<div class="sidebar collapse">
			<ul class="navigation">
				<li class="active"><a href="user.jsp"><i
						class="fa fa-laptop"></i> Dashboard</a></li>
				<li><a href="MyPolicy.jsp"><i
						class="fa fa-file-text-o fa-fw"></i>My Policies</a></li>
				<li><a href="<%=request.getContextPath()%>/UserManag?param=myprofile"><i class="fa fa-user"></i> My
						Profile</a></li>
				<li><a href="#" class="expand"><i class="fa fa-car">My
							Vehicles</i></a></li>

			</ul>
		</div>
		<!-- /sidebar -->


		<!-- Page content -->
		<div class="page-content">
		<div class="page-title">
                 <h5><i class="fa fa-bars"></i> Dashboard <small>Welcome User</small></h5>
                <div class="btn-group">
                    <a href="#" class="btn btn-link btn-lg btn-icon dropdown-toggle" data-toggle="dropdown"><i class="fa fa-cogs"></i><span class="caret"></span></a> 
                    
                </div>
                	
				
			</div>
			<!-- /page title -->
			<form action="UserManag" method=get>
			<%List<RegPJ> rp2=(List<RegPJ>) session.getAttribute("rp2"); %>
			 <div class="container-fluid myCont">
				<div class="">

					<div class="col-md-7" >

						<div class="table-responsive">
							<table class="table table-striped table-hover table-bordered"
								width="100%">
								
								<thead>
									<tr class="td">
										<th class="th" width=4%>#</th>
										<th>Full Name</th>
										<th>Email</th>
										<th>Mobile</th>
										<th>Proposal no</th>
										<th>Policy no</th>
										<th>Total Premium</th>
										<th>Policy Name</th>
										
										
										</tr>
										
								</thead>
								<%try{
								for(int i=0;i<rp2.size();i++) {%>
								<thead>
									<tr class="td">
										<th class="th" width=4%>#</th>
										<th><%=rp2.get(i).getName() %></th>
										<th><%=rp2.get(i).getEmail() %></th>
										<th><%=rp2.get(i).getPhoneno() %></th>
										<th><%=rp2.get(i).getProposalNo() %></th>
										<th><%=rp2.get(i).getApprovePolNo() %></th>
										<th><%=rp2.get(i).getTotalPremium() %></th>
										<th><%=rp2.get(i).getPolicyName()%></th>
										
										
										</tr>
										
								</thead>
								<%}}catch (Exception e){
								 }%>
							</table>
							
						</div>
					</div> 
     			</div>
     		</div>	
   			</form>
  
 <div class="col-md-5" >
 
  <div class="column">
  <div class="row">
    <img src="userpanel/images/insurance.png" alt="Snow" style="float:right ;padding:2px;margin:5px;" >
    <div class="row">
    <img src="userpanel/images/family3.jpg" alt="Forest" style="float:right ;padding:2px;margin:5px">
  </div>
  
  </div>
  </div>
  </div>

 

				
			
</body>
</html>