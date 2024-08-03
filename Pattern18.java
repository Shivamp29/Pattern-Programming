/*
A B C D E 
A B C D E
A B C D E
A B C D E
A B C D E
 */

public class Pgm18 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= 'E'; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
