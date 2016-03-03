package antroy.restservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by anthonyr on 16/02/2016.
 */
public class EnvVarAppConfig implements AppConfig {

    @Value("${name}")
    private String name;

    @Override
    public String getName() {
        //return SystemEnvironmentPropertySource.named("NAME").toString();
//        String out = System.getProperty("NAME", "BBBBBBB");
        if (name == null) {
            name = "Not Set...";
        }
        return name;
    }
}
