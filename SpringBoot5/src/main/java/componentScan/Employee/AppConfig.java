package componentScan.Employee;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "componentScan.Employee")
public class AppConfig {

}
