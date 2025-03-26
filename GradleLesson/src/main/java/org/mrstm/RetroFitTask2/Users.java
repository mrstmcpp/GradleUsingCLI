package org.mrstm.RetroFitTask2;

import com.google.gson.annotations.SerializedName;

public class Users{

	@SerializedName("password")
	private String password;

	@SerializedName("address")
	private Address address;

	@SerializedName("phone")
	private String phone;

	@SerializedName("__v")
	private int v;

	@SerializedName("name")
	private Name name;

	@SerializedName("id")
	private int id;

	@SerializedName("email")
	private String email;

	@SerializedName("username")
	private String username;

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setAddress(Address address){
		this.address = address;
	}

	public Address getAddress(){
		return address;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setV(int v){
		this.v = v;
	}

	public int getV(){
		return v;
	}

	public void setName(Name name){
		this.name = name;
	}

	public Name getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"Users{" + 
			"password = '" + password + '\'' + 
			",address = '" + address + '\'' + 
			",phone = '" + phone + '\'' + 
			",__v = '" + v + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",email = '" + email + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}