
/**
 * A
 */
import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = ip.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // also we cna use i == Math.round(n / 2)
                if (i == 1 || j == 1 || i == (n / 2) + 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        ip.close();
    }
}