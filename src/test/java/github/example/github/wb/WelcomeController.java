package github.example.github.wb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
class WelcomeController {
 private MockMvc mockmvc;
 
 @Autowired
 private WebApplicationContext context;
  @Before
  public void setUp() throws Exception
  {
	mockmvc = MockMvcBuilders.webAppContextSetup(context).build();  
  }
	@Test
	public void testWelcome() throws Exception {
		//mockmvc.perform(get("/")).andExpect(status.isOk()).andExpect(model().attribute("course",containsString("Devops")));
	}

}
