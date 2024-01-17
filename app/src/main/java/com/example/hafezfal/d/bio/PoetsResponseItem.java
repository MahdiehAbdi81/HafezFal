package com.example.hafezfal.d.bio;

import com.squareup.moshi.Json;

public class PoetsResponseItem {

	@Json(name = "deathYearInLHijri")
	private int deathYearInLHijri;

	@Json(name = "birthPlaceLatitude")
	private Object birthPlaceLatitude;

	@Json(name = "birthYearInLHijri")
	private int birthYearInLHijri;

	@Json(name = "birthPlaceLongitude")
	private Object birthPlaceLongitude;

	@Json(name = "fullUrl")
	private String fullUrl;

	@Json(name = "description")
	private Object description;

	@Json(name = "published")
	private boolean published;

	@Json(name = "pinOrder")
	private int pinOrder;

	@Json(name = "rootCatId")
	private int rootCatId;

	@Json(name = "birthPlace")
	private String birthPlace;

	@Json(name = "validBirthDate")
	private boolean validBirthDate;

	@Json(name = "deathPlace")
	private String deathPlace;

	@Json(name = "imageUrl")
	private String imageUrl;

	@Json(name = "name")
	private String name;

	@Json(name = "nickname")
	private String nickname;

	@Json(name = "validDeathDate")
	private boolean validDeathDate;

	@Json(name = "id")
	private int id;

	@Json(name = "deathPlaceLatitude")
	private Object deathPlaceLatitude;

	@Json(name = "deathPlaceLongitude")
	private Object deathPlaceLongitude;

	public int getDeathYearInLHijri(){
		return deathYearInLHijri;
	}

	public Object getBirthPlaceLatitude(){
		return birthPlaceLatitude;
	}

	public int getBirthYearInLHijri(){
		return birthYearInLHijri;
	}

	public Object getBirthPlaceLongitude(){
		return birthPlaceLongitude;
	}

	public String getFullUrl(){
		return fullUrl;
	}

	public Object getDescription(){
		return description;
	}

	public boolean isPublished(){
		return published;
	}

	public int getPinOrder(){
		return pinOrder;
	}

	public int getRootCatId(){
		return rootCatId;
	}

	public String getBirthPlace(){
		return birthPlace;
	}

	public boolean isValidBirthDate(){
		return validBirthDate;
	}

	public String getDeathPlace(){
		return deathPlace;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public String getName(){
		return name;
	}

	public String getNickname(){
		return nickname;
	}

	public boolean isValidDeathDate(){
		return validDeathDate;
	}

	public int getId(){
		return id;
	}

	public Object getDeathPlaceLatitude(){
		return deathPlaceLatitude;
	}

	public Object getDeathPlaceLongitude(){
		return deathPlaceLongitude;
	}
}