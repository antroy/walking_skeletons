package antroy.restservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by anthonyr on 16/02/2016.
 */
@Configuration
public class HelloSpringConfig {
    @Bean
    public AppConfig appConfig(){
        return new EnvVarAppConfig();
    }
}
