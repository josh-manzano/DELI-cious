package SandwichShop;

public class Topping {
    private String name;
    private boolean premium;
    private boolean extra;

    public Topping(String name, boolean premium, boolean extra) {
        this.name = name;
        this.premium = premium;
        this.extra = extra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
