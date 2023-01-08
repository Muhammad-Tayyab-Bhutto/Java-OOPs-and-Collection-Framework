import java.util.Arrays;

public class ArrayinMid1 {
    public static void MergingArrays(int[] A, int[] B, int[] C) {
        int i = 0, j = 0, k = 0;

        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        while (i < A.length) {
            C[k++] = A[i++];
        }

        while (j < B.length) {
            C[k++] = B[j++];
        }
    }

    public static void main(String arg[]) {
        int[] A = { 1, 2, 3, 4, 5 };
        int[] B = { 10, 9, 8, 7, 6 };
        int[] C = new int[A.length + B.length];

        MergingArrays(A, B, C);

        System.out.println("Array after merging");
        Arrays.sort(C);
        for (int i = 0; i < C.length; i++)
            System.out.print(C[i] + " ");

    }
}
