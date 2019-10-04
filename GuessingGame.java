import java.util.Scanner;

class GuessingGame {

    public static void main (String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        int target = (int) (Math.random()*100) + 1;  //the random number the user is trying to guess
        int guess  = 0;  // stores a user's guess
        int tries  = 0;  // stores how many guesses have been made
        
        // Intro text
        System.out.println("I've picked a random number between 1 and 100. Try to guess it! ");
        
        // Guessing loop
        while (guess != target) {
            System.out.print("What is your guess? ");
            guess = sc.nextInt();
            tries++;
            
            if (guess < target) {
                System.out.println("Too low!");
            } else if (guess > target) {
                System.out.println("Too high!");
            }
        }
        
        System.out.println("You've guessed my number! Good job!  It only took you " + tries + " tries.");
    }
}
