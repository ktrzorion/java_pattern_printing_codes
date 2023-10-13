package Pattern;

import java.util.Scanner;

public class RightRightTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = scanner.nextInt();

        for (int i = 0; i < row; i++){
            for (int j = row - i - 1; j > 0; j--){
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
