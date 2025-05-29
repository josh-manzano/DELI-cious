package SandwichShop;

import java.util.ArrayList;

public class AllToppings {
    public static ArrayList<String> meats = new ArrayList<>();
    public static ArrayList<String> cheese = new ArrayList<>();
    public static ArrayList<String> regularToppings = new ArrayList<>();
    public static ArrayList<String> sauces = new ArrayList<>();

    static{
        meats.add("Steak");
        meats.add("Ham");
        meats.add("Salami");
        meats.add("Roast Beef");
        meats.add("Chicken");
        meats.add("Bacon");


        cheese.add("American");
        cheese.add("Provolone");
        cheese.add("Cheddar");
        cheese.add("Swiss");

        regularToppings.add("Lettuce");
        regularToppings.add("peppers");
        regularToppings.add("onions");
        regularToppings.add("Tomatoes");
        regularToppings.add("jalapenos");
        regularToppings.add("cucumbers");
        regularToppings.add("pickles");
        regularToppings.add("guacamole");
        regularToppings.add("mushrooms");


        sauces.add("Mayo");
        sauces.add("Mustard");
        sauces.add("ranch");
        sauces.add("thousand islands");
        sauces.add("vinaigrette");
    }
}
