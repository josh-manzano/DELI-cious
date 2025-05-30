package SandwichShop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    boolean choosingSize = false;
    Scanner in = new Scanner(System.in);

    List<MenuItem> cart = new ArrayList<>();


    void orderMenu() throws IOException {


        boolean orderMenuRunning = true;

        System.out.println("*Menu*");



        while(orderMenuRunning){
            System.out.println("""
                \n1)Add Sandwich
                2)Add Drink
                3)Add Chips
                4)Checkout
                0)Cancel Order
                """);

            String choice = in.nextLine().trim();

            switch (choice){
                case "1" -> {
                    addSandwich();
                    System.out.println("Back to order menu");
                }
                case "2" -> addDrink();
                case "3" -> addChip();
                case "4" -> {
                    checkout();
                    orderMenuRunning = false;
                }
                case "0" -> orderMenuRunning = false;
                default -> System.out.println("Oops, Try again");
            }

        }

    }

    void addSandwich() {
        Sandwich sandwich = new Sandwich();
        choosingSize =true;
        boolean choosingBread = false;
        boolean choosingToast = false;
        boolean choosingMeat = false;
        boolean choosingCheese = false;
        boolean choosingToppings = false;
        boolean choosingSauces = false;
        boolean choosingSide = false;

        while (choosingSize) {
            System.out.println("What size would you like?");
            System.out.println("""
                1) 4in
                2) 8in
                3) 12in
                0) Cancel
                """);

            String sizeChoice = in.nextLine().trim();

             switch (sizeChoice) {
                case "1" -> {
                    sandwich.setSize(4);
                    choosingSize = false;
                    choosingBread = true;
                }
                case "2" -> {
                    sandwich.setSize(8);
                    choosingSize = false;
                    choosingBread = true;
                }
                case "3" -> {
                    sandwich.setSize(12);
                    choosingSize = false;
                    choosingBread = true;
                }
                case "0" -> {
                    System.out.println("Cancelled sandwich");
                    return;
                }
                default -> System.out.println("Invalid, try again");
            }
        }

        while(choosingBread){
            System.out.println("What bread would you like?");
            System.out.println("""
                1) White
                2) Wheat
                3) Rye
                4) Wrap
                0) Cancel
                """);
            String breadType = in.nextLine().trim();

            switch (breadType) {
                case "1" -> {
                    sandwich.setBreadType("White");
                    choosingBread = false;
                    choosingToast = true;
                }
                case "2" -> {
                    sandwich.setBreadType("Wheat");
                    choosingBread = false;
                    choosingToast = true;
                }
                case "3" -> {
                    sandwich.setBreadType("Rye");
                    choosingBread = false;
                    choosingToast = true;
                }
                case "4" -> {
                    sandwich.setBreadType("Wrap");
                    choosingBread = false;
                    choosingToast = true;
                }
                case "0" -> {
                    System.out.println("Cancelled Sandwich");
                    return;
                }
                default -> System.out.println("Invalid. try again");
            }
        }

        while(choosingToast){
            System.out.println("Would you like your sandwich toasted? Y/N");
            String toastChoice = in.nextLine().trim().toLowerCase();

            if(toastChoice.equals("y")){
                sandwich.setToasted(true);
                choosingToast = false;
                choosingMeat = true;
            } else if (toastChoice.equals("n")) {
                sandwich.setToasted(false);
                choosingToast = false;
                choosingMeat = true;
            }else {
                System.out.println("Invalid, try again");
            }
        }

        while(choosingMeat){
            System.out.println("What meat would you like or type \"0\" for none.");
            for (int i = 0; i < AllToppings.meats.size(); i++) {
                System.out.println((i + 1) + ") " + AllToppings.meats.get(i));
            }

            int meatChoice = in.nextInt();
            in.nextLine();

            if (meatChoice >= 1 && meatChoice <= AllToppings.meats.size()) {
                String meatName = AllToppings.meats.get(meatChoice - 1);
                boolean validIn = false;
                while(!validIn){
                    System.out.println("Would you like extra meat? Y/N");
                    String extraYorN = in.nextLine().trim().toLowerCase();
                    switch (extraYorN) {
                        case "y" -> {
                            System.out.println("Choose your extra meat:");
                            for (int i = 0; i < AllToppings.meats.size(); i++) {
                                System.out.println((i + 1) + ") " + AllToppings.meats.get(i));
                            }
                            int extraMeatChoice = in.nextInt();
                            in.nextLine();
                            if (extraMeatChoice >= 1 && extraMeatChoice <= AllToppings.meats.size()) {
                                String extraMeatName = AllToppings.meats.get(extraMeatChoice - 1);
                                Topping extraTopping = new Topping(extraMeatName, true, true);
                                sandwich.addTopping(extraTopping);
                            }else{
                                System.out.println("Invalid, try again");
                            }
                            validIn = true;
                        }
                        case "n" -> {
                            validIn = true;
                        }
                        default -> System.out.println("Invalid, try again");
                    }
                    Topping meatTopping = new Topping(meatName, true, false);
                    sandwich.addTopping(meatTopping);
                    choosingCheese = true;
                    choosingMeat = false;
                }

            } else if (meatChoice == 0) {
                System.out.println("No meat added");
                choosingMeat = false;
                choosingCheese = true;
            } else {
                System.out.println("Invalid, try again");
            }
        }

        while(choosingCheese){
            System.out.println("What cheese would you like or type \"0\" for none");
            for (int i = 0; i < AllToppings.cheese.size(); i++) {
                System.out.println((i + 1) + ") " + AllToppings.cheese.get(i));
            }
            int cheeseChoice = in.nextInt();
            in.nextLine();

            if (cheeseChoice >= 1 && cheeseChoice <= AllToppings.cheese.size()) {
                String cheeseName = AllToppings.cheese.get(cheeseChoice - 1);
                boolean validIn = false;
                while(!validIn){
                    System.out.println("Would you like extra cheese? Y/N");
                    String extraYorN = in.nextLine().trim().toLowerCase();
                    switch (extraYorN) {
                        case "y" -> {
                            System.out.println("Choose your extra cheese:");
                            for (int i = 0; i < AllToppings.cheese.size(); i++) {
                                System.out.println((i + 1) + ") " + AllToppings.cheese.get(i));
                            }
                            int extraCheeseChoice = in.nextInt();
                            in.nextLine();
                            if(extraCheeseChoice >= 1 && extraCheeseChoice <= AllToppings.meats.size()){
                                String extraCheeseName = AllToppings.meats.get(extraCheeseChoice - 1);
                                Topping extraTopping = new Topping(extraCheeseName, true, true);
                                sandwich.addTopping(extraTopping);
                            }else{
                                System.out.println("Invalid, try again");
                            }
                            validIn = true;
                        }
                        case "n" -> {
                            validIn = true;
                        }
                        default -> System.out.println("Invalid, try again");
                    }
                    Topping topping = new Topping(cheeseName, true, false);
                    sandwich.addTopping(topping);
                    choosingToppings = true;
                    choosingCheese = false;
                }

            } else if (cheeseChoice == 0) {
                System.out.println("No cheese added");
                choosingCheese = false;
                choosingToppings = true;
            } else {
                System.out.println("Invalid, try again");
            }
        }

        while(choosingToppings){
            System.out.println("What toppings would you like or type \"0\" for none");
            for (int i = 0; i < AllToppings.regularToppings.size(); i++) {
                System.out.println((i + 1) + ") " + AllToppings.regularToppings.get(i));
            }
            System.out.println("0) Done");
            int toppingChoice = in.nextInt();
            in.nextLine();

            if (toppingChoice >= 1 && toppingChoice <= AllToppings.regularToppings.size()) {
                String toppingName = AllToppings.regularToppings.get(toppingChoice - 1);
                Topping topping = new Topping(toppingName, false, false);
                sandwich.addTopping(topping);
                choosingSauces = true;
            } else if (toppingChoice == 0) {
                choosingSauces = true;
                choosingToppings = false;
            } else {
                System.out.println("Invalid, try again");
            }
        }

        while(choosingSauces){
            System.out.println("What sauces would you like or type \"0\" for none");
            for (int i = 0; i < AllToppings.sauces.size(); i++) {
                System.out.println((i + 1) + ") " + AllToppings.sauces.get(i));
            }
            int sauceChoice = in.nextInt();
            in.nextLine();

            if (sauceChoice >= 1 && sauceChoice <= AllToppings.sauces.size()) {
                String sauceName = AllToppings.sauces.get(sauceChoice - 1);
                Topping topping = new Topping(sauceName, false, false);
                sandwich.addTopping(topping);
                choosingSide = true;
                choosingSauces = false;
            } else if (sauceChoice == 0) {
                System.out.println("No sauces added");
                choosingSide = true;
                choosingSauces = false;
            } else {
                System.out.println("Invalid, try again");
            }
        }

        while(choosingSide){
            System.out.println("Would you like any sides?");
            System.out.println("""
                    1) Au Jus
                    2) Sauce
                    0) None
                    """);
            String sideChoice = in.nextLine().trim();
            switch (sideChoice){
                case"1" -> {
                    sandwich.setSide("Au Jus");
                    choosingSide = false;
                }
                case"2" -> {
                    sandwich.setSide("Sauce");
                    choosingSide = false;
                }
                case"0" -> {
                    sandwich.setSide("No sides");
                    choosingSide = false;
                }
                default -> System.out.println("Invalid, try again");
            }
        }
         cart.add(sandwich);
    }

    void addDrink() {
        String size = "";
        System.out.println("What size would you like?");
        System.out.println("""
                1) Small
                2) Medium
                3) Large
                0) Cancel
                """);
        String sizeChoice = in.nextLine().trim();

        switch (sizeChoice) {
            case "1" -> {
                size = "Small";
                choosingSize = false;
            }
            case "2" -> {
                size = "Medium";
                choosingSize = false;
            }
            case "3" -> {
                size = "Large";
                choosingSize = false;
            }
            case "0" -> {
                System.out.println("Cancelled Drink");
                return;
            }

            default -> System.out.println("Invalid, try again");
        }

        boolean choosingFlavor = true;
        while (choosingFlavor){
            System.out.println("What flavor would you like?");
            System.out.println("""
                1) Sprite
                2) Coke
                3) Pink Lemonade
                4) Water
                0) Cancel
                """);
            String flavorChoice = in.nextLine().trim();
            switch (flavorChoice){
                case"1" -> {
                    Drink drink = new Drink(size, "Sprite");
                    cart.add(drink);
                    choosingFlavor = false;
                }
                case"2" -> {
                    Drink drink = new Drink(size, "Coke");
                    cart.add(drink);
                    choosingFlavor = false;
                }
                case"3" -> {
                    Drink drink = new Drink(size, "Pink Lemonade");
                    cart.add(drink);
                    choosingFlavor = false;
                }
                case"4" -> {
                    Drink drink = new Drink(size, "Water");
                    cart.add(drink);
                    choosingFlavor = false;
                }
                case"0" -> {
                    System.out.println("Drink Cancelled");
                }
                default -> System.out.println("Invalid, try again");
            }
        }


    }

    void addChip(){
        boolean chipFound = false;

        for(MenuItem item : cart){
            if (item instanceof Chips){
            Chips chips = (Chips) item;
            chips.increaseQuantity();
            chipFound = true;
            break;
            }
        }
        if(!chipFound){
            Chips newChip = new Chips();
            cart.add(newChip);
        }
        System.out.println("Chips has been added");
    }

    void checkout() throws IOException {
        if(cart.isEmpty()){
            System.out.println("Cart is empty. Nothing to checkout");
            return;
        }

        System.out.print("\n============ DELI-cious ============\n");
        double total = 0;

        for(MenuItem items : cart){
            if(items instanceof Printable printable){
                System.out.println(printable.printReceipt());
                total += items.calculatePrice();
            }

        }

        System.out.println("==================================");
        System.out.printf("Total: "+ String.format("$%.2f", total));
        System.out.println("\n==================================");

        System.out.println("1) Place Order \n2) Cancel Order");
        String checkoutChoice = in.nextLine().trim();
        if(checkoutChoice.equals("1")){
            System.out.println("Thank you, Come again.");
            ReceiptWriter.writeToFile(cart, total);
            cart.clear();
        } else if (checkoutChoice.equals("2")) {
            System.out.println("Order has been cancelled");
            cart.clear();
        }else {
            System.out.println("Invalid, try again");
        }


    }





}
