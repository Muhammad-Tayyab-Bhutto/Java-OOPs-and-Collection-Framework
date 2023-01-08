import java.util.Arrays;

public class ArraySameIndexes {
    public static void main(String[] arg){
        int[] A = { 1, 2, 3, 4, 5 };
        int[] B = { 1, 9, 8, 3, 6 };
        int C[] = new int[A.length+ B.length];
        int k = 0;
        int j = 0;
        int count = 1;
        for (int i = 0; i < A.length; i++){
            C[k++] = A[i];
        }
        for (int i = 0; i < B.length; i++){
            C[k++] = B[i];
        }
 
        Arrays.sort(C);
        for (int i = 0; i < C.length-1; i++){  
            if (C[i] == C[i+1]){  
                count++;  
            }  
        } 
        int[] temp = new int[C.length-count];
        for (int i = 0; i < C.length-1; i++){  
            if (C[i] != C[i+1]){  
                temp[j++] = C[i]; 
            }  
        } 
        for (int i : temp){
            System.out.print(i + " ");
        }
       
    }
}
