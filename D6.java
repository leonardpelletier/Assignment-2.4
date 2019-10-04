import java.util.Scanner;

public class D6 {
    
    public static void main (String[] args) {
        // Variables
        Scanner sc  = new Scanner(System.in);
        int numdice = 0;   //stores how many dice to throw        
        int dieroll = 0;   //stores the number of a particular die roll
        int total   = 0;   //stores the total of all the numbers rolled in a single throw of the dice.
        String ans  = "y"; //stores answer for playing again
        
        // Begin input loop
        while (ans.equals("y")) {
            
            // Get input
            System.out.print("How many D6's do you want to roll? ");
            numdice = sc.nextInt();
            
            // Roll and add up dice 
            System.out.println("");
            System.out.print("You rolled: ");
            for (int i = 0; i < numdice; i++) {
                dieroll = (int) (Math.random()*6)+1;
                total = total + dieroll;
                System.out.print(dieroll + " ");
            }
            
            // Report total
            System.out.println("");
            System.out.println("Total: " + total);
            System.out.println("");
            
            // Ask to continue
            System.out.print("Again? [y,n] ");
            ans = sc.next();
            System.out.println("");            
        }
    }
}
