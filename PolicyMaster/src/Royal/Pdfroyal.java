package Royal;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringReader;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Servlet implementation class Pdfroyal
 */
@WebServlet("/Pdfroyal")
public class Pdfroyal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pdfroyal() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		try {
		DATA data2 = (DATA) session.getAttribute("data");
		String quoteid=data2.getQUOTE_ID();
		System.out.println("quoteid"+quoteid);
		authenticationDetails rsauthenticationDetails = new authenticationDetails();
		 rsauthenticationDetails.setAgentId(RoyalGlobalAccess.agentId);
		 rsauthenticationDetails.setApikey(RoyalGlobalAccess.apikey);
		 rsauthenticationDetails.setQuoteId(quoteid);
		 
		 String request1="quoteId="+rsauthenticationDetails.getQuoteId()+"&"+"agentId="+rsauthenticationDetails.getAgentId()+"&"+"apikey="+rsauthenticationDetails.getApikey();
		 
		 StringEntity userEntity = new StringEntity(request1);
		 System.out.println("request: "+request1);
		 HttpPost post = new HttpPost("https://www.royalsundaram.net/DTCWS/Services/TransactionHistoryService/DownloadPdf");
		 post.addHeader("content-type", "application/x-www-form-urlencoded");
		 post.addHeader("Accept", "application/pdf");
		 post.setEntity(userEntity);
		 HttpClient client = HttpClientBuilder.create().build();
		 HttpResponse response1 = client.execute(post);
		 String responseBody = EntityUtils.toString(response1.getEntity());
		 System.out.println(responseBody);
		 
		
		    response.setContentType("application/pdf");
	        ServletOutputStream sout = response.getOutputStream();
	        sout.print(responseBody);
	        String serverHomeDir = System.getenv("Downloads");
	        String reportDestination = serverHomeDir + "currdate" + ".pdf";   
	        System.out.println("reportDestination"+reportDestination);
		 //testing purpssss
		 byte[] data=responseBody.getBytes();
		 try /*(FileOutputStream fileOuputStream = new FileOutputStream("C:\\Users\\JS201801018\\Desktop\\Jack\\jack111.pdf"))*/ 
		 (FileOutputStream fileOuputStream = new FileOutputStream(reportDestination)){
	            fileOuputStream.write(data);
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }	
		 
		 System.out.println("\nResponse : "+response1.getEntity());
		 System.out.println("\nResponse Sert : "+response1);
		 response.sendRedirect("bikePayment.jsp");
		}catch (Exception e) {
			e.printStackTrace();
		}
		if(session!=null) {
			session.removeAttribute("data");
			session.removeAttribute("data1");
			session.removeAttribute("data2");
			session.removeAttribute("PremiumForOneYear");
		}
	}
}

	/*private static Document parseXmlFile(String in) {
		try {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		InputSource is = new InputSource(new StringReader(in));
		return db.parse(is);
		} catch (ParserConfigurationException e) {
		throw new RuntimeException(e);
		} catch (SAXException e) {
		throw new RuntimeException(e);
		} catch (IOException e) {
		throw new RuntimeException(e);
		}
	}*/
	/*private void performTask(HttpServletRequest request, HttpServletResponse response) throws ServletException,
	IOException {

	String pdfFileName = "pdf-test.pdf";
	String contextPath = getServletContext().getRealPath(File.separator);
	File pdfFile = new File(contextPath + pdfFileName);

	response.setContentType("application/pdf");
	response.addHeader("Content-Disposition", "attachment; filename=" + pdfFileName);
	response.setContentLength((int) pdfFile.length());

	FileInputStream fileInputStream = new FileInputStream(pdfFile);
	OutputStream responseOutputStream = response.getOutputStream();
	int bytes;
	while ((bytes = fileInputStream.read()) != -1) {
	responseOutputStream.write(bytes);
	}
	}*/
	
	/*private ByteArrayOutputStream getByteArrayOutputStream() throws IOException {

	    //String filePath = "/homefolder/";

	    String folderPath="C:\\Users\\JS201801018\\Desktop\\Jack\\jack1.pdf";

	    File file = new File(folderPath);

	    FileInputStream fis = new FileInputStream(file);



	    ByteArrayOutputStream bos = new ByteArrayOutputStream();
	    byte[] buf = new byte[256];
	     try {
	            for (int readNum; (readNum = fis.read(buf)) != -1;) {
	                bos.write(buf, 0, readNum); //no doubt here is 0
	                //Writes len bytes from the specified byte array starting at offset off to this byte array output stream.
	                System.out.println("read " + readNum + " bytes,");
	            }

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }


	    return bos;
	}*/
	


 /*class ReadTextUtil {

    public static String getContents()  {

        String data = null;
        String fileName = "thermopylae.txt";

        URL url = ReadTextUtil.class.getClassLoader().getResource(fileName);
        
        try {
            data = Files.toString(new File(url.toURI()), Charsets.UTF_8);
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(ReadTextUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

        return data;
    }
}*/


