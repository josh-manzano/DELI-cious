package SandwichShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        Order newOrder = new Order();
        boolean mainRunning = true;

        System.out.println("Welcome to                  \n" +
                "|  _ \\       (_)          (_)                \n" +
                "| | | |/ _ \\ | |_____ / __| |/ _ \\| | | / __|\n" +
                "| |_| |  __/ | |_____| (__| | (_) | |_| \\__ \\\n" +
                "|____/ \\___|_|_|      \\___|_|\\___/ \\__,_|___/");

        System.out.println("""
                \n1)Create Order
                2)Exit
                """);


        while(mainRunning){
            String choice = in.nextLine();
            switch (choice){
                case "1" -> newOrder.orderMenu();

                case "2" -> mainRunning = false;

                default ->
                System.out.println("Try again");

            }
        }


    }






}
