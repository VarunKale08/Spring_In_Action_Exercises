package beans;

import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String parrotName;

    public Parrot(){
        this("koko");
    }

    public Parrot(String parrotName){
        this.parrotName = parrotName;
    }

    public String getParrotName(){
        return this.parrotName;
    }

    public void setParrotName(String parrotName){
        this.parrotName = parrotName;
    }

    @Override
    public String toString() {
        return "Parrot Name: " + this.parrotName;
    }
}
