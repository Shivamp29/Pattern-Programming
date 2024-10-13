
/**
Enter the size : 5

        *   *
        **  *
        * * *
        *  **
        *   *
        
 */
import java.util.Scanner;

public class N {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = ip.nextInt();

        int k = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || j == k)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            if (i == 1) {
                k = 1;
            }
            k++;
            System.out.println();
        }
        ip.close();
    }
}