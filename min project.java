import java.util.Scanner;

public class main {
 public static void main(String[] args) {
     scanner sc = new scanner(System.in);
     int myNumber = (int)(Math.randon()*100);
     int userNumber;

     do {
         system.out.println("Guess my number(1-100) : ");
         userNumber = sc.nextInt();

         if(userNumber == my myNumber) {
             system.out.println("pikacoo .. correct Number!!");
             break;
         }
         else if(userNumber > myNumber) {
             system.out.println("your number is too large");
         }
         else{
             sytem.out.println("your number is too small");


         }
     }
     while(userNumber >= 0);

     system.out.print("my number was :");
     system.out.println(myNumber);
    
}

}