class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            /* Why else is not used is because if condition automatically ends  the method and it will be clean and concise formatt */
            set.add(nums[i]);
        }
        return false;
    }
}