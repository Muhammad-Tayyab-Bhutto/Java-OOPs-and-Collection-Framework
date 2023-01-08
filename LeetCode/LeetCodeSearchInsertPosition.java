public class LeetCodeSearchInsertPosition{
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < target){
                index++;
            }
            else {
                break;
            }
        }
        return index;
    }
    public static void main(String arrg[]){
        int[] nums = {1,3,4,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }
}