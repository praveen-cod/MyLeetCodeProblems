class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String e : emails){
            String[] words = e.split("@");
            int ind = words[0].indexOf('+');
            String cur = "";
            if(ind != -1){
                words[0] = words[0].substring(0,ind);
            }
                words[0] = words[0].replace(".","");
            set.add(words[0]+'@'+words[1]);
        }
        System.out.println(set);
        return set.size();
    }
}