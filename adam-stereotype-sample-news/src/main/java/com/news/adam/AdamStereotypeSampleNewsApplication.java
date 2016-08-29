package com.news.adam;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.news.model.adam.NewsExtractor;
import com.news.service.adam.NewsExtractManager;
import com.news.service.adam.NewsExtractManagerImp;


@SpringBootApplication
public class AdamStereotypeSampleNewsApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("NewsExtractManagerImp")
	public NewsExtractManagerImp newsExtractManager;
	
	 @SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(AdamStereotypeSampleNewsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AdamStereotypeSampleNewsApplication.class, args);
	}
	// @Inject
	// @Named("NewsService")
	
	
	
	@Override
    public void run(String... args) throws Exception {
		
		newsExtractManager.extractNews();
		// ClientHttpRequestFactory requestFactory = new     
		//	      HttpComponentsClientHttpRequestFactory(HttpClients.createDefault());
        // RestTemplate restTemplate = new RestTemplate(requestFactory);
        // HttpHeaders headers = new HttpHeaders();
        // headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        // HttpEntity<String> request = new HttpEntity<String>(headers);
        // NewsExtractor[] newsExtractor = restTemplate.getForObject(
        // try{
        //	restTemplate.exchange(  	
        //"https://extraction.import.io/query/extractor/27fbe19e-948c-4e86-978f-8e47d20e2dd7?_apikey=f061d58d0c3143328963590772a3d2faf0930826de3437657f3aaa2fe18810dd0081b63f0126184f8eaba3c4f1c9060147d85fd6798d08d6baf00e9423f59c82a9398ff6b9a16d199617b2fedc6faff7&url=http%3A%2F%2Fwww.bbc.com",
        // HttpMethod.GET, request, String.class);
        //} catch(HttpStatusCodeException e){
        //	String errorpayload = e.getResponseBodyAsString();
        //	log.info(errorpayload);
        	//to whatever you want
       // 	} catch(RestClientException e){
        	//no response payload, tell the user sth else
        //	}
           //log.info(newsExtractor.toString());
    }
}

