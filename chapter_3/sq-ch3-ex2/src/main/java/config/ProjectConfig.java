package config;

import beans.Parrot;
import beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot(){
        var p = new Parrot();
        p.setName("Varun");
        return p;
    }

    @Bean
    Person person(Parrot parrot){
        var p = new Person();
        p.setPerson("Parth");
        p.setParrot(parrot);
        return p;
    }
}
