package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {

    private String birdName;


//    public Parrot(String birdName){
//        this.birdName = birdName;
//    }

    @PostConstruct
    public void init(){
        this.birdName = "koko";
    }

    public void setName(String birdName){
        this.birdName =birdName;
    }

    public String getBirdName(){
        return birdName;
    }

    @Override
    public String toString(){
        return this.birdName;
    }

}
