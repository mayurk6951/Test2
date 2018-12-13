package com.galvanize.Kumquat_Republic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KumquatRepublicApplicationTests {

	@MockBean
	objectRepository objrepo;

	@Autowired
	private MockMvc mocmvc;

	@Test
	public void contextLoads() {
	}


	@Test
	public void test_byBrand() throws Exception {
		ObjectFrame objf = new ObjectFrame();
		when(objrepo.save(objf)).thenReturn(objf);
		mocmvc.perform(MockMvcRequestBuilders.post("product/brand/Gucci")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andDo(print());

	}

	@Test
	public void test_byColor() throws Exception {
		ObjectFrame objf = new ObjectFrame();
		when(objrepo.save(objf)).thenReturn(objf);
		mocmvc.perform(MockMvcRequestBuilders.post("product/brand/Yellow")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andDo(print());

	}

	@Test
	public void test_byprice() throws Exception {
		ObjectFrame objf = new ObjectFrame();
		when(objrepo.save(objf)).thenReturn(objf);
		mocmvc.perform(MockMvcRequestBuilders.post("product/brand/100/12000")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andDo(print());

	}

	@Test
	public void test_byfilter() throws Exception {
		ObjectFrame objf = new ObjectFrame();
		when(objrepo.save(objf)).thenReturn(objf);
		mocmvc.perform(MockMvcRequestBuilders.post("product/brand/Gucci/Color")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andDo(print());

	}

	@Test
	public void test_ascprice() throws Exception {
		ObjectFrame objf = new ObjectFrame();
		when(objrepo.save(objf)).thenReturn(objf);
		mocmvc.perform(MockMvcRequestBuilders.post("product/brand/ascprice")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andDo(print());

	}

	@Test
	public void test_descprice() throws Exception {
		ObjectFrame objf = new ObjectFrame();
		when(objrepo.save(objf)).thenReturn(objf);
		mocmvc.perform(MockMvcRequestBuilders.post("product/brand/descprice")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andDo(print());

	}
}


