package org.mrstm.RetroFitTask2;

import com.google.gson.annotations.SerializedName;

public class Geolocation{

	@SerializedName("lat")
	private String lat;

	@SerializedName("long")
	private String jsonMemberLong;

	public void setLat(String lat){
		this.lat = lat;
	}

	public String getLat(){
		return lat;
	}

	public void setJsonMemberLong(String jsonMemberLong){
		this.jsonMemberLong = jsonMemberLong;
	}

	public String getJsonMemberLong(){
		return jsonMemberLong;
	}

	@Override
 	public String toString(){
		return 
			"Geolocation{" + 
			"lat = '" + lat + '\'' + 
			",long = '" + jsonMemberLong + '\'' + 
			"}";
		}
}