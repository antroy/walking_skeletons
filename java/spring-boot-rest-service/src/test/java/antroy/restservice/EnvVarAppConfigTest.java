package antroy.restservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by ant on 03/03/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EnvVarAppConfig.class)
public class EnvVarAppConfigTest {

    @Autowired
    AppConfig config;

    @Test
    public void testGetName() {
        assertEquals("${name}", config.getName());
    }
}