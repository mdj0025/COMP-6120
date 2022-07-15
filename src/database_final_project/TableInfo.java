package database_final_project;


import javax.swing.tree.DefaultMutableTreeNode;


public class TableInfo extends DefaultMutableTreeNode{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

	public TableInfo(String name_in)
	{
		super();
		this.setName(name_in);
	}
	
	public void setName(String name_in)
	{
		this.name = name_in;
	}
	// test
	public String getName()
	{
		return this.name;
	}
	
	public String toString()
	{
		return this.getName();
	}
}
