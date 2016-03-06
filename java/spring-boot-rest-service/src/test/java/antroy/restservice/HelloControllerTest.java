package antroy.restservice;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {MockServletContext.class, EnvVarAppConfig.class})
@WebAppConfiguration
public class HelloControllerTest {

    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void testIndex() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Greetings from Spring Boot!")));
    }

    @Test
    public void testGetWithParam() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/get/123").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Greetings from Spring Boot with id 123")));
    }

    @Test
    public void testList() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/list").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[\"Greetings from Spring Boot!\"]")));
    }

    @Test
    @Ignore
    public void testConf() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/conf").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[\"Greetings from ${name}!\"]")));
    }
    @Test
    public void testObject() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/object").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("{\"name\":\"Bob\",\"address1\":\"1 Sunset Blvd\",\"address2\":\"Beverley Hills\"}")));
    }

    @Test
    public void testPost() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/post").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Greetings from Spring Boot!")));
    }

    @Test
    public void testPostWithBody() throws Exception {
        String postdata = "{\"name\":\"Brian\",\"address1\":\"22 Acacia Av\",\"address2\":\"London\"}";
        mvc.perform(MockMvcRequestBuilders.post("/postwithbody").content(postdata)
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("User Brian Created")));
    }
}
