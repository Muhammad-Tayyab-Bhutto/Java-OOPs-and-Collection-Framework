class Solution {
    public int[] twoSum(int[] nums, int target) {
        Mpa<Integer, Integer> nums_map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (nums_map.containsKey(x)) {
                return new int[] { nums_map.get(x), i };
            }
            nums_map.put(nums[i], i);
        }
        int arr[] = { -1, -1 };
        return arr;
    }
}