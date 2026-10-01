class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int prod = 1;
        int zero = 0;
        for (int val : nums) {
            if (val == 0) {
                zero++;
            } else {
                prod *= val;
            }
        }
        if (zero > 1) {
            return new int[nums.length];
        }
        for (int i = 0; i < nums.length; i++) {
            if (zero == 1 && nums[i] != 0) {
                res[i] = 0;
            } 
            else if (nums[i] == 0) {
                res[i] = prod;
            }
            else {
                res[i] = prod / nums[i];
            }
        }
        return res;
    }
}  
