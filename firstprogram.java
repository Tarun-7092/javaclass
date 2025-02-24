import java.util.*;
public class firstprogram{
  public static void main(String agrs[]){
    int balance =0,count = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter bank amount");
    int amount = sc.nextInt();
    if(amount < 1000){
      System.out.print("Error");
    }else{
      while(count < 3){
        System.out.print("Enter withdrawl amount");
        int withdrawl = sc.nextInt();
        if(amount > withdrawl && count <= 3 && balance < 100000){
          System.out.print("Transaction successful");
          balance += withdrawl;
          amount -= withdrawl;
        }else{
          System.out.print("Error");
        }
        count++;
      }
    }
  }
} 

