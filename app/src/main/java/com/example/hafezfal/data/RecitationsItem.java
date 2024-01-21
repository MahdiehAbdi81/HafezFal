package com.example.hafezfal.data;

import java.util.List;
import com.squareup.moshi.Json;

public class RecitationsItem{

	@Json(name = "mp3SizeInBytes")
	private int mp3SizeInBytes;

	@Json(name = "xmlText")
	private String xmlText;

	@Json(name = "audioSrc")
	private String audioSrc;

	@Json(name = "poemId")
	private int poemId;

	@Json(name = "publishDate")
	private String publishDate;

	@Json(name = "mistakes")
	private List<Object> mistakes;

	@Json(name = "audioOrder")
	private int audioOrder;

	@Json(name = "mp3FileCheckSum")
	private String mp3FileCheckSum;

	@Json(name = "inSyncWithText")
	private boolean inSyncWithText;

	@Json(name = "legacyAudioGuid")
	private String legacyAudioGuid;

	@Json(name = "poemFullTitle")
	private String poemFullTitle;

	@Json(name = "recitationType")
	private int recitationType;

	@Json(name = "fileLastUpdated")
	private String fileLastUpdated;

	@Json(name = "audioArtist")
	private String audioArtist;

	@Json(name = "audioArtistUrl")
	private String audioArtistUrl;

	@Json(name = "audioSrcUrl")
	private String audioSrcUrl;

	@Json(name = "plainText")
	private String plainText;

	@Json(name = "id")
	private int id;

	@Json(name = "audioTitle")
	private String audioTitle;

	@Json(name = "poemFullUrl")
	private String poemFullUrl;

	@Json(name = "mp3Url")
	private String mp3Url;

	@Json(name = "htmlText")
	private String htmlText;

	@Json(name = "upVotedByUser")
	private boolean upVotedByUser;

	public int getMp3SizeInBytes(){
		return mp3SizeInBytes;
	}

	public String getXmlText(){
		return xmlText;
	}

	public String getAudioSrc(){
		return audioSrc;
	}

	public int getPoemId(){
		return poemId;
	}

	public String getPublishDate(){
		return publishDate;
	}

	public List<Object> getMistakes(){
		return mistakes;
	}

	public int getAudioOrder(){
		return audioOrder;
	}

	public String getMp3FileCheckSum(){
		return mp3FileCheckSum;
	}

	public boolean isInSyncWithText(){
		return inSyncWithText;
	}

	public String getLegacyAudioGuid(){
		return legacyAudioGuid;
	}

	public String getPoemFullTitle(){
		return poemFullTitle;
	}

	public int getRecitationType(){
		return recitationType;
	}

	public String getFileLastUpdated(){
		return fileLastUpdated;
	}

	public String getAudioArtist(){
		return audioArtist;
	}

	public String getAudioArtistUrl(){
		return audioArtistUrl;
	}

	public String getAudioSrcUrl(){
		return audioSrcUrl;
	}

	public String getPlainText(){
		return plainText;
	}

	public int getId(){
		return id;
	}

	public String getAudioTitle(){
		return audioTitle;
	}

	public String getPoemFullUrl(){
		return poemFullUrl;
	}

	public String getMp3Url(){
		return mp3Url;
	}

	public String getHtmlText(){
		return htmlText;
	}

	public boolean isUpVotedByUser(){
		return upVotedByUser;
	}
}