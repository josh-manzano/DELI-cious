package SandwichShop;

import java.util.List;
import java.util.Scanner;

public class Order {

    List<MenuItem> cart;

    Scanner in = new Scanner(System.in);
    void orderMenu(){

        boolean orderMenuRunning = true;

        System.out.println("*Menu*");


        System.out.println("""
                \n1)Add Sandwich
                2)Add Drink
                3)Add Chips
                4)Checkout
                0)CancelOrder
                """);


        while(orderMenuRunning){
            String choice = in.nextLine().trim();

            switch (choice){
                case "1" -> addSandwich();
                case "2" -> addDrink();
                case "3" -> addChip();
                case "4" -> {
                    checkout();
                    orderMenuRunning = false;
                }
                case "0" -> orderMenuRunning = false;
                default -> System.out.println("Try again");
            }

        }

    }

    void addSandwich(){
        boolean addingSandwich =true;
        System.out.println();
        System.out.println("What bread would you like?");
        System.out.println("""
                1) White
                2) Wheat
                3) Rye
                4) Wrap
                """);
        while (addingSandwich){
            String breadType = in.nextLine().trim().toLowerCase();


        }




    }

    void addDrink(){
        System.out.println("What size would you like?");
    }

    void addChip(){
        System.out.println("Chips have been added to cart.");
    }

    void checkout(){
        System.out.println("Total");

    }




}
