class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> res = new HashMap<>();

        for (int i=0 ; i<strs.length ; i++){
            char[] charas = strs[i].toCharArray();
            Arrays.sort(charas);
            String sortedS = new String(charas);
            res.putIfAbsent(sortedS , new ArrayList<>());
            res.get(sortedS).add(strs[i]);
        } 

        return new ArrayList<>(res.values());
    }
}
