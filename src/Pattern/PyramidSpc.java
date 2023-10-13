package Pattern;

import java.util.Scanner;

public class PyramidSpc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = scanner.nextInt();

        for (int i = 1; i <= row; i++){
            for (int spc = row - i; spc > 0; spc--){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
