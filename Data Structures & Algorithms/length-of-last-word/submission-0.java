class Solution {
    public int lengthOfLastWord(String s) {
        int res = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(res != 0 && !Character.isAlphabetic(s.charAt(i))) {
                return res;
            }

            if(Character.isAlphabetic(s.charAt(i))) {
                res++;
            }
        }

        return res;
    }
}