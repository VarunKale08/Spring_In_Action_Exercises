package beans;


public class Parrot {
    private String parrotName;

    public Parrot(){
        this("kiki");
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
}
