class Solution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int curVal = -1;
        
        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = curVal;
            curVal = Math.max(curVal, arr[i]);
        }

        return result;
    }
}