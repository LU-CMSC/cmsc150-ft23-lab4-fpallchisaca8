import java.util.Scanner;
public class Fermat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Fermat's Last Theorem:  a^n + b^n = c^n

        System.out.print("Choose an integer for a: ");
        int a = input.nextInt(); 
        System.out.print("Choose an integer for b: ");
        int b = input.nextInt(); 
        System.out.print("Choose an integer for c: ");
        int c = input.nextInt(); 
        System.out.print("Choose an integer for n: ");
        int n = input.nextInt(); 

        double sum = Math.pow(a, n) + Math.pow(b, n);
        System.out.println(sum);
        double fermatSum = Math.pow(c, n);
        System.out.println(fermatSum);

        if (n > 2 && fermatSum == sum) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else if (fermatSum == sum) {
            System.out.println("it works");
        } else {
            System.out.println("No, that doesn't work.");
        }

    }
}
