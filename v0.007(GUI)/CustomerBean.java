
public class CustomerBean{
	
	private int customerId;
	private String customerName;
	private String gmail;
	private String contact;
	
	public void setCustomerId(int customerId){
		this.customerId=customerId;
	}
	public int getCustomerId(){
		return customerId;
	}
	
	
	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}
	public String getCustomerName(){
		return customerName;
	}
	
	public void setGmail(String gmail){
		this.gmail=gmail;
	}
	public String getGmail(){
		return gmail;
	}
	
	public void setContact(String contact){
		this.contact=contact;
	}
	public String getContact(){
		return contact;
	}
	
	
	public String toString(){
		return customerName;
	}
	
	
}













