class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target) {
            return 0;
        }
        int l = 0, r = nums.length - 1;
        while (l < r) {
            if (nums[l] == target) {
                return l;
            }
            if (nums[r] == target) {
                return r;
            }
            int mid = (l + r) / 2;
            if (nums[mid] > target) {
                r = r - 1;
            }
            else if (nums[mid] < target) {
                l = l + 1;
            }
            else if (nums[mid] == target) {
                return mid;
            }

        }
        return -1;
    }
}
