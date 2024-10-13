
/**
 * Enter the size : 7
 *
              *
              *
              *
        *     *
        *     *
        *     *
        * * * *

 */

import java.util.Scanner;

public class J {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = ip.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i >= (n / 2) + 1 && j == 1) || (i == n && j % 2 == 1) || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        ip.close();
    }
}