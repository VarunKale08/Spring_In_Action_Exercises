package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String personName = "Varun";
    private final Parrot parrot;



    @Autowired
    public Person(Parrot parrot){
//        this.personName = personName;
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
//
//    public Parrot setParrot(Parrot parrot){
//        this.parrot = parrot;
//    }

}
