package Pattern;

import java.util.Scanner;

public class HollowEquilateralTri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = scanner.nextInt();

        for (int i = 0; i < row; i++){
            if(i == 0){
                for (int spc = 0; spc < row - 1; spc++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            else if(i < row-1){
                for (int spc1 = 0; spc1 < row - i - 1; spc1++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int spc2 = 0; spc2 < 2*i-1; spc2++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            else{
                for (int j = 1; j<2*row; j++){
                    System.out.print("*");
                }
            }
        }
    }
}
