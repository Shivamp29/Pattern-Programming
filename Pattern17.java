/*
 * 1    
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */

public class Pgm17 {
    public static void main(String[] args) {
        int n = 4;
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= j) {
                    System.out.print(k + " ");
                    k++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
