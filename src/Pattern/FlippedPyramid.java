package Pattern;

import java.util.Scanner;

public class FlippedPyramid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = scanner.nextInt();

        for (int i = 0; i < row; i++){
            for (int spc = 0; spc < i; spc++){
                System.out.print(" ");
            }
            for (int j = 2 * (row - i) - 1; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
