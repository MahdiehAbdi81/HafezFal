package com.example.hafezfal.data;

import com.squareup.moshi.Json;

public class VersesItem{

	@Json(name = "vOrder")
	private int vOrder;

	@Json(name = "coupletIndex")
	private int coupletIndex;

	@Json(name = "versePosition")
	private int versePosition;

	@Json(name = "coupletSummary")
	private Object coupletSummary;

	@Json(name = "languageId")
	private Object languageId;

	@Json(name = "id")
	private int id;

	@Json(name = "text")
	private String text;

	@Json(name = "sectionIndex3")
	private Object sectionIndex3;

	@Json(name = "sectionIndex4")
	private Object sectionIndex4;

	@Json(name = "sectionIndex1")
	private int sectionIndex1;

	@Json(name = "sectionIndex2")
	private Object sectionIndex2;

	public int getVOrder(){
		return vOrder;
	}

	public int getCoupletIndex(){
		return coupletIndex;
	}

	public int getVersePosition(){
		return versePosition;
	}

	public Object getCoupletSummary(){
		return coupletSummary;
	}

	public Object getLanguageId(){
		return languageId;
	}

	public int getId(){
		return id;
	}

	public String getText(){
		return text;
	}

	public Object getSectionIndex3(){
		return sectionIndex3;
	}

	public Object getSectionIndex4(){
		return sectionIndex4;
	}

	public int getSectionIndex1(){
		return sectionIndex1;
	}

	public Object getSectionIndex2(){
		return sectionIndex2;
	}
}