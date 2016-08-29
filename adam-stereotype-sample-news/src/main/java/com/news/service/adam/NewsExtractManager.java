/*******************************************
 * Interface for General News Services
 */

package com.news.service.adam;


import com.news.model.adam.NewsExtract;

public interface NewsExtractManager {
	public void extractNews();
	public void addNewsExtract(NewsExtract newsExtract);
}
