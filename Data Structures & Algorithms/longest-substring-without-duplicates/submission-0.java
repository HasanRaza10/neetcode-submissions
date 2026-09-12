class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int l = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            while (window.contains(s.charAt(i))) {
                window.remove(s.charAt(l));
                l++;
            }
            window.add(s.charAt(i));
            res = Math.max(res, i - l + 1);
        }
        return res;
    }
}
