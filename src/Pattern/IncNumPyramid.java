package Pattern;

import java.util.Scanner;

public class IncNumPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = scanner.nextInt();

        for (int i = 1; i <= row; i++){
            for (int spc = 0; spc < row - i + 1; spc++){
                System.out.print("  ");
            }
            for (int num1 = i; num1 > 0; num1--){
                System.out.print(num1 + " ");
            }
            for (int num2 = 2; num2 <= i; num2++){
                System.out.print(num2 + " ");
            }
            System.out.println();
        }
    }
}
