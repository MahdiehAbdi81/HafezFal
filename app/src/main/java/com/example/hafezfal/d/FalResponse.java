package com.example.hafezfal.d;

import java.util.List;
import com.squareup.moshi.Json;

public class FalResponse{

	@Json(name = "next")
	private Object next;

	@Json(name = "geoDateTags")
	private List<Object> geoDateTags;

	@Json(name = "recitations")
	private List<RecitationsItem> recitations;

	@Json(name = "language")
	private Object language;

	@Json(name = "title")
	private String title;

	@Json(name = "plainText")
	private String plainText;

	@Json(name = "id")
	private int id;

	@Json(name = "mixedModeOrder")
	private int mixedModeOrder;

	@Json(name = "htmlText")
	private String htmlText;

	@Json(name = "claimedByMultiplePoets")
	private boolean claimedByMultiplePoets;

	@Json(name = "urlSlug")
	private String urlSlug;

	@Json(name = "sectionIndex")
	private Object sectionIndex;

	@Json(name = "fullTitle")
	private String fullTitle;

	@Json(name = "sourceUrlSlug")
	private String sourceUrlSlug;

	@Json(name = "images")
	private Object images;

	@Json(name = "comments")
	private Object comments;

	@Json(name = "previous")
	private Object previous;

	@Json(name = "fullUrl")
	private String fullUrl;

	@Json(name = "oldTagPageUrl")
	private Object oldTagPageUrl;

	@Json(name = "published")
	private boolean published;

	@Json(name = "sections")
	private List<SectionsItem> sections;

	@Json(name = "songs")
	private Object songs;

	@Json(name = "oldTag")
	private Object oldTag;

	@Json(name = "poemSummary")
	private Object poemSummary;

	@Json(name = "top6QuotedPoems")
	private List<Object> top6QuotedPoems;

	@Json(name = "sourceName")
	private String sourceName;

	@Json(name = "category")
	private Object category;

	@Json(name = "verses")
	private List<VersesItem> verses;

	public Object getNext(){
		return next;
	}

	public List<Object> getGeoDateTags(){
		return geoDateTags;
	}

	public List<RecitationsItem> getRecitations(){
		return recitations;
	}

	public Object getLanguage(){
		return language;
	}

	public String getTitle(){
		return title;
	}

	public String getPlainText(){
		return plainText;
	}

	public int getId(){
		return id;
	}

	public int getMixedModeOrder(){
		return mixedModeOrder;
	}

	public String getHtmlText(){
		return htmlText;
	}

	public boolean isClaimedByMultiplePoets(){
		return claimedByMultiplePoets;
	}

	public String getUrlSlug(){
		return urlSlug;
	}

	public Object getSectionIndex(){
		return sectionIndex;
	}

	public String getFullTitle(){
		return fullTitle;
	}

	public String getSourceUrlSlug(){
		return sourceUrlSlug;
	}

	public Object getImages(){
		return images;
	}

	public Object getComments(){
		return comments;
	}

	public Object getPrevious(){
		return previous;
	}

	public String getFullUrl(){
		return fullUrl;
	}

	public Object getOldTagPageUrl(){
		return oldTagPageUrl;
	}

	public boolean isPublished(){
		return published;
	}

	public List<SectionsItem> getSections(){
		return sections;
	}

	public Object getSongs(){
		return songs;
	}

	public Object getOldTag(){
		return oldTag;
	}

	public Object getPoemSummary(){
		return poemSummary;
	}

	public List<Object> getTop6QuotedPoems(){
		return top6QuotedPoems;
	}

	public String getSourceName(){
		return sourceName;
	}

	public Object getCategory(){
		return category;
	}

	public List<VersesItem> getVerses(){
		return verses;
	}
}