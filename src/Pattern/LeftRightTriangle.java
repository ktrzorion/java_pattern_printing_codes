package Pattern;

import java.util.Scanner;

public class LeftRightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
