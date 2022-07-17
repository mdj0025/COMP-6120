package database_final_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SubmitButton extends JButton 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	DBManager dbManager;
	
	public DBManager getDbManager() 
	{
		return this.dbManager;
	}

	public void setDbManager(DBManager dbManager) 
	{
		this.dbManager = dbManager;
	}
	
	public SubmitButton(DBManager manager) {
		super("Submit");
		this.setDbManager(manager);
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				submit();
			}
		});
	}
	
	private void submit()
	{
		String inputText = GUIManager.inputForm.getText();
		if (inputText.contains("DROP"))
		{
			DataTable.displayMessage("Error");
		}
		else if (!inputText.equals(""))
		{
			this.getDbManager().executeSQL(inputText);
		}
	}
}
