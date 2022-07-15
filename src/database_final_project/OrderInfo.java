package database_final_project;

public class OrderInfo 
{
	private String orderId;
	private String customerId;
	private String employeeId;
	private String orderDate;
	private String shippedDate;
	private String shipperId;

	public String getOrderId() 
	{
		return this.orderId;
	}
	public void setOrderId(String orderId) 
	{
		this.orderId = orderId;
	}
	public String getCustomerId() 
	{
		return this.customerId;
	}
	public void setCustomerId(String customerId) 
	{
		this.customerId = customerId;
	}
	public String getEmployeeId() 
	{
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) 
	{
		this.employeeId = employeeId;
	}
	public String getOrderDate() 
	{
		return this.orderDate;
	}
	public void setOrderDate(String orderDate) 
	{
		this.orderDate = orderDate;
	}
	public String getShippedDate() 
	{
		return this.shippedDate;
	}
	public void setShippedDate(String shippedDate) 
	{
		this.shippedDate = shippedDate;
	}
	public String getShipperId() 
	{
		return this.shipperId;
	}
	public void setShipperId(String shipperId) 
	{
		this.shipperId = shipperId;
	}
}
