package database_final_project;

public class CustomerInfo {
	private String customerId;
	private String lastName;
	private String firstName;
	private String phone;
	
	public String getCustomerId() 
	{
		return this.customerId;
	}
	public void setCustomerId(String customerId) 
	{
		this.customerId = customerId;
	}
	public String getLastName() 
	{
		return this.lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public String getFirstName() 
	{
		return this.firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getPhone() 
	{
		return this.phone;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

}