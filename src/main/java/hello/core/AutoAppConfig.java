package hello.core;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.*;

@Configuration
@ComponentScan(
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes =
                Configuration.class))
//자동으로 주입되는 것을 제한하는 기능
//사전에 만들어 놓은 AppConfig는 수동으로 주입하는 코드이기에 이를 자동주입하지 못하게 한다.


public class AutoAppConfig {

}
