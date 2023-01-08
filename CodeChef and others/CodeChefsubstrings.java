import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CodeChefsubstring {


    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
		int t = user_input.nextInt();
		while (t-->0){
            int l = user_input.nextInt();
            int s = user_input.nextInt();
            String string = user_input.next();
            String arr[] = new String[s];
            char charArr = string.toCharArray();

            if(l > s){
                for(int i = 0; i < l; i++){
                    arr[i] = (String)charArr[i];
                }
            }
            String result;
            for(int i = 0; i < arr.length; i++){
                result += arr[i];
            }

            System.out.println(result);
        }
	}

}
