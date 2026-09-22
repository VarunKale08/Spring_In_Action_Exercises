package org.example;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String parrotName;


    public Parrot(){
        this("molly");
    }

    public Parrot(String name){
        this.parrotName = name;
    }

    @Override
    public String toString(){
        return this.parrotName;
    }

}
