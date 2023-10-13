package Pattern;

import java.util.Scanner;

public class MirrorIncNumPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = scanner.nextInt();

        for (int i = 1; i <= 2*row; i++){
            if (i < row){
                for (int spc = row-i; spc > 0; spc--){
                    System.out.print(" ");
                }
                for (int num1 = 1; num1 <= i; num1++){
                    System.out.print(num1);
                }
                for (int num2 = i-1; num2 > 0; num2--){
                    System.out.print(num2);
                }
                System.out.println();
            }
            else{
                for (int spc = 0; spc < i - row ; spc++){
                    System.out.print(" ");
                }
                for (int num1 = 2*row-i; num1 > 0; num1--){
                    System.out.print(num1);
                }
                for (int num2 = 2; num2 <= 2*row-i; num2++){
                    System.out.print(num2);
                }
                System.out.println();
            }
        }
    }
}
