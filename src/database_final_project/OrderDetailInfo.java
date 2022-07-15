package database_final_project;

public class OrderDetailInfo 
{
	private String bookId;
	private String orderId;
	private int quantity;

	public String getBookId() 
	{
		return bookId;
	}
	public void setBookId(String bookId) 
	{
		this.bookId = bookId;
	}
	public String getOrderId()
	{
		return orderId;
	}
	public void setOrderId(String orderId) 
	{
		this.orderId = orderId;
	}
	public int getQuantity() 
	{
		return quantity;
	}
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
}
