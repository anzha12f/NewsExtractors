package com.news.model.adam;

import java.util.ArrayList;
import java.util.List;

public class NewsData {

	private List<NewsGroup> group = new ArrayList<NewsGroup>();
	
	public List<NewsGroup> getGroup() {
		return group;
		}
		
	public void setGroup(List<NewsGroup> group) {
		this.group = group;
		}
}
