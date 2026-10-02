class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        int res = -1;
        for (int luck : map.keySet()) {
            if (luck == map.get(luck) && luck > res) {
                res = luck;
            }
        }
        return res;
    }
}