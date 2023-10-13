package Pattern;

import java.util.Scanner;

public class FlippedHollowEquilateralTri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = scanner.nextInt();

        for (int i = 0; i < row; i++){
            if( i == 0){
                for (int str = 0; str < 2*row-1; str++){
                    System.out.print("*");
                }
                System.out.println();
            } else if (i < row-1) {
                for (int spc1 = 0; spc1 < i; spc1++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int spc2 = 0; spc2 < 2 * (row - i - 2) + 1; spc2++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            else {
                for (int spc = 1; spc < row; spc++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
        }
    }
}
