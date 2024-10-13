
/**
 Enter the size : 7

        *     *
        **   **
        * * * *
        *  *  *
        *     *
        *     *
        *     *

 */
import java.util.Scanner;

public class M {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = ip.nextInt();

        int fp = 0, sp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || ((j == fp || j == sp) && i <= (n / 2) + 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            if (i == 1) {
                fp = 1;
                sp = n;
            }
            fp++;
            sp--;
            System.out.println();
        }
        ip.close();
    }
}