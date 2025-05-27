package SandwichShop;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends MenuItem{
    private int size;
    private String breadType;
    private boolean isToasted;
    List<Topping> toppings;

    public Sandwich(int size, String breadType, boolean isToasted) {
        this.size = size;
        this.breadType = breadType;
        this.isToasted = isToasted;
        this.toppings = new ArrayList<>();
    }

    @Override
    double calculatePrice() {
        double basePrice = 0.0;
        if(size == 4) {
            basePrice = 5.50;
        }else if (size == 8){
            basePrice = 7.00;
        } else if (size == 12) {
            basePrice = 8.50;
        }
        for (Topping topping : toppings){
            if(size == 4){
                basePrice += 1.00;
            } else if (size == 8) {
                basePrice += 2.00;
            } else if (size == 12) {
                basePrice += 3.00;
            }
        }



        return basePrice;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }


    @Override
    public String toString() {
        return "Sandwich" +
                size + '"' +
                breadType+
                isToasted;
    }


}
