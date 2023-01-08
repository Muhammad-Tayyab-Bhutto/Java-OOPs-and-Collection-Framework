import java.util.*;

public class LeetCodeRemoveDuplicates {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++){
            l2.add(nums1[i]);                
        }
        for (int i = 0; i < nums2.length; i++){
            l2.add(nums2[i]);                
        }
        l2.sort();
        for (int i = 1; i < l2.size(); i++){
            if(nums1[i] != nums2[1]){
                l1.add(l2);
            }
        }
        return l2;
    }

    public static void main(String arg[]) {
        int nums1[] = { 1,2,3,3 };
        int nums2[] = { 1, 1, 2 };
        System.out.print(findDifference(nums1, nums2));
    }
}
