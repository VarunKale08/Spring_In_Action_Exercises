package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String personName = "varun";
    private Parrot parrot;


    @Autowired
    public Person(@Qualifier("parrot2") Parrot parrot){
        this.parrot = parrot;
    }

    public Person(String personName){
        this.personName = personName;
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