package dubbo.spring.javaconfig;

import cn.ebatech.imixpark.demo.consumer.DemoJavaConfigAction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DubboDemoActionConfig {

    @Bean
    public DemoJavaConfigAction demoAnnotationAction() {
        return new DemoJavaConfigAction();
    }

}
