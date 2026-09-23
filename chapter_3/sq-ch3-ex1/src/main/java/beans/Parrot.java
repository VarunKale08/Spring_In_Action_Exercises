package beans;

public class Parrot {

    private String parrotName;

    public Parrot(){
        this("Micheal");
    }

    public Parrot(String parrotName){
        this.parrotName = parrotName;
    }


    public void setName(String parrotName){
        this.parrotName = parrotName;
    }

    public String getName(){
        return this.parrotName;
    }


    @Override
    public String toString(){
        return this.parrotName;
    }
}
