package com.assessment.Aisling;

public class Name {

	private String title;
	private String fName;
	private String lName;
	
	/**
	 * @param title
	 * @param fName
	 * @param lName
	 */
	public Name() {
		
	}
			
	/**
	 * @param title
	 * @param fName
	 * @param lName
	 */
	public Name(String title, String fName, String lName) {
		super();
		this.title = title;
		this.fName = fName;
		this.lName = lName;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	
	
}
