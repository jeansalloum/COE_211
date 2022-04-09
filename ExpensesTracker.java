import java.io.*;
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
    try {
            FileWriter x = new FileWriter(new File("expenses.txt"));
            BufferedWritter y = new BufferedWritter(x);
            PrintWriter outToFile = new PrinterWrier(y);
            
            String jimbo = "y";
            String calipso = "y";
            String name = "";
            String item = "";
            String log;
            double cost = 0;
            
            Scanner fileScan = new Scanner (new File("expenses.txt"));
            Scanner scan = new Scanner (System.in);
            
    do { 
            System.out.println("Input your name: ");
            name = scan.nextLine();
            
            System.out.println("what did you purchase?");
            item = scan.nextLine();
            
            System.out.println("How much did you pay? (in USD)");
            cost = scanb.nextDouble();
            scan.nextLine();
            
            outToFile.println(name + " purchased " + item + " for " + cost + " US Dollars.");
            System.out.println("Would you like to log another purchase? (y/n)");
            
            repeat = scan.nextLine();
            
    } while (repeat.equalsIgnoreCase("y"));
    
    System.out.println("Would you like to read a summary of your purchase? (y/n)");
    jimbo = scan.nextLine();
    outToFile.close();
    scan.close();
    
        if (jimbo.equalIgnoreCase("y")) {
                while (fileScan.hasNext()){
                        log = fileScan.nextLine();
                        System.out.println(log);
                        
        }
    }  
        
            
        }
      
    } catch (Exception e) {
        System.out.println("An error occured.");
        e.printStackTrace();
    }
    }