package com.example.hafezfal.d;

import java.util.List;
import com.squareup.moshi.Json;

public class SectionsItem{

	@Json(name = "ganjoorMetre")
	private GanjoorMetre ganjoorMetre;

	@Json(name = "top6RelatedSections")
	private List<Top6RelatedSectionsItem> top6RelatedSections;

	@Json(name = "poetId")
	private int poetId;

	@Json(name = "oldGanjoorMetreId")
	private Object oldGanjoorMetreId;

	@Json(name = "poemId")
	private int poemId;

	@Json(name = "index")
	private int index;

	@Json(name = "ganjoorMetreId")
	private int ganjoorMetreId;

	@Json(name = "language")
	private Object language;

	@Json(name = "poemFormat")
	private int poemFormat;

	@Json(name = "number")
	private int number;

	@Json(name = "rhymeLetters")
	private String rhymeLetters;

	@Json(name = "poem")
	private Object poem;

	@Json(name = "verseType")
	private int verseType;

	@Json(name = "ganjoorMetreRefSectionIndex")
	private Object ganjoorMetreRefSectionIndex;

	@Json(name = "cachedFirstCoupletIndex")
	private int cachedFirstCoupletIndex;

	@Json(name = "oldRhymeLetters")
	private Object oldRhymeLetters;

	@Json(name = "plainText")
	private String plainText;

	@Json(name = "modified")
	private boolean modified;

	@Json(name = "poet")
	private Object poet;

	@Json(name = "id")
	private int id;

	@Json(name = "sectionType")
	private int sectionType;

	@Json(name = "excerpt")
	private Object excerpt;

	@Json(name = "htmlText")
	private String htmlText;

	public GanjoorMetre getGanjoorMetre(){
		return ganjoorMetre;
	}

	public List<Top6RelatedSectionsItem> getTop6RelatedSections(){
		return top6RelatedSections;
	}

	public int getPoetId(){
		return poetId;
	}

	public Object getOldGanjoorMetreId(){
		return oldGanjoorMetreId;
	}

	public int getPoemId(){
		return poemId;
	}

	public int getIndex(){
		return index;
	}

	public int getGanjoorMetreId(){
		return ganjoorMetreId;
	}

	public Object getLanguage(){
		return language;
	}

	public int getPoemFormat(){
		return poemFormat;
	}

	public int getNumber(){
		return number;
	}

	public String getRhymeLetters(){
		return rhymeLetters;
	}

	public Object getPoem(){
		return poem;
	}

	public int getVerseType(){
		return verseType;
	}

	public Object getGanjoorMetreRefSectionIndex(){
		return ganjoorMetreRefSectionIndex;
	}

	public int getCachedFirstCoupletIndex(){
		return cachedFirstCoupletIndex;
	}

	public Object getOldRhymeLetters(){
		return oldRhymeLetters;
	}

	public String getPlainText(){
		return plainText;
	}

	public boolean isModified(){
		return modified;
	}

	public Object getPoet(){
		return poet;
	}

	public int getId(){
		return id;
	}

	public int getSectionType(){
		return sectionType;
	}

	public Object getExcerpt(){
		return excerpt;
	}

	public String getHtmlText(){
		return htmlText;
	}
}