package rockpapersci;
import java.util.Scanner;
import java.util.Random;

public class CWHgame {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("***************************************************************");
        System.out.println("           Welcome to Rock Paper and Scissors");
        System.out.println("***************************************************************");
        Random random=new Random();
        int computerrand=random.nextInt(3);
        System.out.print("Enter your choice(0 for Rock,1 for Paper and 2 for Scissors): ");
        int number =sc.nextInt();
        if(computerrand==number){
            System.out.println("DRAW");
        }
        else if(computerrand==0 && number==1 || computerrand==1 && number==2 || computerrand==2 && number==0){
            System.out.println("CONGRATULATIONS");
            System.out.println("YOU WIN");
            System.out.print("computer choosed:");
            System.out.println(computerrand);
        }
        else{
            System.out.println("SORRY!");
            System.out.println("YOU LOOSE");
            System.out.print("computer choosed:");
            System.out.println(computerrand);
        }
        System.out.println("***************************************************************");
        System.out.println("                          Thank You");
        System.out.println("***************************************************************");

    }
    
}
