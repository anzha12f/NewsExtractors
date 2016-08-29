package com.news.model.adam;

public class NewsExtractor {
	private ExtractorData extractorData;
	
	private PageData pageData;
	
	private String url;
	
	private String runtimeConfigId;
	
	private Integer timestamp;
	
	// Constructor
	
	public ExtractorData getExtractorData() {
		return extractorData;
	}

	// Getter/Setter
	
	public void setExtractorData(ExtractorData extractorData) {
		this.extractorData = extractorData;
	}

	
	public PageData getPageData() {
		return pageData;
	}

	
	public void setPageData(PageData pageData) {
		this.pageData = pageData;
	}

	
	public String getUrl() {
		return url;
	}

	
	public void setUrl(String url) {
		this.url = url;
	}

	
	public String getRuntimeConfigId() {
		return runtimeConfigId;
	}

	
	public void setRuntimeConfigId(String runtimeConfigId) {
		this.runtimeConfigId = runtimeConfigId;
	}

	
	public Integer getTimestamp() {
		return timestamp;
	}

	
	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}
}
