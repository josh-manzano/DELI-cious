package SandwichShop;

public class Drink {
    private int size;
    private double price;
    private String flavor;

    public Drink(int size, double price, String flavor) {
        this.size = size;
        this.price = price;
        this.flavor = flavor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

}
