package Pattern;
import java.util.Scanner;
public class FlippedPyramidSpc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = scanner.nextInt();

        for (int i = 0; i < row; i++){
            for (int spc = 0; spc < i; spc++){
                System.out.print(" ");
            }
            for (int str = row - i; str > 0; str--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
