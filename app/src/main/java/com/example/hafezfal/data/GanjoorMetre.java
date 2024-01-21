package com.example.hafezfal.data;

import com.squareup.moshi.Json;

public class GanjoorMetre{

	@Json(name = "urlSlug")
	private Object urlSlug;

	@Json(name = "verseCount")
	private int verseCount;

	@Json(name = "name")
	private Object name;

	@Json(name = "description")
	private Object description;

	@Json(name = "id")
	private int id;

	@Json(name = "rhythm")
	private String rhythm;

	public Object getUrlSlug(){
		return urlSlug;
	}

	public int getVerseCount(){
		return verseCount;
	}

	public Object getName(){
		return name;
	}

	public Object getDescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public String getRhythm(){
		return rhythm;
	}
}