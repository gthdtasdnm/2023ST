package A3_5;

public class Indentor {
    private String tab;
    private int increment = 0;

    public Indentor(String tab){
        this.tab = tab;
    }

    public Indentor(){
        this("+");
    }

    public void increment(){
        increment++;
    }

    public void decrement(){
        if(increment <= 0){
            throw new RuntimeException();
        }
        increment--;
    }

    @Override
    public String toString(){
        return tab.repeat(increment);
    }
}
