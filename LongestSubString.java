class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            left = Math.max(left, index[c]);
            maxLength = Math.max(maxLength, right - left + 1);
            index[c] = right + 1;
        }

        return maxLength;
    }
}
