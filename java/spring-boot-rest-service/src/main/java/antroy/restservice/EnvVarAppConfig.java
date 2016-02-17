package antroy.restservice;

import org.springframework.context.annotation.Bean;
import org.springframework.core.env.SystemEnvironmentPropertySource;

/**
 * Created by anthonyr on 16/02/2016.
 */
public class EnvVarAppConfig implements AppConfig {
    @Override
    public String getName() {
        //return SystemEnvironmentPropertySource.named("NAME").toString();
        String out = System.getProperty("NAME", "BBBBBBB");
        if (out == null) {
            out = "Not Set...";
        }
        return out;
    }
}
