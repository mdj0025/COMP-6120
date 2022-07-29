package database_final_project;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class DataTable extends JTable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataTable()
	{
		super();
		this.setVisible(true);
		this.setShowGrid(true);
		this.setFont(new Font("Serif", Font.PLAIN, 15));
	}
	
	public static void displayBookData(DataTable table, ArrayList<BookInfo> bookList)
	{
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

		removeRows(tableModel);

		String[] headers = {"BookID", "Title", "UnitPrice", "Author", "Quantity", "SupplierID", "SubjectID"};
		tableModel.setColumnIdentifiers(headers);
		tableModel.addRow(headers);
		for(BookInfo bookInfo: bookList)
		{
			Object[] data = {bookInfo.getBookId(), bookInfo.getTitle(), bookInfo.getPrice(),
					bookInfo.getAuthor(), bookInfo.getQuantity(), bookInfo.getSupplierId(), bookInfo.getSubjectId()};

			tableModel.addRow(data);
		}
	}
	
	public static void displayCustomerData(DataTable table, ArrayList<CustomerInfo> customerList)
	{
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

		removeRows(tableModel);

		String[] headers = {"CustomerID", "LastName", "FirstName", "Phone"};
		tableModel.setColumnIdentifiers(headers);
		tableModel.addRow(headers);
		for(CustomerInfo customerInfo: customerList)
		{
			Object[] data = {customerInfo.getCustomerId(), customerInfo.getLastName(),
					customerInfo.getFirstName(), customerInfo.getPhone()};

			tableModel.addRow(data);
		}
	}

	public static void displayEmployeeData(DataTable table, ArrayList<EmployeeInfo> employeeList)
	{
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

		removeRows(tableModel);

		String[] headers = {"EmployeeID", "LastName", "FirstName"};
		tableModel.setColumnIdentifiers(headers);
		tableModel.addRow(headers);
		for(EmployeeInfo employeeInfo: employeeList)
		{
			Object[] data = {employeeInfo.getEmployeeId(), employeeInfo.getLastName(), employeeInfo.getFirstName()};

			tableModel.addRow(data);
		}
	}

	public static void displayOrderData(DataTable table, ArrayList<OrderInfo> orderList)
	{
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

		removeRows(tableModel);

		String[] headers = {"OrderID", "CustomerID", "EmployeeID", "OrderDate", "ShippedDate", "ShipperID"};
		tableModel.setColumnIdentifiers(headers);
		tableModel.addRow(headers);
		for(OrderInfo orderInfo: orderList)
		{
			Object[] data = {orderInfo.getOrderId(), orderInfo.getCustomerId(), orderInfo.getEmployeeId(),
					orderInfo.getOrderDate(), orderInfo.getShippedDate(), orderInfo.getShipperId()};

			tableModel.addRow(data);
		}
	}

	public static void displayOrderDetailData(DataTable table, ArrayList<OrderDetailInfo> orderDetailList)
	{
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

		removeRows(tableModel);

		String[] headers = {"BookID", "OrderID", "Quantity"};
		tableModel.setColumnIdentifiers(headers);
		tableModel.addRow(headers);
		for(OrderDetailInfo orderDetailInfo: orderDetailList)
		{
			Object[] data = {orderDetailInfo.getBookId(), orderDetailInfo.getOrderId(), orderDetailInfo.getQuantity()};

			tableModel.addRow(data);
		}
	}

	public static void displayShipperData(DataTable table, ArrayList<ShipperInfo> shipperList)
	{
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

		removeRows(tableModel);

		String[] headers = {"ShipperID", "ShipperName"};
		tableModel.setColumnIdentifiers(headers);
		tableModel.addRow(headers);
		for(ShipperInfo shipperInfo: shipperList)
		{
			Object[] data = {shipperInfo.getShipperId(), shipperInfo.getShipperName()};

			tableModel.addRow(data);
		}
	}

	public static void displaySubjectData(DataTable table, ArrayList<SubjectInfo> subjectList)
	{
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

		removeRows(tableModel);

		String[] headers = {"SubjectID", "CategoryName"};
		tableModel.setColumnIdentifiers(headers);
		tableModel.addRow(headers);
		for(SubjectInfo subjectInfo: subjectList)
		{
			Object[] data = {subjectInfo.getSubjectId(), subjectInfo.getCategoryName()};

			tableModel.addRow(data);
		}
	}

	public static void displaySupplierData(DataTable table, ArrayList<SupplierInfo> supplierList)
	{
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

		removeRows(tableModel);

		String[] headers = {"SupplierID", "CompanyName", "ContactLastName", "ContactFirstName", "Phone"};
		tableModel.setColumnIdentifiers(headers);
		tableModel.addRow(headers);
		for(SupplierInfo supplierInfo: supplierList)
		{
			Object[] data = {supplierInfo.getSupplierId(), supplierInfo.getCompanyName(), supplierInfo.getContactLastName(),
					supplierInfo.getContactFirstName(), supplierInfo.getPhone()};

			tableModel.addRow(data);
		}
	}

	public static void displayMessage(String message)
	{
		DefaultTableModel model = (DefaultTableModel) GUIManager.dataTable.getModel();
		removeRows(model);
		
		Object[] messageArray = {message};
		model.setColumnCount(1);
		model.addRow(messageArray);
	}

	public static void removeRows(DefaultTableModel tableModel)
	{
		int rowCount = tableModel.getRowCount();
		for (int index = 0; index < rowCount; index++)
		{
			tableModel.removeRow(0);
		}
	}
	
	public static void resize(DataTable table)
	{
		TableColumnModel columnModel = table.getColumnModel();
		TableModel tableModel = table.getModel();
		int columnCount = columnModel.getColumnCount();
		
		for (int columnIndex = 0; columnIndex < columnCount; columnIndex++)
		{
			int maxWidth = 0;
			int rowCount = tableModel.getRowCount();
			for (int rowIndex = 0; rowIndex < rowCount; rowIndex++)
			{
				if (tableModel.getValueAt(rowIndex, columnIndex) != null)
				{
					int width = tableModel.getValueAt(rowIndex, columnIndex).toString().length() * 10;
					if (width > maxWidth)
					{
						maxWidth = width;
					}
				}
				columnModel.getColumn(columnIndex).setPreferredWidth(maxWidth);
			}
		}
				
	}
}
