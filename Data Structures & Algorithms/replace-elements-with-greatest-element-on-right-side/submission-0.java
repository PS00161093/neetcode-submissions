class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;

        int[] greatest = new int[len];
        greatest[len - 1] = -1;
        
        int currMax = arr[len - 1];
        int idx = len - 1;

        for(int i = len - 2; i >= 0; i--) {
            greatest[i] = Math.max(currMax, arr[idx]);
            currMax = Math.max(currMax, arr[idx]);
            idx--;
        }

        return greatest;
    }
}