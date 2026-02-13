import java.util.*;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private boolean matches(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }

        int[] map1 = new int[26];
        int[] map2 = new int[26];
        Arrays.fill(map1, -1);
        Arrays.fill(map2, -1);

        for (int i = 0; i < word.length(); i++) {
            int c1 = word.charAt(i) - 'a';
            int c2 = pattern.charAt(i) - 'a';

            if (map1[c1] == -1 && map2[c2] == -1) {
                map1[c1] = c2;
                map2[c2] = c1;
            } else if (map1[c1] != c2 || map2[c2] != c1) {
                return false;
            }
        }

        return true;
    }
}
