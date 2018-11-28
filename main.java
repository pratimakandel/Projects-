 import java.util.*;
import java.io.*;
/**
 * Coffehouse ordering system and counts the total sales for the wholde day business. 
 * There is 5 choice: 1 for ordering , 2 for finally counting the total price to pay for the customer, 3 for finding the items sold , quantity sold for each item
 * and the price, 4 for finishing order by the customer, 5 to exit the program. 
 *The user can take in the order by entering one and once the order is finish the user must enter 2 to get the total amount to pay and finally enter 3 to finish the order
 *The manager can then get the total sales of the business in a day by entering 3 and finally exit the program. 
 * @author pratima kandel
 * @version 2018 
 */
public class main
{
    
     public static void main(String[] args) throws InvalidchoiceException
     {
     
     
     Scanner sc = new Scanner(System.in);
   
     ArrayList< Beverage> list = new ArrayList< Beverage>();
     
     //exit loop on 5 
     int drinks;
     int size;
     int choice = 0;
     int  count = 0;
     int numItems =0;
     
     System.out.println("Welcome to Pratz Coffee House");
     while (choice!= 5)
     {
         
         System.out.println("Enter the numbers for options: \n1-> To Order \n2-> Total Amount to Pay \n3-> Total Sales only for manager  \n4-> Finish order for customers \n5-> Exit only for manager");
         
        choice = 0;
         //making a try catch block incase the customer hits a wrong option, thus reminding them to hit the correct one. 
        try{
        int temp = sc.nextInt();
        
         if (temp > 0 && temp < 6){
             choice = temp;
            }else{
                throw new InvalidchoiceException("Please correct number");
            }
        }catch(InvalidchoiceException e ){
            System.out.println(" Please only enter the number from the options");
        }
        //choice one is to order, then you can chose the drinks you want with the size,
    
            
         if (choice == 1) {
             System.out.println("What types of drinks do you want?");
             System.out.println("1-> Regular Coffee \n2-> Cappuccino \n3-> Mocha \n4-> Iced Tea \n5-> ChaiLatte");
             drinks = sc.nextInt();
             
             System.out.println("Size of the drink?");
             System.out.println("1-> Small \n2-> Medium \n3-> Large" );
             size = sc.nextInt();
             
             Beverage hjh = new Beverage (drinks, size);
             //keeps the count of the number of items
             numItems += 1;
             //keeps the count for the user input so that the count can be reset and the user can finish the order.
             count = count + 1;
             list.add(hjh);
             
             
         }
         //prints out the amount to be paid by deducting the total amount with the current users index 
         if (choice == 2){
             
            int pp = numItems - count; 
            double ll = 0.0;
             for (int i = pp ; i < numItems ; i++){
                 
                 ll += list.get(i).getPrice();
                 
                }
             System.out.printf("Total amount to pay: $%.2f\n",ll);
             System.out.println("Thank you, have a nice day :)\n");
         
    }
    //choice 3 keeps the track of all the items purchased and the total price of each item depending on the quantity
    //finally choice gives the report of each item sold , its quantity sold and the price of it with the total sales too.
    if (choice == 3){
        
            double totalItemprice = 0.0;
            //keeping track of each item.
            int coffeecount = 0;
            int cappuccinocount = 0;
            int mochacount = 0;
            int icedteacount = 0;
            int chailattecount = 0;
            //keeping track of each item price 
            double coffeeprice =0; 
            double capppuccinoprice =0; 
            double mochaprice =0; 
            double icedteaprice =0; 
            double chailatteprice =0; 
            
             for (int i = 0 ; i < numItems ; i++){
                 //get the total price and each count of the item and the price 
                 totalItemprice  += list.get(i).getPrice();
                 if(list.get(i).getName().equals("Coffee")){coffeecount++; coffeeprice +=list.get(i).getPrice();}
                 if(list.get(i).getName().equals("Cappuccino")){cappuccinocount++; capppuccinoprice +=list.get(i).getPrice();}
                 if(list.get(i).getName().equals("Mocha")){mochacount++; mochaprice +=list.get(i).getPrice();}
                 if(list.get(i).getName().equals("IcedTea")){icedteacount++; icedteaprice+=list.get(i).getPrice();}
                 if(list.get(i).getName().equals("ChaiLatte")){chailattecount ++; chailatteprice +=list.get(i).getPrice();}
                 
                 
                }
                //finally printing out the whole report in a receipt format. 
             System.out.printf("%-20s %-20s %-20s \n","Items Sold","Quantity", "Price");
             System.out.printf("%-23s %-17d %-20.2f \n", "Coffee", coffeecount, coffeeprice);
             System.out.printf("%-23s %-17d %-20.2f \n", "Cappuccino",cappuccinocount, capppuccinoprice);
             System.out.printf("%-23s %-17d %-20.2f \n", "Mocha", mochacount, mochaprice);
             System.out.printf("%-23s %-17d %-20.2f \n", "Iced Tea", icedteacount, icedteaprice);
             System.out.printf("%-23s %-17d %-20.2f \n", "Chai Latte", chailattecount, chailatteprice);
             System.out.printf("Total Sales: $%.2f\n\n", totalItemprice);
             
}
//choice 4 is to finish the order by a particular customer, thus the program continues to run with each different customer until the owner clicks exit 
if (choice == 4){
    
    count = 0;
     System.out.println("Welcome to Pratz Coffee House");
    
    
}
}

}


}




