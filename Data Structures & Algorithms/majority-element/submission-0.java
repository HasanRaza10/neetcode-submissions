class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int val: nums) {
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }
        int n = nums.length / 2;
        for (int val: freq.keySet()) {
            if (freq.get(val) > n) {
                return val;
            }
        }
        return -1;
    }
}