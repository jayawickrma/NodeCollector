package lk.ijse.nodecollecter.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.nodecollecter")
@EnableWebMvc
public class WebAppConfig {
}
