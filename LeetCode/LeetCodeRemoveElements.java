import java.util.*;
public class LeetCodeRemoveElements {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[count++]=nums[i];
            }
        }
        return count;
    }
    public static void main(String arg[]){
        int nums[] = {3,2,2};
        int val = 3;
        System.out.print(removeElement(nums, val));
    }
}
