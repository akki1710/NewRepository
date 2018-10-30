  package Apollo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ConfirmPaymentStatus")
public class ConfirmPaymentStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmPaymentStatus() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("PaymentStatus.jsp");  
		requestDispatcher.forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		
		String responsecode=request.getParameter("ResponseCode");
		String PaymentId=request.getParameter("PaymentId");
		String Message=request.getParameter("Message");
		String MerchantRefNo=request.getParameter("MerchantRefNo");
		String TransactionId=request.getParameter("TransactionId");
		session.setAttribute("TransactionId", TransactionId);
		System.out.println("responsecode: "+responsecode);
		System.out.println("PaymentId: "+PaymentId);
		System.out.println("Message: "+Message);
		System.out.println("MerchantRefNo: "+MerchantRefNo);
		System.out.println("TransactionId: "+TransactionId);
		if(responsecode.equals("0")) {
			Apollo.apollo.apollo_paymentVerification(request, response);
			
			
		}
		
		else {
			System.out.println("NOT SUCCESSFULL");
			pw.println("NOT SUCCESSFULL");
		}
		/*if(Integer.valueOf(request.getParameter(" responsecode")) !=0) {
			System.out.println("error: not successful ");
			//TODO set any other attribute required on jsp
			request.setAttribute("responsecode", response);
			request.setAttribute("transactionId", response);
			doGet(request, response);	
		}*/
		
	}

}
