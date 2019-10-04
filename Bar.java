import java.util.Scanner;

class Bar {

    public static void main (String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        String  ch = ""; //the character to make the bar with
        int num    = 0;  //how long the bar should be

        // Get input
        System.out.print("What character do you want your bar made of? ");
        ch  = sc.next();
        System.out.print("How long do you want your bar? ");
        num = sc.nextInt();
        System.out.println("");
        System.out.println("Here's your bar!");
        System.out.println("");
        
        // Generate bar
        for (int i = 0; i < num; i++) {
            System.out.print(ch);
        }
    }
}
