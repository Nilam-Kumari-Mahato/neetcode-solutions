class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0 ;
        int res =0;
        HashMap<Character , Integer> map = new HashMap<>();

        for(r=0 ; r<s.length() ; r++){
            map.put(s.charAt(r) , map.getOrDefault(s.charAt(r) , 0)+1);

            while(map.get(s.charAt(r)) > 1){
                char ch = s.charAt(l);
                map.put(ch , map.get(ch)- 1);
                l++;
            }

            res = Math.max(res , r-l+1);
        }

        return res;
    }
}
