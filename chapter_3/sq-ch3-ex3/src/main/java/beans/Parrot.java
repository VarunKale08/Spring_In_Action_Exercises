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

    public void setParrot(String parrotName){
        this.parrotName = parrotName;
    }

    public String getParrot(){
        return this.parrotName;
    }

    @Override
    public String toString(){
        return this.getParrot();
    }
}
