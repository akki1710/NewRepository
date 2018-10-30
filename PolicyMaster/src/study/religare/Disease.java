package study.religare;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Disease
 */
@WebServlet("/Disease")
public class Disease extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Disease() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter(); 
        String self_disease="";
        String member_disease="";
        String[] a=request.getParameterValues("self_disease");
        String[] a1=request.getParameterValues("member_disease");
        
        if(a!=null && a1!=null) {
     	   for(int i=0;i<a.length;i++)
            {
         	   self_disease+=a[i]+",";
         	   }
     	   for(int i=0;i<a1.length;i++)
            {
         	   member_disease+=a1[i]+",";
         	   }
     	  
       	response.sendRedirect("Religare");
        }
        else if(a!=null) {
        for(int i=0;i<a.length;i++)
        {
     	   self_disease+=a[i]+",";
     	   member_disease=null;
     	   }
        
    	response.sendRedirect("Religare");
        }
        else if(a1!=null) {
        for(int i=0;i<a1.length;i++)
        {
     	   member_disease+=a1[i]+",";
     	   self_disease=null;
     	   }
        
    	response.sendRedirect("Religare");
        }
        else {
     	   RequestDispatcher rd=request.getRequestDispatcher("disease.jsp"); 
 			 rd.include(request, response);
 		    out.println("<script type=\"text/javascript\">");
 		    out.println("alert('Please select a checkbox');");
 		    
 		   out.println("</script>");
     	   
        }
        System.out.println("self_disease: "+self_disease);
        System.out.println("member_disease: "+member_disease);
       
	}

}
