import java.util.Scanner;

public class Triangle {
    
    public static void main (String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        String  ch = ""; //the character to make the triangle with
        int num    = 0;  //how tall the triangle should be

        // Get input
        System.out.print("What character do you want your triangle made of? ");
        ch  = sc.next();
        System.out.print("How tall do you want your triangle? ");
        num = sc.nextInt();
        System.out.println("");
        System.out.println("Here's your triangle!");
        System.out.println("");
        
        // Print triangle
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println("");
        }
    }
}
