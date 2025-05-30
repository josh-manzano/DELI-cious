package SandwichShop;


import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class ReceiptWriter {

        // write receipt file and place in receipts folder
        public static void writeToFile(List<MenuItem> cart, double total) throws IOException {
            DateTimeFormatter timeStamp = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
            LocalDateTime nameOfFile = LocalDateTime.now();
            String fileName = "src/main/resources/Receipts-" + dtf.format(nameOfFile) + ".txt";

            try(FileWriter fileWriter = new FileWriter(fileName)){
                fileWriter.write("============== Deli-cious ==============\n\n");
                fileWriter.write("Time: " + timeStamp.format(nameOfFile) + "\n");
                fileWriter.write("========================================\n\n");

                for(MenuItem item : cart){
                    if(item instanceof Printable printable){
                        fileWriter.write(printable.printReceipt() + "\n");
                    }
                }
                fileWriter.write("\n============================\n");
                fileWriter.write(String.format("Total: $%.2f\n", total));
                fileWriter.write("\n============================");
            }catch (IOException e){
                System.out.println("Error printing receipt: " + e.getMessage());
            }
        }


}
