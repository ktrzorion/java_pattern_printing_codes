package Pattern;

import java.util.Scanner;

public class FlippedRightRgtTri {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = scanner.nextInt();

        for (int i = 0; i < row; i++){
            for (int k = 0; k < i; k++){
                System.out.print(" ");
            }
            for (int j = row - i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
