package Royal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="status")
public class STATUS {
	private String StatusCode;
	private String Message;
	
	public String getStatusCode() {
		return StatusCode;
	}
	
	public void setStatusCode(String statusCode) {
		StatusCode = statusCode;
	}
	public String getMessage() {
		return Message;
	}
	      
	public void setMessage(String message) {
		Message = message;
	}
	@Override
	public String toString() {
		return "STATUS [StatusCode=" + StatusCode + ", Message=" + Message + "]";
	} 

}
