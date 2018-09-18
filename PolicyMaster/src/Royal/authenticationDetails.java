package Royal;

import javax.xml.bind.annotation.XmlElement;

public class authenticationDetails {
	private String agentId;
	
	private String apikey ;
	
	String apiKey ="310ZQmv/bYJMYrWQ1iYa7s43084=" ;
	private String quoteId;
	
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	@Override
	public String toString() {
		return "authenticationDetails [agentId=" + agentId + ", apikey=" + apikey + ", apiKey=" + apiKey + "]";
	}
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getApikey() {
		return apikey;
	}
	public void setApikey(String apikey) {
		this.apikey = apikey;
	}
	
	
	
	
}
