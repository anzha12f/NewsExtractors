package com.news.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.news.models.NewsExtract;
import com.news.repos.NewsExtractRepository;

@Repository
public class NewsExtractDAOImp implements NewsExtractDAO {


	@Autowired
	public NewsExtractRepository newsExtractRepo;
	
	@Override
	public void addNewsExtract(NewsExtract newsExtract) {
		
	// newsExtractRepo.save(newsExtract);	
	}
	

}
