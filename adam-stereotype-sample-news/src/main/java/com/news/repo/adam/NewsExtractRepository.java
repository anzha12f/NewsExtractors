package com.news.repo.adam;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.news.model.adam.NewsExtract;

@RepositoryRestResource(collectionResourceRel = "News", path = "News")
public interface NewsExtractRepository extends MongoRepository<NewsExtract, String> {

		List<NewsExtract> findByMediaLink(@Param("name") String name);
}
