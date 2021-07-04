package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Model {

    private SimpleIntegerProperty number = new SimpleIntegerProperty(this, "value");
    public Model(){
        number.set(0);
    }

    public void addNumber(int nr){
        number.set(number.get() + nr);
        System.out.println("Number after addition is "+number);
    }

    public void multiplyNumber(int nr){
        number.set(number.get() * nr);
        System.out.println("Number after multiplying is "+number);
    }

    public int getNumber() {
        return number.get();
    }

    public IntegerProperty valueProperty(){
        return number;
    }

}
