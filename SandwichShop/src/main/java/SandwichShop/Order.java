package SandwichShop;

import java.util.Scanner;

public class Order {

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
        System.out.println("What size would you like?");
        String size = in.nextLine();

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
