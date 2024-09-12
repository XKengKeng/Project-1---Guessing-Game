import java.util.Scanner;
import java.util.Random;


public class Main{
    public static void main(String[]args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int x = rand.nextInt(100);
        System.out.println("Enter your first guess:");
        int guess = scan.nextInt();
        int count = 1; //count the number of times user guesses

        while(guess!=x){
            //if x less than, greater than or equal
            if (guess>x){
                System.out.println("too high");
                count++;
            }
            if (guess<x){
                System.out.println("too low");
                count++;
            }
            guess = scan.nextInt();
        }
        //how well did u do
        System.out.println("Congrats!");
        if(count<=7){
            System.out.println("You got an impossibly good score!");
        }
        
        if(count>7 && count<=10){
            System.out.println("You did a good job!");
        }
        if(count>10){
            System.out.println("Try the divide and conquer strategy next time!");
        }
        System.out.println("You guessed "+count+" times!");

        

    }



}