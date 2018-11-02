package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.w3c.dom.Document;

import com.fasterxml.jackson.databind.ObjectMapper;

import study.db.Db;

/**
 * Servlet implementation class LibIssuePolicyServlet
 */
@WebServlet("/LibIssuePolicyServlet")
public class LibIssuePolicyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LibIssuePolicyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter(); 
		
		 HttpSession session=request.getSession();
		 HttpClient client = HttpClientBuilder.create().build();
		 PostPremiumDetails finalresponse=(PostPremiumDetails) session.getAttribute("finalresponse");
		 
		 String FullName=finalresponse.getFullName();
		 String Email=finalresponse.getEmailID();
		 String Mobile=finalresponse.getMobileNumber();
		 
		 String GCCustomerID = finalresponse.getCustomerID();
		 //String IMDNumber = (String) session.getAttribute("IMDNumber");
		 //String IMDNumber="IMD1010030";
		 String IMDNumber="IMD1101839";
		 Double PremiumAmount = finalresponse.getTotalPremium();
		 String TotalPremium=Double.toString(PremiumAmount);
		 String QuotationNumber = finalresponse.getQuotationNumber();
		 String TransactionID = finalresponse.getTxn();
		 String TPEmailID = finalresponse.getEmailID();
		 System.out.println("TPEmailID "+TPEmailID);
		 String PaymentDate = finalresponse.getPaymentDate();

		 LibSuccessPayPojo sp = new LibSuccessPayPojo();
		 String productCode= finalresponse.getProductCode();
	        
	        System.out.println(productCode);
		 
		 sp.setGCCustomerID(GCCustomerID);
		 sp.setIMDNumber(IMDNumber);
		 sp.setOfficeCode("110034");
		 sp.setPremiumAmount(PremiumAmount);
		 sp.setProductCode(productCode);
		 sp.setQuotationNumber(QuotationNumber);
		 sp.setPaymentSource("LGI-PAYU");
		 sp.setPaymentDate(PaymentDate);
		sp.setTransactionID(TransactionID);
		sp.setTPEmailID(TPEmailID);
		sp.setSendEmailtoCustomer(true);
		sp.setTPSourceName("TPService");
		sp.setOTP("");
		sp.setOTPCreatedDate("");
		sp.setOTPEnteredDate("");
		
		try {
			
			ObjectMapper objectMapper = new ObjectMapper();
			String jsonRequest=objectMapper.writeValueAsString(sp);
			System.out.println("Request :  "+jsonRequest);
			
			HttpPost pos = new HttpPost("https://api.libertyinsurance.in/Motor/API/IMDTPService/GetPolicy");
		//	HttpPost pos = new HttpPost("http://168.87.83.122:8180/api/IMDTPService/GetPolicy");
			StringEntity userEntity = new StringEntity(jsonRequest);
			pos.setEntity(userEntity);
			pos.setHeader("Content-Type", "application/json");
			HttpResponse res=client.execute(pos);

			String res_json = EntityUtils.toString(res.getEntity());
			System.out.println("\nResponse : "+res_json);
			
			JSONObject obj = new JSONObject(res_json);
			System.out.println("Get Policy Response coming....");
			System.out.println(obj.get("PolicyNumber"));
			
			if(obj.get("PolicyNumber").toString().equals(null))
			{
				response.sendRedirect("error.jsp");
			}
			else
			{
				
				String Message=(String) obj.get("Message");
				String PolicyNumber=(String) obj.get("PolicyNumber");
				Double PolicyID=(Double) obj.get("PolicyID");
				String ApprovePolSysId=Double.toString(PolicyID);
				
				session.setAttribute("Message", Message);
				session.setAttribute("PolicyNumber", PolicyNumber);
				session.setAttribute("PolicyID", PolicyID);
				
				System.out.println(Message);
				System.out.println(PolicyNumber);
				System.out.println(PolicyID);
				
	
  				
				 String policy=(String) session.getAttribute("policy");
 			Connection con = Db.myGetConnection();
 			 if(Mobile!=null) {
 				String s="insert into final_details(ProposalNo, ApprovePolNo, ApprovePolSysId,TotalPremium,PolicyName,FullName,Email,Mobile) values(?,?,?,?,?,?,?,?)";
 				PreparedStatement stmt = con.prepareStatement(s);
 				stmt.setString(1, QuotationNumber);
 				stmt.setString(2, PolicyNumber);
 				stmt.setString(3, ApprovePolSysId);
 				stmt.setString(4, TotalPremium);
 				stmt.setString(5, policy);
 				stmt.setString(6, FullName);
 				stmt.setString(7, Email);
 				stmt.setString(8, Mobile);
 				 stmt.executeUpdate();
 				 stmt.close();
 				 System.out.println("lib data inserted");
 			 }
				 
				response.sendRedirect("success.jsp");
	
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if(session!=null) {
			session.removeAttribute("finalresponse");
			
		}
	}
}
