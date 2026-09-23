package config;

import beans.Parrot;
import beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot(){
        var parrot1 = new Parrot();
        parrot1.setName("bunty");
        return parrot1;
    }


    @Bean
    Person person(){
        var person1 = new Person();
        person1.setPerson("hitesh");
//        person1.getParrot().setName("stark");
        person1.setParrot(parrot());
        return person1;

    }
}
