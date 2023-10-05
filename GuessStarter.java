import java.util.Scanner;
import java.util.Random;
public class GuessStarter {
    public static void main(String[] args){
        //Scanner & Random
        Scanner input = new Scanner (System.in);
        Random random = new Random();

        //Randomly picks a number
        int number = random.nextInt(100) + 1; //What the heck does 100 and + 1 do? What about 101?

        //Quetion and so on
        System.out.println("I'm thinking of a number between 1 and 100");   
        System.out.print("Type your guessing number: ");
        //Player Guesses
        int guess = input.nextInt();
        
        //Output
        while (guess != number) {
            if (guess < number) {
                System.out.println("Your guessing number is " + guess);
                System.out.println("You were off by " + (number - guess));
                System.out.print("Type your guessing number: ");
                guess = input.nextInt();
            } else if (number < guess) {
                System.out.println("Your guessing number is " + guess);
                System.out.println("You were off by " + (guess - number));
                guess = input.nextInt();
            } else {
                System.out.println("Type a number");
                guess = input.nextInt();
            }
        }
        if ( guess == number) {
            System.out.println("Your guessing number is " + guess);
            System.out.println("The number I was thinking of is: " + number);
            System.out.println("You Won!");
        }
    }
}
