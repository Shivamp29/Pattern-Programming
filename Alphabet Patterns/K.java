
/**
 * Enter the size : 8
 * 
        *   *
        *  *
        * *
        **
        *
        **
        * *
        *  *
        
 */
import java.util.Scanner;

public class K {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = ip.nextInt();
        int k = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (j == 1 || j == k)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            if (i <= n / 2)
                k--;
            else
                k++;
            System.out.println();
        }
        ip.close();
    }
}