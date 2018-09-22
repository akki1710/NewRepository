<%@page import="java.sql.Connection"%>
    <%@ page import="study.db.*" %>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.sql.SQLException" %>
    <%@ page import="java.sql.PreparedStatement" %>
    <%@ page import="java.sql.ResultSet" %>
    <%@ page import="java.util.List" %>
<%@include file="include_css.jsp" %>
<link href="css/style1.css" rel="stylesheet">
        <link href="css/style9.css" rel="stylesheet" type="text/css" media="all"/>
        <style>
            body{background:url(img/xyz.jpg)no-repeat center center;background-size:cover;background-attachment:fixed;}
            .list-group button{padding: .75rem 1.25rem; cursor: pointer; }
        </style>
<%@include file="menu.jsp" %>
<%
String Model=(String) session.getAttribute("Model");
String FuelType=(String) session.getAttribute("FuelType");
List<String> al=new ArrayList<String>();

try {
	Connection con = Db.myGetConnection();
	 PreparedStatement ps = con.prepareStatement("select distinct model_desc from shriram_vehicle_master where model=? && fuel_desc=?");
	 ps.setString(1,Model);
	 ps.setString(2,FuelType);
	 ResultSet rs = ps.executeQuery();
	 while(rs.next()) {
		 String variant=rs.getString("model_desc");
		 //System.out.println("variant: "+variant);
		 al.add(variant);
		 //System.out.println("variant: "+al);
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
                <div class="col-md-12">
                   <p>CAR INSURANCE</p>
                    <h2><span class="label success">Select a Variant</span></h2><br>   
                    <form action="Servlet1" method="post">
                        <div class="list-group">
                            <div class="">
                            <%for(String s:al){ %>
    <button id="btn1" class="col-md-4 list-group-item list-group-item-success" type="submit" name="Variant" value="<%=s%>"><%=s %></button>
    <%} %>
                              </div>
                        </div>
                    </form>
                </div>
             </div>
       </div>
 <!--==========================
    Footer
  ============================-->
<%@include file="footer.jsp" %>