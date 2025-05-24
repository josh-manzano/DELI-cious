package SandwichShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        Order newOrder = new Order();
        boolean mainRunning = true;

        System.out.println("""
                Welcome to\s
                |  _ \\     | |(_)          (_)               \s
                | | | |/ _ \\ | |_____ / __| |/ _ \\| | | / __|
                | |_| |  __/ | |_____| (__| | (_) | |_| \\__ \\
                |____/ \\___|_|_|      \\___|_|\\___/ \\__,_|___/""");




        while(mainRunning){
            System.out.println("\n*Home*");
            System.out.println("""
                \n1)Create Order
                2)Exit
                """);
            String choice = in.nextLine().trim();
            switch (choice){
                case "1" -> newOrder.orderMenu();

                case "2" -> mainRunning = false;

                default ->
                System.out.println("Try again");

            }
        }

    }


}
