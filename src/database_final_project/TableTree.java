package database_final_project;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class TableTree extends JTree
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TableTree(DBManager dbManager)
	{
		super();
        DefaultTreeModel model = (DefaultTreeModel) this.getModel();
        model.setRoot(new DefaultMutableTreeNode("Tables"));
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        ArrayList<String> tableNames = dbManager.getTables();
        for (String s: tableNames)
        {
            model.insertNodeInto(new TableInfo(s), root, root.getChildCount());
        }
        this.expandPath(this.getPathForRow(0));
		this.addMouseListener(createLeafListener(dbManager));
	}
	
	private void handleNodeSelection(DBManager dbManager, DefaultMutableTreeNode node)
	{
		if (node.isLeaf())
		{
			TableInfo selectedNode = (TableInfo) node;
			String name = selectedNode.getName();
			if (name.equals("db_book"))
			{
				ArrayList<BookInfo> bookList = dbManager.getBookTableData();
				DataTable.displayBookData(GUIManager.dataTable, bookList);
			}
			else if (name.equals("db_customer"))
			{
				ArrayList<CustomerInfo> customerList = dbManager.getCustomerTableData();
				DataTable.displayCustomerData(GUIManager.dataTable, customerList);
			}
			else if (name.equals("db_employee"))
			{
				ArrayList<EmployeeInfo> employeeList = dbManager.getEmployeeTableData();
				DataTable.displayEmployeeData(GUIManager.dataTable, employeeList);
			}
			else if (name.equals("db_order"))
			{
				ArrayList<OrderInfo> orderList = dbManager.getOrderTableData();
				DataTable.displayOrderData(GUIManager.dataTable, orderList);
			}
			else if (name.equals("db_order_detail"))
			{
				ArrayList<OrderDetailInfo> orderDetailList = dbManager.getOrderDetailTableData();
				DataTable.displayOrderDetailData(GUIManager.dataTable, orderDetailList);
			}
			else if (name.equals("db_shipper"))
			{
				ArrayList<ShipperInfo> shipperList = dbManager.getShipperTableData();
				DataTable.displayShipperData(GUIManager.dataTable, shipperList);
			}
			else if (name.equals("db_subject"))
			{
				ArrayList<SubjectInfo> subjectList = dbManager.getSubjectTableData();
				DataTable.displaySubjectData(GUIManager.dataTable, subjectList);
			}
			else if (name.equals("db_supplier"))
			{
				ArrayList<SupplierInfo> supplierList = dbManager.getSupplierTableData();
				DataTable.displaySupplierData(GUIManager.dataTable, supplierList);
			}
		}
	}

	private MouseListener createLeafListener(DBManager dbManager)
	{
		TableTree tree = this;
		MouseListener listener = new MouseAdapter() {
			public void mousePressed(MouseEvent e)
			{
				if(e.getClickCount() == 2)
				{
					DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
		            tree.handleNodeSelection(dbManager, selectedNode);
				}
			}
		};
		return listener;
	}
}
