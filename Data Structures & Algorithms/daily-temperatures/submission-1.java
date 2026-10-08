class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        for (int i = 1; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int top = stack.pop();
                result[top] = i - top;
            }
            stack.add(i);
        }
        return result;
    }
}
