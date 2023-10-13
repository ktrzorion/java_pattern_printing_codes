package Pattern;

import java.util.Scanner;

public class TimeGlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = scanner.nextInt();

        for (int i = 0; i < 2 * row; i++){
            if(i < row){
                for (int spc = 0; spc < i; spc++){
                    System.out.print(" ");
                }
                for (int str = row - i; str > 0; str--){
                    System.out.print("* ");
                }
            }else{
                for (int spc = 0; spc < (2 * row - i) - 1; spc++){
                    System.out.print(" ");
                }
                for (int str = 0; str < i - row + 1; str++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
