package database_final_project;

public class BookInfo {
	private String bookId;
	
	private String title;
	
	private double price;
	
	private String author;
	
	private int quantity;
	
	private String supplierId;
	
	private String subjectId;
	
	public String getBookId() 
	{
		return this.bookId;
	}
	public void setBookId(String bookId) 
	{
		this.bookId = bookId;
	}
	public String getTitle() 
	{
		return this.title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public double getPrice() 
	{
		return this.price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public String getAuthor() 
	{
		return this.author;
	}
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	public int getQuantity() 
	{
		return this.quantity;
	}
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	public String getSupplierId() 
	{
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) 
	{
		this.supplierId = supplierId;
	}
	public String getSubjectId() 
	{
		return this.subjectId;
	}
	public void setSubjectId(String subjectId) 
	{
		this.subjectId = subjectId;
	}
}
