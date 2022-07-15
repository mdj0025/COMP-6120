package database_final_project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;

public class GUIManager {
	public static JFrame mainFrame;
	public static TableTree tree;
	public static InputForm inputForm;
	public static DataTable dataTable;
	
	
	public static void startGUI(DBManager dbManager)
	{
		mainFrame = new JFrame("Database manager");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tree = new TableTree(dbManager);
		inputForm = new InputForm();
		dataTable = new DataTable();

		JPanel treePanel = new JPanel();

		JPanel dataPanel = new JPanel();
		JPanel resultsPanel = new JPanel();

		treePanel.add(tree);
		resultsPanel.add(inputForm);
		dataPanel.add(dataTable);
		
		JSplitPane horizontalPane = new JSplitPane(SwingConstants.HORIZONTAL, dataPanel, resultsPanel);
		
		JSplitPane splitPane = new JSplitPane(SwingConstants.VERTICAL, treePanel, horizontalPane);
		mainFrame.add(splitPane);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
}
