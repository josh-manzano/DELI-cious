package SandwichShop;

public class Drink extends MenuItem{
    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    @Override
    double calculatePrice() {
        if(size.trim().equalsIgnoreCase("Small")){
            return  2.00;
        }else if (size.trim().equalsIgnoreCase("Medium")){
            return 2.50;
        } else if (size.trim().equalsIgnoreCase("Large")) {
            return 3.00;
        }else{
            return 0.00;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return size + " - " + flavor;
    }
}
