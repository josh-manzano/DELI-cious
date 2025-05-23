package SandwichShop;

public class Toppings {
    private double price;
    private String name;
    private int size;
    private boolean extra;
    private boolean premium;

    public Toppings(double price, String name, int size, boolean extra, boolean premium) {
        this.price = price;
        this.name = name;
        this.size = size;
        this.extra = extra;
        this.premium = premium;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }


}
