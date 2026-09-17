class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        int i = 0;
        for (int val: nums) {
            res[i++] = val;
        }

        for (int val: nums) {
            res[i++] = val;
        }
        return res;
    }
}