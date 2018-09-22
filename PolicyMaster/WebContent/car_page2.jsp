 <%@ page import="study.db.*" %>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.sql.SQLException" %>
    <%@ page import="java.sql.PreparedStatement" %>
    <%@ page import="java.sql.ResultSet" %>
    <%@ page import="java.util.List" %>
    <%@page import="java.sql.Connection"%>
<%@include file="include_css.jsp" %>
<link href="css/style1.css" rel="stylesheet">
        <link href="css/style9.css" rel="stylesheet" type="text/css" media="all"/>
        <style>
        .container{background:transparent}
        .col-md-8{background: rgba(0, 0, 0, 0.63);margin: 0 auto; padding:20px 0 40px}
            body{background:url(img/xyz.jpg)no-repeat center center;background-size:cover;background-attachment:fixed;}
            .list-group button{padding: .75rem 1.25rem; cursor: pointer; }
        </style>
<%@include file="menu.jsp" %>
<%
String manufacturer=(String) session.getAttribute("Manufacturer");

List<String> al=new ArrayList<String>();
try {
	Connection con = Db.myGetConnection();
	 PreparedStatement ps = con.prepareStatement("select distinct model from shriram_vehicle_master where manf_desc=?");
	 ps.setString(1,manufacturer);
	 ResultSet rs = ps.executeQuery();
	 while(rs.next()) {
		 String model=rs.getString("model");
		 //System.out.println("model: "+model);
		 al.add(model);
	 }
	 rs.close();
	 ps.close();
	 con.close();
} catch (SQLException e) {
	e.printStackTrace();
} catch (NullPointerException e){
	e.printStackTrace();
}
%>
 <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <p>CAR INSURANCE</p>
                    <h2><span class="label success">Select a Model</span></h2><br>   
                    <form action="Servlet1" method="post">
                        <div class="list-group">
                            <div class="">
                            	<%for(String s:al){ %>
    <button id="btn1" class="col-md-4 list-group-item list-group-item-success" type="submit" name="b1" value="<%=s%>"><%=s %></button>
    <%} %>
	
                            </div>
                        </div>
                    </form>
                </div>
            </div>
      </div>
      
<%@include file="footer.jsp" %>