package giorgiaipsarop.u5d1MenuPizzeria;

import lombok.Getter;


public abstract class MenuLIst {

    protected int calories;
    protected double price;

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    public MenuLIst(int calories, double price){
        this.calories = calories;
        this.price = price;

    }
}
