package com.news.newsextractor;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.news.newsextractor.repo.NewsExtractRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AdamStereotypeSampleNewsApplicationTests {
	
	public static final String data1 = "{\"url\": \"http://www.bbc.com\", \"image\":\"http://ichef.bbci.co.uk/wwhp/999/cpsprodpb/13D4C/production/_90882218_p045kp34.jpg\",\"imageAlt\":\"Lupe and Maria\", \"mediaLink\":\"Mexican Mother\", \"mediaLinkAlt\":\"\", \"mediaTagLink\":\"US\", \"mediaTagLinkAlt\":\"\", \"blockOverlayLink\":\"\", \"blockOverlayLinkAlt\":\"\" }";
	public static final String data2 = "{\"url\": \"http://www.xyz.com\", \"image\":\"http://ichef.bbci.co.uk/wwhp/999/cpsprodpb/13D4C/production/_90882218_p045kp34.jpg\",\"imageAlt\":\"Lupe and Maria\", \"mediaLink\":\"Mexican Mother\", \"mediaLinkAlt\":\"\", \"mediaTagLink\":\"UK\", \"mediaTagLinkAlt\":\"\", \"blockOverlayLink\":\"\", \"blockOverlayLinkAlt\":\"\" }";
	public static final String search1 = "US";
	public static final String url1 = "http://www.bbc.com";
	public static final String url2 = "http://www.xyz.com";
	
	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private NewsExtractRepository newsRepo;
	
	@Before
	public void deleteAllBeforeTests() throws Exception {
		newsRepo.deleteAll();
	}

	@Test
	public void shouldReturnRepositoryIndex() throws Exception {

		mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk()).andExpect(
				jsonPath("$._links.News").exists());
	}

	@Test
	public void shouldCreateEntity() throws Exception {

		mockMvc.perform(post("/News").content(data1)).andExpect(
						status().isCreated()).andExpect(
								header().string("Location", containsString("News/")));
	}

	@Test
	public void shouldRetrieveEntity() throws Exception {
		
		MvcResult mvcResult = mockMvc.perform(post("/News").content(data1)).andExpect(
						status().isCreated()).andReturn();


		String location = mvcResult.getResponse().getHeader("Location");
		mockMvc.perform(get(location)).andExpect(status().isOk()).andExpect(
				jsonPath("$.url").value("http://www.bbc.com")).andExpect(
						jsonPath("$.image").value("http://ichef.bbci.co.uk/wwhp/999/cpsprodpb/13D4C/production/_90882218_p045kp34.jpg"));
	}
	
	@Test
	public void shouldQueryEntity() throws Exception {

		mockMvc.perform(post("/News").content(data1)).andExpect(
				status().isCreated());
		
		mockMvc.perform(
				get("/News/search/findBymediaTagLink?name={name}", search1)).andExpect(
						status().isOk()).andExpect(
								jsonPath("$._embedded.News[0].url").value(
										url1));	
	}	
	

	@Test
	public void shouldUpdateEntity() throws Exception {

		MvcResult mvcResult = mockMvc.perform(post("/News").content(data1)).andExpect(
						status().isCreated()).andReturn();

		String location = mvcResult.getResponse().getHeader("Location");

		mockMvc.perform(put(location).content(data2)).andExpect(
						status().isNoContent());

		mockMvc.perform(get(location)).andExpect(status().isOk()).andExpect(
				jsonPath("$.url").value(url2)).andExpect(
						jsonPath("$.mediaTagLink").value("UK"));
	}
	
	@Test
	public void shouldPartiallyUpdateEntity() throws Exception {

		MvcResult mvcResult = mockMvc.perform(post("/News").content(data1)).andExpect(
						status().isCreated()).andReturn();

		String location = mvcResult.getResponse().getHeader("Location");

		mockMvc.perform(
				patch(location).content("{\"url\": \"http://www.xyz.com\"}")).andExpect(
						status().isNoContent());

		mockMvc.perform(get(location)).andExpect(status().isOk()).andExpect(
				jsonPath("$.url").value(url2)).andExpect(
						jsonPath("$.mediaTagLink").value("US"));
	}
	@Test
	public void contextLoads() {
	}

}
