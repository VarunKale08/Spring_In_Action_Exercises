package beans;

public class Person {

    private String personName;
    private Parrot parrot;

    public Person(){
        this("xyz");
    }

    public Person(String personName){
        this.personName = personName;
    }

    public Person(String personName, Parrot parrot){
        this.personName = personName;
        this.parrot = parrot;
    }

    public void setPerson(String personName){
        this.personName= personName;
    }

    public String getPerson(){
        return this.personName;
    }

    public void setParrot(Parrot parrot){
        this.parrot = parrot;
    }

    public Parrot getParrot(){
        return this.parrot;
    }

    @Override
    public String toString(){
        return "Person: " + this.personName + " Parrot: " + this.parrot;
    }
}
