package study.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.apollo_proposal_pojo;

import Apollo.apollo;
import study.religare.Religare;

/**
 * Servlet implementation class MemberDetails
 */
@WebServlet("/MemberDetails")
public class MemberDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MemberDetails() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				 PrintWriter pw = response.getWriter();
		
		 HttpSession session=request.getSession();	
		 String health_policy=(String) session.getAttribute("health_policy");
		 String disease=(String) session.getAttribute("member_disease");
		 String members=(String) session.getAttribute("members");
		 String medical=(String) session.getAttribute("medical");
		 System.out.println("medical: "+medical);
		
		 	boolean bool=members.contains("spouse");
	        boolean bool1=members.contains("son");
	        boolean bool2=members.contains("son1");
	        boolean bool3=members.contains("son2");
	        boolean bool4=members.contains("daughter");
	        boolean bool5=members.contains("daughter1");
		 
	     String occupation=request.getParameter("occupation");
		 String height=request.getParameter("height");
		 String height1=request.getParameter("height1");
		 String weight=request.getParameter("weight");
		 String address=request.getParameter("address");
		 String mobile=request.getParameter("mobile");
		 String email=request.getParameter("email");
		 String city=request.getParameter("city");
		 String state=request.getParameter("state");
		 String pincode=request.getParameter("pincode");
		 String nomsalutation=request.getParameter("nomsalutation");
		 String nomname=request.getParameter("nomname");
		 String nomrelation=request.getParameter("nomrelation");
		 String nommobile=request.getParameter("nommobile");
		 String nomdob=request.getParameter("nomdob");
		 String nomoccupation=request.getParameter("nomoccupation");
		 String nomemail=request.getParameter("nomemail");
		 String nomaddress=request.getParameter("nomaddress");
		 String nomcity=request.getParameter("nomcity");
		 String nomstate=request.getParameter("nomstate");
		 String nompincode=request.getParameter("nompincode");
		 
		 	String fullname="";
	        String spousefullname="";
	        String sonfullname="";
	        String son1fullname="";
	        String son2fullname="";
	        String daughterfullname="";
	        String daughter1fullname="";
	        String daughter2fullname="";
	        String salutation="";
	        String spousesalutation="";
	        String sonsalutation="";
	        String son1salutation="";
	        String son2salutation="";
	        String daughtersalutation="";
	        String daughter1salutation="";
	        String daughter2salutation="";
	        String dob="";
	        String spousedob="";
	        String sondob="";
	        String son1dob="";
	        String son2dob="";
	        String daughterdob="";
	        String daughter1dob="";
	        String daughter2dob="";
		 try {
			 	
		        String b[]=request.getParameterValues("fullname");
		        for(int i=0;i<b.length;i++){
		        	fullname=b[0];
		        	if(bool==true) {
		        		spousefullname=b[1];
		        	}
		        	else {
		        		if(bool1==true) {
		        			sonfullname=b[1];
		        		}
		        		else if(bool4==true){
		        			daughterfullname=b[1];
		        		}
		        	}
		        	if(bool1==true) {
		        		sonfullname=b[2];
		        		if(bool2==true) {
		        			son1fullname=b[3];
		        		}
		        	}
		        	else if(bool4==true){
		        		daughterfullname=b[2];
		        		if(bool5==true) {
		        			daughter1fullname=b[3];
		        			daughter2fullname=b[4];
		        		}
		        	}
		        	if(bool2==true) {
		        		son1fullname=b[3];
		        		if(bool3==true) {
		        			son2fullname=b[4];
		        		}
		        		else {
		        			daughterfullname=b[4];
		        			if(bool5==true) {
		            			daughter1fullname=b[5];
		            			daughter2fullname=b[6];
		            		}
		        			
		            			
		            		
		        		}
		        		
		        	}
		        	else {
		        		daughterfullname=b[3];
		        		if(bool5==true) {
		        			daughter1fullname=b[4];
		        			daughter2fullname=b[5];
		        		}
		        	}
		        	if(bool3==true) {
		        		son2fullname=b[4];
		        		daughterfullname=b[5];
		        		if(bool5==true) {
		        			daughter1fullname=b[6];
		        			daughter2fullname=b[7];
		        		}
		        	}
		        }
		 } catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("arrayindexoutofboundforname");
		 }
		 
		 try {	
	        String b[]=request.getParameterValues("salutation");
	        for(int i=0;i<b.length;i++){
	        	salutation=b[0];
	        	if(bool==true) {
	        		spousesalutation=b[1];
	        	}
	        	else {
	        		if(bool1==true) {
	        			sonsalutation=b[1];
	        		}
	        		else if(bool4==true){
	        			daughtersalutation=b[1];
	        		}
	        	}
	        	if(bool1==true) {
	        		sonsalutation=b[2];
	        		if(bool2==true) {
	        			son1salutation=b[3];
	        		}
	        	}
	        	else if(bool4==true){
	        		daughtersalutation=b[2];
	        		if(bool5==true) {
	        			daughter1salutation=b[3];
	        			daughter2salutation=b[4];
	        		}
	        	}
	        	if(bool2==true) {
	        		son1salutation=b[3];
	        		if(bool3==true) {
	        			son2salutation=b[4];
	        		}
	        		else {
	        			daughtersalutation=b[4];
	        			if(bool5==true) {
	            			daughter1salutation=b[5];
	            			daughter2salutation=b[6];
	            		}
	        			
	            			
	            		
	        		}
	        		
	        	}
	        	else {
	        		daughtersalutation=b[3];
	        		if(bool5==true) {
	        			daughter1salutation=b[4];
	        			daughter2salutation=b[5];
	        		}
	        	}
	        	if(bool3==true) {
	        		son2salutation=b[4];
	        		daughtersalutation=b[5];
	        		if(bool5==true) {
	        			daughter1salutation=b[6];
	        			daughter2salutation=b[7];
	        		}
	        	}
	        	
	        }
		 } catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("arrayindexoutofboundfortitle");
		 }
		 
	     try {   
	        String b[]=request.getParameterValues("dob");
	        for(int i=0;i<b.length;i++){
	        	dob=b[0];
	        	if(bool==true) {
	        		spousedob=b[1];
	        	}
	        	else {
	        		if(bool1==true) {
	        			sondob=b[1];
	        		}
	        		else if(bool4==true){
	        			daughterdob=b[1];
	        		}
	        	}
	        	if(bool1==true) {
	        		sondob=b[2];
	        		if(bool2==true) {
	        			son1dob=b[3];
	        		}
	        	}
	        	else if(bool4==true){
	        		daughterdob=b[2];
	        		if(bool5==true) {
	        			daughter1dob=b[3];
	        			daughter2dob=b[4];
	        		}
	        	}
	        	if(bool2==true) {
	        		son1dob=b[3];
	        		if(bool3==true) {
	        			son2dob=b[4];
	        		}
	        		else {
	        			daughterdob=b[4];
	        			if(bool5==true) {
	            			daughter1dob=b[5];
	            			daughter2dob=b[6];
	            		}
	        			
	            			
	            		
	        		}
	        		
	        	}
	        	else {
	        		daughterdob=b[3];
	        		if(bool5==true) {
	        			daughter1dob=b[4];
	        			daughter2dob=b[5];
	        		}
	        	}
	        	if(bool3==true) {
	        		son2dob=b[4];
	        		daughterdob=b[5];
	        		if(bool5==true) {
	        			daughter1dob=b[6];
	        			daughter2dob=b[7];
	        		}
	        	}
	        	
	        }
	     } catch(ArrayIndexOutOfBoundsException e) {
	    	 System.out.println("arrayindexoutofboundfordob");
		 }
	     
	     
		 
	    	   apollo_proposal_pojo app=new apollo_proposal_pojo();
	    	   app.setFullname(fullname);
	    	   app.setSpouse_fullname(spousefullname);
	    	   app.setSon_fullname(sonfullname);
	    	   app.setSon1_fullname(son1fullname);
	    	   app.setSon2_fullname(son2fullname);
	    	   app.setDaughter_fullname(daughterfullname);
	    	   app.setDaughter1_fullname(daughter1fullname);
	    	   app.setDaughter2_fullname(daughter2fullname);
	    	   app.setSalutation(salutation);
	    	   app.setSpouse_salutation(spousesalutation);
	    	   app.setSon_salutation(sonsalutation);
	    	   app.setSon1_salutation(son1salutation);
	    	   app.setSon2_salutation(son2salutation);
	    	   app.setDaughter_salutation(daughtersalutation);
	    	   app.setDaughter1_salutation(daughter1salutation);
	    	   app.setDaughter2_salutation(daughter2salutation);
	    	   app.setDob(dob);
	    	   app.setSpouse_dob(spousedob);
	    	   app.setSon_dob(sondob);
	    	   app.setSon1_dob(son1dob);
	    	   app.setSon2_dob(son2dob);
	    	   app.setDaughter_dob(daughterdob);
	    	   app.setDaughter1_dob(daughter1dob);
	    	   app.setDaughter2_dob(daughter2dob);
	    	   app.setOccupation(occupation);
	    	   app.setHeight(height);
	    	   app.setHeight1(height1);
	    	   app.setWeight(weight);
	    	   app.setMobile(mobile);
	    	   app.setEmail(email);
	    	   app.setAddress(address);
	    	   app.setCity(city);
	    	   app.setState(state);
	    	   app.setPincode(pincode);
	    	   app.setDisease(disease);
	    	   app.setNomsalutation(nomsalutation);
	    	   app.setNomname(nomname);
	    	   app.setNomrelation(nomrelation);
	    	   app.setNommobile(nommobile);
	    	   app.setNomdob(nomdob);
	    	   app.setNomoccupation(nomoccupation);
	    	   app.setNomemail(nomemail);
	    	   app.setNomaddress(nomaddress);
	    	   app.setNomcity(nomcity);
	    	   app.setNomstate(nomstate);
	    	   app.setNompincode(nompincode);
	    	   
	    	   
	    	   session.setAttribute("app", app);
	    	   if(health_policy.equals("Carefreedom")) {

		    	   response.sendRedirect("Rel_Pay.jsp");
		    	   study.religare.Religare.religare_premium(request, response);
	    	   }
	    	   else if(health_policy.equals("Optima_Restore")) {
	    		   if(medical.equals("Yes")) {
	    		    	 RequestDispatcher rd=request.getRequestDispatcher("healthquotes.jsp"); 
	    	 			 rd.include(request, response);
	    	 			pw.println("<script type=\"text/javascript\">");
	    	 			pw.println("alert('This Policy can not be purchased with medical history');");
	    	 		    
	    	 			pw.println("</script>");
	    		     }
	    		   else {
	    		   response.sendRedirect("diseasepaycart.jsp");
	    		   Apollo.apollo.apollo_proposal(request, response);
		    	   Apollo.apollo.apollo_payment(request, response);
	    		   }
		    	   
	    	   }
	    	   
	    	   else if(health_policy.equals("Optima_Restore_Floater")) {
	    		   response.sendRedirect("diseasepaycart.jsp");
	    		   Apollo.apollo.apollo_FloaterProposal(request, response);
		    	   Apollo.apollo.apollo_payment(request, response);
	    	  
	    	  
	    	   }
	    	   if(session!=null) {
	    		   session.removeAttribute("member_disease");
	    		   session.removeAttribute("rel_proposal_num");
	    		   session.removeAttribute("rel_premium");
	    		   session.removeAttribute("b");
	    	   }
	    	   
	    	   return;
	    	   //pw.close();
	}

}
