class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // This is the Brute Froce approach for this problem with 
        // HashSet But this needs to be optimize as question says 
        // we don't have to use extra space. with O(n) time and O(1) space

        HashSet<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int key : nums) {
            set.add(key);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}