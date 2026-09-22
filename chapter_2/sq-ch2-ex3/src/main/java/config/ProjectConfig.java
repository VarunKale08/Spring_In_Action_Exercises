package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.example.Parrot;
import org.springframework.context.annotation.Primary;


@Configuration
public class ProjectConfig {

    @Bean
    @Primary
    Parrot parrot1(){
        var p = new Parrot();
        p.setName("miki");
        return p;
    }

    @Bean
    Parrot parrot2(){
        var p = new Parrot();
        p.setName("kiki");
        return p;
    }
}
