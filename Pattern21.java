/*

A     
B C    
D E F   
G H I J  
K L M N O 


1
A B
1 2 3
A B C D
 */

public class Pattern21 {
    public static void main(String[] args) {
        char k = 'A';
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= 'E'; j++) {
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
