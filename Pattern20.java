/*

A B C D E 
 B C D E 
  C D E 
   D E 
    E 

 */

public class Pgm20 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= 'E'; j++) {
                if (i <= j) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
