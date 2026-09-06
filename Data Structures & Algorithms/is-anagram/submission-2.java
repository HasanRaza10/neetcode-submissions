class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> freq1 = new HashMap<>();
        HashMap<Character, Integer> freq2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            freq1.put(ch1, freq1.getOrDefault(ch1, 0) + 1);
            freq2.put(ch2, freq2.getOrDefault(ch2, 0) + 1);
        }
        if (freq1.equals(freq2)) {
            return true;
        }
        return false;
    }
}
