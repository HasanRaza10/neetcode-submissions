class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> unique = new TreeSet<>();
        for (int val : nums) {
            unique.add(val);
        }
        int i = 0;
        for (int val: unique) {
            nums[i++] = val;
        }
        return unique.size();
    }
}