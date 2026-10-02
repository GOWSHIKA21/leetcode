class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int m=0;
        HashSet<Character> set=new HashSet<>();
        for(int e=0;e<s.length();e++){
            while(set.contains(s.charAt(e))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(e));
            m=Math.max(m,e-l+1);

        }
        return m;
    }
}