package com.example.hafezfal.d;

import com.squareup.moshi.Json;

public class Top6RelatedSectionsItem{

	@Json(name = "sectionIndex")
	private int sectionIndex;

	@Json(name = "relationOrder")
	private int relationOrder;

	@Json(name = "poetName")
	private String poetName;

	@Json(name = "fullTitle")
	private String fullTitle;

	@Json(name = "poetId")
	private int poetId;

	@Json(name = "fullUrl")
	private String fullUrl;

	@Json(name = "poemId")
	private int poemId;

	@Json(name = "poetMorePoemsLikeThisCount")
	private int poetMorePoemsLikeThisCount;

	@Json(name = "targetPoemId")
	private int targetPoemId;

	@Json(name = "targetSectionIndex")
	private int targetSectionIndex;

	@Json(name = "poem")
	private Object poem;

	@Json(name = "poetImageUrl")
	private String poetImageUrl;

	@Json(name = "id")
	private int id;

	@Json(name = "htmlExcerpt")
	private String htmlExcerpt;

	public int getSectionIndex(){
		return sectionIndex;
	}

	public int getRelationOrder(){
		return relationOrder;
	}

	public String getPoetName(){
		return poetName;
	}

	public String getFullTitle(){
		return fullTitle;
	}

	public int getPoetId(){
		return poetId;
	}

	public String getFullUrl(){
		return fullUrl;
	}

	public int getPoemId(){
		return poemId;
	}

	public int getPoetMorePoemsLikeThisCount(){
		return poetMorePoemsLikeThisCount;
	}

	public int getTargetPoemId(){
		return targetPoemId;
	}

	public int getTargetSectionIndex(){
		return targetSectionIndex;
	}

	public Object getPoem(){
		return poem;
	}

	public String getPoetImageUrl(){
		return poetImageUrl;
	}

	public int getId(){
		return id;
	}

	public String getHtmlExcerpt(){
		return htmlExcerpt;
	}
}