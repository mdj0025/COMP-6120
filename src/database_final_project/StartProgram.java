package database_final_project;


public class StartProgram {
	
	public static void main(String[] args) 
	{
		DBManager dbManager = new DBManager();
        if (dbManager.connect())
        {
        	GUIManager.startGUI(dbManager);
        }
	}
}
