import java.util.Scanner;
public class TwoDArray {
    public static void main(String ar[]){
        Scanner user_input = new Scanner(System.in);
        System.out.print("How many rows you have? ");
        int rows = user_input.nextInt();
        System.out.print("How many columns you have? ");
        int columns = user_input.nextInt();
        int[][] twodarr = new int[rows][columns];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                twodarr[i][j] = user_input.nextInt();
            }
        } 
        for (int i = 0; i < rows; i++){
            for (int j:twodarr[i]){
                System.out.print(j + "  ");
            }
        }
    }
}
