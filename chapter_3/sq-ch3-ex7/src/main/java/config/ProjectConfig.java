package config;


import beans.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {

    @Bean
    Parrot parrot1(){
        var p = new Parrot();
        p.setParrotName("kiki");
        return p;
    }

    @Bean
    Parrot parrot2(){
        var p= new Parrot();
        p.setParrotName("suki");
        return p;
    }

}
