package com.news.model.adam;

import java.util.ArrayList;
import java.util.List;

public class ExtractorData {

	private String url;
	
	private String resourceId;
	
	private List<NewsData> data = new ArrayList<>();
	
	public String getUrl() {
		return url;
		}

		
	public void setUrl(String url) {
		this.url = url;
		}

	
	public String getResourceId() {
		return resourceId;
		}

	
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		}

	
	public List<NewsData> getData() {
		return data;
		}

	
	public void setData(List<NewsData> data) {
		this.data = data;
		}
}
