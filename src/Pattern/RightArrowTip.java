package Pattern;

import java.util.Scanner;

public class RightArrowTip {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = scanner.nextInt();

        for (int i = 0; i < 2*row; i++){
            if(i <= row){
                for (int j = 0; j < i; j++){
                    System.out.print("*");
                }
            }else{
                for (int j = 2 * row - i; j > 0; j--){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
