/*
 * This is News Extractor service Implementation
 */
package com.news.newsextractor.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.news.newsextractor.dao.NewsExtractDAO;
import com.news.newsextractor.domain.NewsExtract;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;

@Service
public class NewsExtractManagerImpl implements NewsExtractManager {

	@Autowired
	public NewsExtractDAO newsExtractDAO;
	
	public void extractNews() {
		  @SuppressWarnings("rawtypes")
		  CsvToBean csv = new CsvToBean();
	      String filePath = new File("csv01.csv").getAbsolutePath(); 
	      String csvFilename = filePath;
	 	  CSVReader csvReader = null;
		try {
			csvReader = new CSVReader(new FileReader(csvFilename), ',' , '"' , 1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	       
	      //Set column mapping strategy
	       
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List list = csv.parse(setColumMapping(), csvReader);
	    
		for (Object object : list) {
	       NewsExtract newsExtract = (NewsExtract) object;
	       addNewsExtract(newsExtract);
	       System.out.println(newsExtract);
	     }
	   }		
	@SuppressWarnings({"rawtypes", "unchecked"})
	   private static ColumnPositionMappingStrategy setColumMapping()
	   {
	      ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
	      strategy.setType(NewsExtract.class);
	      String[] columns = new String[] {"url", "image", "imageAlt", "mediaLink", 
	    		  "mediaLinkAlt", "mediaTagLink","mediaTagLinkAlt", "blockOverlayLink",
	    		  "blockOverlayLinkAlt"}; 
	      strategy.setColumnMapping(columns);
	      return strategy;
	   }

	@Override
	public void addNewsExtract(NewsExtract newsExtract) {
		newsExtractDAO.addNewsExtract(newsExtract);
				
	}

}
