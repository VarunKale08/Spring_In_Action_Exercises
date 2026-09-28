package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String personName;
    private Parrot parrot;

    public Person(){
        this("Varun");
    }

    public Person(String personName){
        this.personName = personName;
    }

    public Person(String personName, Parrot parrot){
        this.personName= personName;
        this.parrot= parrot;
    }


    public void setPersonName(String personName){
        this.personName = personName;
    }

    public String getPersonName(){
        return this.personName;
    }

    @Autowired
    public void setParrot(Parrot parrot){
        this.parrot = parrot;
    }


    public Parrot getParrot(){
        return this.parrot;
    }

    @Override
    public String toString(){
        return this.getPersonName() + " " + this.getParrot().getParrotName();
    }

}
