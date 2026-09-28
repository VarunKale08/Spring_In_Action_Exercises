package config;

import beans.Parrot;
import beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot1(){
        var p = new Parrot();
        p.setName("kiki");
        return p;
    }

    @Bean
    @Primary
    Parrot parrot2(){
        var p= new Parrot();
        p.setName("suki");
        return p;
    }

    @Bean
    Person person(Parrot parrot){
        var p = new Person();
        p.setParrot(parrot);
        return p;
    }

}
