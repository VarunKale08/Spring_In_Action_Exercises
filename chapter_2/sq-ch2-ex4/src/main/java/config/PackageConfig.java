package config;

import org.example.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PackageConfig {

    @Bean("first")
    Parrot P1(){
        var p = new Parrot();
        p.setName("kiki");
        return p;
    }

    @Bean("second")
    @Primary
    Parrot P2(){
        var p = new Parrot();
        p.setName("miki");
        return p;
    }

    @Bean("third")
    Parrot P3(){
        var p = new Parrot();
        p.setName("ciki");
        return p;
    }
}
