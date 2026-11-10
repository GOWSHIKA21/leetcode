class Solution {
    public int maxFreqSum(String s) {
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 'a');

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vowel = Math.max(vowel, count[i]);
            } else {
                consonant = Math.max(consonant, count[i]);
            }
        }

        return vowel + consonant;
    }
}