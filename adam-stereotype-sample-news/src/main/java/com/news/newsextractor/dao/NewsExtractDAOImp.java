package com.news.newsextractor.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.news.newsextractor.domain.NewsExtract;
import com.news.newsextractor.repo.NewsExtractRepository;




@Repository
public class NewsExtractDAOImp implements NewsExtractDAO {


	@Autowired
	public NewsExtractRepository newsExtractRepo;
	
	@Override
	public void addNewsExtract(NewsExtract newsExtract) {
		
	newsExtractRepo.save(newsExtract);	
	}
	

}
