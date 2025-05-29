package SandwichShop;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends MenuItem implements Printable {
    private int size;
    private String breadType;
    private boolean toasted;
    private String side = "empty";
    private List<Topping> toppings;

    public Sandwich() {
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    @Override
    double calculatePrice() {
        double basePrice = 0.0;

        if(size == 4){
            basePrice = 5.50;
        }else if (size == 8){
            basePrice = 7.00;
        } else if (size == 12) {
            basePrice = 8.50;
        }

        for (Topping topping : toppings){
                String name = topping.getName();
                boolean isMeat = AllToppings.meats.contains(name);
                boolean isCheese = AllToppings.cheese.contains(name);

                if (isMeat && topping.isPremium()){
                    if(!topping.isExtra()){
                        if (size == 4){
                            basePrice += 1.00;
                        } else if (size ==8) {
                            basePrice += 2.00;
                        } else if (size ==12) {
                            basePrice += 3.00;
                        }
                    }
                    if(topping.isExtra()){
                        if(size == 4){
                            basePrice += 0.50;
                        } else if (size == 8) {
                            basePrice += 1.00;
                        } else if (size == 12) {
                            basePrice += 1.50;
                        }
                    }

                }
                if (isCheese && topping.isPremium()){
                    if (!topping.isExtra()){
                        if (size == 4){
                            basePrice += 0.30;
                        } else if (size == 8) {
                            basePrice += 0.60;
                        } else if (size == 12) {
                            basePrice += 0.90;
                        }
                    }

                    if (topping.isExtra()){
                        if (size == 4){
                            basePrice += 0.75;
                        } else if (size == 8) {
                            basePrice += 1.50;
                        } else if (size == 12) {
                            basePrice += 2.25;
                        }
                    }
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

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }


    @Override
    public String printReceipt() {
        StringBuilder receipt = new StringBuilder();
        receipt.append(String.format("%-33s $%.2f", "Sandwich", calculatePrice()));
        receipt.append("\nBread: ").append(breadType).append("\n");
        receipt.append(" Size: ").append(size).append(" in\n");

        for(Topping topping : toppings){
            receipt.append("  + ").append(topping.toString()).append("\n");
        }
        return receipt.toString();
    }

    @Override
    public String toString() {
        return "\nSize: "  +
                size + "\"" +
                " Bread Type: " + breadType +
                " Toasted: " + toasted +
                " Toppings: " + toppings ;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }
}
