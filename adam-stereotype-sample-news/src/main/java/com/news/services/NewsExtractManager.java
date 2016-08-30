/*******************************************
 * Interface for General News Services
 */

package com.news.services;


import com.news.models.NewsExtract;

public interface NewsExtractManager {
	public void extractNews();
	public void addNewsExtract(NewsExtract newsExtract);
}
