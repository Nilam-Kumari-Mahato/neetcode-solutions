class Solution {
    public int characterReplacement(String s, int k) {
        
        int l=0 ;
        int r=0;
        int freq[] = new int[26];
        int maxfreq = 0;
        int maxlength=0;

        for(r=0 ; r<s.length() ; r++){
            char ch = s.charAt(r);
            freq[ch - 'A']++;

            maxfreq = Math.max(maxfreq , freq[ch - 'A']);

            while((r-l+1)-maxfreq > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            maxlength = Math.max(maxlength , (r-l+1));
        }

        return maxlength;
    }
}
