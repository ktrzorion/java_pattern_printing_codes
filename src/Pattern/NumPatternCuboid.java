package Pattern;

import java.util.Scanner;

public class NumPatternCuboid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int row = 1; row <= 2 * n - 1; row++){
            for (int col = 1; col <= 2 * n - 1; col++){
                int num = Math.max(Math.abs(row - n), Math.abs(col - n));
                System.out.print(num + 1 + " ");
            }
            System.out.println();
        }
    }
}
