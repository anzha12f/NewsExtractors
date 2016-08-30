package com.news.model;

import java.util.ArrayList;
import java.util.List;

public class NewsGroup {

	private List<MediaLink> mediaLink = new ArrayList<MediaLink>();
	
	public List<MediaLink> getMediaLink() {
		return mediaLink;
	}
	
	public void setMediaLink(List<MediaLink> mediaLink) {
		this.mediaLink = mediaLink;
	}
}
