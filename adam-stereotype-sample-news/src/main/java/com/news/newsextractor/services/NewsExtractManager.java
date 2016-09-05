/*******************************************
 * Interface for General News Services
 */

package com.news.newsextractor.services;

import com.news.newsextractor.domain.NewsExtract;

public interface NewsExtractManager {
	public void extractNews();
	public void addNewsExtract(NewsExtract newsExtract);
}
