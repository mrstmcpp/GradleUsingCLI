package org.mrstm.RetroFitTask2;

import com.google.gson.annotations.SerializedName;

public class Name{

	@SerializedName("firstname")
	private String firstname;

	@SerializedName("lastname")
	private String lastname;

	public void setFirstname(String firstname){
		this.firstname = firstname;
	}

	public String getFirstname(){
		return firstname;
	}

	public void setLastname(String lastname){
		this.lastname = lastname;
	}

	public String getLastname(){
		return lastname;
	}

	@Override
 	public String toString(){
		return 
			"Name{" + 
			"firstname = '" + firstname + '\'' + 
			",lastname = '" + lastname + '\'' + 
			"}";
		}
}