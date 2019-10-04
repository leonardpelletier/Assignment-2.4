import java.util.Scanner;

class RunningTally {

    public static void main (String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        int input = 0; //stores user input
        int total = 0; //store the running sum of the input

        // Introduction text
        System.out.println("Let's add some numbers! [Type a negative number to quit]");
        System.out.println("");

        // Loop to read in values and add them or quit
        while (input >= 0) {
            System.out.print("Add: ");
            input = sc.nextInt();
            if (input >= 0) {
                total = total + input;    
            }
        }

        // Display total
        System.out.println("");
        System.out.println("Your total is " + total);
    }
}