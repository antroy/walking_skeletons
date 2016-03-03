package antroy.restservice;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by ant on 03/03/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EnvVarAppConfig.class)
@TestPropertySource(locations="classpath:application.properties")
public class EnvVarAppConfigTest {

    @Test
    @Ignore
    public void testGetName() {
        AppConfig config = new EnvVarAppConfig();

        assertEquals("Default", config.getName());
    }
}