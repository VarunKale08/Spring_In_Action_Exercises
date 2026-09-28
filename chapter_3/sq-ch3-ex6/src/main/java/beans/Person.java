package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class Person {

    private String personName;
    private Parrot parrot;


    public Person(){
        this("Varun");
    }

    public Person(String personName){
        this.personName = personName;
    }

    public Person(Parrot parrot){
        this.parrot = parrot;
    }



    public String getPersonName(){
        return this.personName;
    }

    public void setPersonName(String personName){
        this.personName = personName;
    }

    public Parrot getParrot(){
        return this.parrot;
    }

    public void setParrot(Parrot parrot){
        this.parrot= parrot;
    }

}
