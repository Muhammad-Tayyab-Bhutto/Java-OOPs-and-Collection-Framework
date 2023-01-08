import java.util.Scanner;


public class Lab01Task01 {
    public static void main(String arh[]){
        Scanner user_input = new Scanner(System.in);
        // int a = user_input.nextInt(); 
        // out:{
        // lab:{
        //     for (int j =0; j < 3; j++){
        //         label:
        //         for (int i =0; i < 6; i++){
        //             if (i == 3){
        //                 break lab;
        //             }
        //             else{
        //                 System.out.println(j);
        //             }
        //         }
        //     } System.out.println("'I am out of Label lab'");
        // }
        // }

        int arr[][] = new int[3][];
        int a = user_input.nextInt();
        for (int i = 0; i < 3; i++){
            // arr[i] = new int[user_input.nextInt()];
            arr[i] = new int[a];
            for (int j = 0; j < a; j++)
            {
                arr[i][j] = user_input.nextInt();
            }
        }

    }        
}
