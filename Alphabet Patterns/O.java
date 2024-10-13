
/**
enter the size : 7

      * *
    *     *
    *     *
    *     *
    *     *
    *     *
      * *

 */
import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("enter the size : ");
        int n = ip.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 && j % 2 == 1 && j > 1 && j < n) || (i == n && j % 2 == 1 && j > 1 && j < n)
                        || (j == 1 && i > 1 && i < n) || (j == n && i > 1 && i < n))
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
        ip.close();
    }
}