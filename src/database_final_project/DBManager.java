package database_final_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBManager {

	/**
	 * Holds the connection to the database.
	 */
	private Connection databaseConnection;

	/**
	 * Get the database connection.
	 *
	 * @return Connection to the database.
	 */
	public Connection getDatabaseConnection()
	{
		return this.databaseConnection;
	}

	/**
	 * Set the database connection.
	 *
	 * @param connection Connection to set the db connection to.
	 */
	public void setDatabaseConnection(Connection connection)
	{
		this.databaseConnection = connection;
	}
	
	public ArrayList<String> getTables()
	{
		String query = "SELECT table_name FROM information_schema.tables "
				+ "WHERE table_schema = 'test';";
		ArrayList<String> tableList = new ArrayList<String>();
		try (Statement statement = this.getDatabaseConnection().createStatement())
		{
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next())
			{
				String tableName = resultSet.getString("table_name");
				tableList.add(tableName);
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		return tableList;
	}

	public ArrayList<BookInfo> getBookTableData()
	{
		String query = "SELECT BookID, Title, UnitPrice, Author, Quantity, SupplierID, SubjectID "
				+ "FROM test.db_book;";

		ArrayList<BookInfo> bookList = new ArrayList<BookInfo>();
		try (Statement statement = this.getDatabaseConnection().createStatement())
		{
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next())
			{
				BookInfo bookInfo = new BookInfo();
				bookInfo.setBookId(resultSet.getString("BookID"));
				bookInfo.setTitle(resultSet.getString("Title"));
				bookInfo.setPrice(resultSet.getDouble("UnitPrice"));
				bookInfo.setAuthor(resultSet.getString("Author"));
				bookInfo.setQuantity(resultSet.getInt("Quantity"));
				bookInfo.setSupplierId(resultSet.getString("SupplierID"));
				bookInfo.setSubjectId(resultSet.getString("SubjectID"));
				bookList.add(bookInfo);
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		return bookList;
	}

	public ArrayList<CustomerInfo> getCustomerTableData()
	{
		String query = "SELECT CustomerID, LastName, FirstName, Phone "
				+ "FROM test.db_customer;";

		ArrayList<CustomerInfo> customerList = new ArrayList<CustomerInfo>();
		try (Statement statement = this.getDatabaseConnection().createStatement())
		{
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next())
			{
				CustomerInfo customerInfo = new CustomerInfo();
				customerInfo.setCustomerId(resultSet.getString("CustomerID"));
				customerInfo.setLastName(resultSet.getString("LastName"));
				customerInfo.setFirstName(resultSet.getString("FirstName"));
				customerInfo.setPhone(resultSet.getString("Phone"));
				customerList.add(customerInfo);
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		return customerList;
	}

	public ArrayList<EmployeeInfo> getEmployeeTableData()
	{
		String query = "SELECT EmployeeID, LastName, FirstName "
				+ "FROM test.db_employee;";

		ArrayList<EmployeeInfo> employeeList = new ArrayList<EmployeeInfo>();
		try (Statement statement = this.getDatabaseConnection().createStatement())
		{
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next())
			{
				EmployeeInfo employeeInfo = new EmployeeInfo();
				employeeInfo.setEmployeeId(resultSet.getString("EmployeeID"));
				employeeInfo.setLastName(resultSet.getString("LastName"));
				employeeInfo.setFirstName(resultSet.getString("FirstName"));
				employeeList.add(employeeInfo);
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		return employeeList;
	}

	public ArrayList<OrderInfo> getOrderTableData()
	{
		String query = "SELECT OrderID, CustomerID, EmployeeID, OrderDate, ShippedDate, ShipperID "
				+ "FROM test.db_order;";

		ArrayList<OrderInfo> orderList = new ArrayList<OrderInfo>();
		try (Statement statement = this.getDatabaseConnection().createStatement())
		{
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next())
			{
				OrderInfo orderInfo = new OrderInfo();
				orderInfo.setOrderId(resultSet.getString("OrderID"));
				orderInfo.setCustomerId(resultSet.getString("CustomerID"));
				orderInfo.setEmployeeId(resultSet.getString("EmployeeID"));
				orderInfo.setOrderDate(resultSet.getString("OrderDate"));
				orderInfo.setShippedDate(resultSet.getString("ShippedDate"));
				orderInfo.setShipperId(resultSet.getString("ShipperID"));
				orderList.add(orderInfo);
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		return orderList;
	}
	
	public ArrayList<OrderDetailInfo> getOrderDetailTableData()
	{
		String query = "SELECT BookID, OrderID, Quantity "
				+ "FROM test.db_order_detail;";

		ArrayList<OrderDetailInfo> orderDetailList = new ArrayList<OrderDetailInfo>();
		try (Statement statement = this.getDatabaseConnection().createStatement())
		{
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next())
			{
				OrderDetailInfo orderDetailInfo = new OrderDetailInfo();
				orderDetailInfo.setBookId(resultSet.getString("BookID"));
				orderDetailInfo.setOrderId(resultSet.getString("OrderID"));
				orderDetailInfo.setQuantity(resultSet.getInt("Quantity"));
				orderDetailList.add(orderDetailInfo);
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		return orderDetailList;
	}
	
	public ArrayList<ShipperInfo> getShipperTableData()
	{
		String query = "SELECT ShipperID, ShpperName "
				+ "FROM test.db_shipper;";

		ArrayList<ShipperInfo> shipperList = new ArrayList<ShipperInfo>();
		try (Statement statement = this.getDatabaseConnection().createStatement())
		{
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next())
			{
				ShipperInfo shipperInfo = new ShipperInfo();
				shipperInfo.setShipperId(resultSet.getString("ShipperID"));
				shipperInfo.setShipperName(resultSet.getString("ShpperName"));
				shipperList.add(shipperInfo);
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		return shipperList;
	}

	public ArrayList<SubjectInfo> getSubjectTableData()
	{
		String query = "SELECT SubjectID, CategoryName "
				+ "FROM test.db_subject;";

		ArrayList<SubjectInfo> subjectList = new ArrayList<SubjectInfo>();
		try (Statement statement = this.getDatabaseConnection().createStatement())
		{
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next())
			{
				SubjectInfo subjectInfo = new SubjectInfo();
				subjectInfo.setSubjectId(resultSet.getString("SubjectID"));
				subjectInfo.setCategoryName(resultSet.getString("CategoryName"));
				subjectList.add(subjectInfo);
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		return subjectList;
	}

	public ArrayList<SupplierInfo> getSupplierTableData()
	{
		String query = "SELECT SupplierID, CompanyName, ContactLastName, ContactFirstName, Phone "
				+ "FROM test.db_supplier;";

		ArrayList<SupplierInfo> supplierList = new ArrayList<SupplierInfo>();
		try (Statement statement = this.getDatabaseConnection().createStatement())
		{
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next())
			{
				SupplierInfo supplierInfo = new SupplierInfo();
				supplierInfo.setSupplierId(resultSet.getString("SupplierID"));
				supplierInfo.setCompanyName(resultSet.getString("CompanyName"));
				supplierInfo.setContactLastName(resultSet.getString("ContactLastName"));
				supplierInfo.setContactFirstName(resultSet.getString("ContactFirstName"));
				supplierInfo.setPhone(resultSet.getString("Phone"));
				supplierList.add(supplierInfo);
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		return supplierList;
	}

	/**
	 * Method to connect to the database.
	 *
	 * @return true if database successfully connects, false otherwise.
	 */
	public boolean connect()
	{
		boolean status = false;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
			this.setDatabaseConnection(connection);
            status = true;
		}
		catch (Exception e) 
		{
			System.out.println("Error connecting to database.");
		}
		return status;
	}
}
