package database_final_project;

public class SupplierInfo 
{
	private String supplierId;
	private String companyName;
	private String contactLastName;
	private String contactFirstName;
	private String phone;

	public String getSupplierId() 
	{
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) 
	{
		this.supplierId = supplierId;
	}
	public String getCompanyName() 
	{
		return this.companyName;
	}
	public void setCompanyName(String companyName) 
	{
		this.companyName = companyName;
	}
	public String getContactLastName() 
	{
		return this.contactLastName;
	}
	public void setContactLastName(String contactLastName) 
	{
		this.contactLastName = contactLastName;
	}
	public String getContactFirstName() 
	{
		return this.contactFirstName;
	}
	public void setContactFirstName(String contactFirstName) 
	{
		this.contactFirstName = contactFirstName;
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
