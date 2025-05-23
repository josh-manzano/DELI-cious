package SandwichShop;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String size;
    private String breadType;
    private boolean isToasted;
    private double price;
    ArrayList<Toppings> toppings;

    public Sandwich(String size, String breadType, boolean isToasted, double price) {
        this.size = size;
        this.breadType = breadType;
        this.isToasted = isToasted;
        this.price = price;
        this.toppings = new ArrayList<>();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
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
                "Size: " + size + '\'' +
                "BreadType: " + breadType + '\'' +
                "Toasted: " + isToasted;
    }

    double getBasePrice(){

        return 0;
    }

    double getBreadPrice(){

        return 0;
    }

    double getToppingPrice(){

        return 0;
    }

    double calculatePrice(){

        return 0;
    }

}
