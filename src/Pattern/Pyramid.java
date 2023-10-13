package Pattern;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = scanner.nextInt();

        for (int i = 0; i < row; i++){
            for (int spc = 0; spc < row - i - 1; spc++){
                System.out.print(" ");
            }

            for(int str = 0; str < 2 * i + 1; str++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
