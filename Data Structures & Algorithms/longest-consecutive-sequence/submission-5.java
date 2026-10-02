class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : nums) {
            set.add(val);
        }
        int count = 0;
        for (int val : nums) {
            if (!set.contains(val - 1)) {
                int i = 1;
                while (set.contains(val + i)) {
                    i++;
                }
                count = Math.max(count, i);
            }
        }
        return count;
    }
}
