package org.example;

public class Parrot {

    private String birdName;


    public Parrot(){
        this("koko");
    }

    public Parrot(String birdName){
        this.birdName = birdName;
    }

    public void setName(String birdName){
        this.birdName = birdName;
    }

    public String getName(){
        return this.birdName;
    }


}
