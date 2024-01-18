import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess, life = 5;
        Random rand = new Random();
        int number = rand.nextInt(100);
        boolean gameStatus = false;

        System.out.println("Game Started");
        while(life  > 0){
            System.out.print("Enter Guess: ");
            guess = input.nextInt();
            if (guess < 0 || guess > 99){
                System.out.println("0-100");
            }
            if (guess == number){
                gameStatus = true;
                break;
            }
            else {
                System.out.println("Try Again, Left Life:" + --life);
            }
        }
        if (gameStatus){
            System.out.println("Success");
            System.out.println("Number:" + number);
            System.out.println("Left Life: " + life);
        }
        else{
            System.out.println("No");
        }
    }
}
