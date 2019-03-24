package day10;
import java.util.Scanner;

public class NestedIf {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to Amazon");

    System.out.println("whats the price in your cart");
    double price = scan.nextDouble();

    System.out.println("are you a prime member");
    boolean isPrimeMember = scan.nextBoolean();

    // if(isPrimeMember==true){

    if (price < 35) {
      
      if(isPrimeMember){
         System.out.println("YOU STILL GOT FREE SHIPPING "+ price);
      }else{
        price += 5; 
        System.out.println("YOU gotta pay 5 $ shipping totaling "+ price);
      }
      
    }else{
      System.out.println("YOU STILL GOT FREE SHIPPING "+ price);
    }

    /*
     * }else if( price> 35){
     * System.out.println("YOU STILL GOT FREE SHIPPING "+ price);
     * 
     * }else {
     * 
     * price += 5; System.out.println("YOU gotta pay 5 $ shipping "+ price)
     * ; //System.out.println("YOU gotta pay 5 $ shipping "+ (price +5)) ;
     * System.out.println("you may also consider joining prime to " +
     * "avoid shipping fee");
     * 
     * 
     * 
     * 
     *  String username = "user12321";
    String password = "pass22";

    if(username.equals("user") && password.equals("pass")){
      System.out.println(" \" login successful \" ");
    }else{
      
      if( ! username.equals("user") ){
        System.out.println("USERNAME NOT FOUND");
      }else{
        System.out.println("PASSWORD NOT CORRECT");
      }
     */

  }

}