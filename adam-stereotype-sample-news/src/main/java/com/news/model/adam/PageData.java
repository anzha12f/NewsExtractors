package com.news.model.adam;

public class PageData {
	
	private String resourceId;
	
	private Integer statusCode;
	
	private Integer timestamp;
	
	public String getResourceId() {
		return resourceId;
	}

	
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public Integer getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}

}
