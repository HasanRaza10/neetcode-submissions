class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int val : arr) {
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }
        int lucky = -1;
        for (int key: freq.keySet()) {
            if (key == freq.get(key) && key > lucky) {
                lucky = key;
            }
        }
        return lucky;
    }
}