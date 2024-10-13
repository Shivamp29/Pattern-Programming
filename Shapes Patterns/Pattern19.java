/*

A     
A B
A B C
A B C D
A B C D E

 */

public class Pattern19 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= 'E'; j++) {
                if (i >= j) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
