class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> lst = new ArrayList<>();
        lst.add(words[0]);
        for (int i = 1; i < groups.length; i++) {
            if (groups[i - 1] != groups[i])
                lst.add(words[i]);
        }
        return lst;
    }
}