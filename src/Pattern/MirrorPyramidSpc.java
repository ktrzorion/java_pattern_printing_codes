package Pattern;

import java.util.Scanner;

public class MirrorPyramidSpc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = scanner.nextInt();

        for (int i = 0; i < 2*row; i++){
            if (i < row){
                for (int spc = 0; spc < row - i; spc++){
                    System.out.print(" ");
                }
                for (int str = 0; str < i; str++){
                    System.out.print("* ");
                }
            }
            else{
                for (int spc = 0; spc < i - row; spc++){
                    System.out.print(" ");
                }
                for (int str = 0; str < 2 * row - i; str++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
