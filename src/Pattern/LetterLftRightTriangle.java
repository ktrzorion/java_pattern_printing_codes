package Pattern;

import java.util.Scanner;

public class LetterLftRightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        char currentChar = 'a';
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((count) % 2 != 0) {
                    currentChar = Character.toUpperCase(currentChar);
                    System.out.print(currentChar + " ");
                }else {
                    currentChar = Character.toLowerCase(currentChar);
                    System.out.print(currentChar + " ");
                }
                currentChar++;
                count++;
            }
            System.out.println();
        }
    }
}
