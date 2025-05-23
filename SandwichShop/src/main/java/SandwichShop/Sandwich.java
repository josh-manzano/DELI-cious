package SandwichShop;

import java.util.List;

public class Sandwich {
    private String size;
    private String breadType;
    private boolean isToasted;
    List<String> regularToppings;
    List<String> premiumToppings;
    List<String> sauces;

    public Sandwich(String size, String breadType, boolean isToasted) {
        this.size = size;
        this.breadType = breadType;
        this.isToasted = isToasted;
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

    public List<String> getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(List<String> regularToppings) {
        this.regularToppings = regularToppings;
    }

    public List<String> getPremiumToppings() {
        return premiumToppings;
    }

    public void setPremiumToppings(List<String> premiumToppings) {
        this.premiumToppings = premiumToppings;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public void setSauces(List<String> sauces) {
        this.sauces = sauces;
    }


    @Override
    public String toString() {
        return "Sandwich{" +
                "Size: " + size + '\'' +
                "BreadType: " + breadType + '\'' +
                "Toasted: " + isToasted +
                "Regular Toppings: " + regularToppings +
                "Premium Toppings: " + premiumToppings +
                "Sauces: " + sauces;
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
