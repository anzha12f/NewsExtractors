package com.news.dao.adam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.news.model.adam.NewsExtract;
import com.news.repo.adam.NewsExtractRepository;

@Repository
public class NewsExtractDAOImp implements NewsExtractDAO {


	@Autowired
	public NewsExtractRepository newsExtractRepo;
	
	@Override
	public void addNewsExtract(NewsExtract newsExtract) {
		
	// newsExtractRepo.save(newsExtract);	
	}
	

}
