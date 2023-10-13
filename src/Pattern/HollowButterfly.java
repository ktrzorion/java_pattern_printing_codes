package Pattern;

import java.util.Scanner;

public class HollowButterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int row = 0; row < 2*n; row++){
            if (row == 0 || row == 2*n-1){
                System.out.print("*");
                for (int spc = 0; spc < 2*n-2; spc++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            else if (row < n){
                System.out.print("*");
                for (int spc1 = 0; spc1 < row-1; spc1++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int spc2 = 0; spc2 < -2*row+8; spc2++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int spc1 = 0; spc1 < row-1; spc1++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            else if(row >= n && row < 2*n) {
                System.out.print("*");
                for (int spc1 = 0; spc1 < -row + 8; spc1++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int spc2 = 0; spc2 < 2 * row - 10; spc2++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int spc3 = 0; spc3 < -row + 8; spc3++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
