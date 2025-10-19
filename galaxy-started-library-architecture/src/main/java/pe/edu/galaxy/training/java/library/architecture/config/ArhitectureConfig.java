package pe.edu.galaxy.training.java.library.architecture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.edu.galaxy.training.java.library.architecture.arq.util.FactoryUtil;

@Configuration
public class ArhitectureConfig {

    @Bean
    FactoryUtil factoryUtil(){
        return new FactoryUtil();
    }
}
