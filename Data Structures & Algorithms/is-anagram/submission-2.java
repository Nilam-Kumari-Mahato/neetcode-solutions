class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length()>t.length() ? s.length(): t.length();
        boolean[] arr = new boolean[n]; 
        for(int i =0 ; i<s.length() ; i++){
            for(int j=0 ; j<t.length() ; j++){
                if(s.charAt(i)==t.charAt(j) && arr[j] !=true){
                    arr[j]=true;
                    break;
                }
            }
        }
        for(int i=0 ; i< arr.length ; i++) {
            if (arr[i] == false) {
                return false;
            }
        }
        return true;
    }
}
