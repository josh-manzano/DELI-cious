package SandwichShop;

public class Chips extends MenuItem implements Printable {
    private int quantity = 1;

    public void increaseQuantity(){
       this.quantity++;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return 1.5 * quantity;
    }

    @Override
    double calculatePrice() {
        return 1.5 * quantity;
    }

    @Override
    public String printReceipt() {
        return String.format("%-25s x%d %10s", "Chips", quantity, String.format("$%.2f", getPrice()));
    }

    @Override
    public String toString() {
        return String.format("Chips x%d", quantity);
    }

}
