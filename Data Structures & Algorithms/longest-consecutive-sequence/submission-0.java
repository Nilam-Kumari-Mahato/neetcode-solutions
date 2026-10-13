class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int maxlength =0 ;

        for(int num : nums){
            if(!set.contains(num-1)){
                int currentnum = num ;
                int count = 1;

                while(set.contains(currentnum+1)){
                    currentnum++;
                    count++;
                }

                maxlength = Math.max(count , maxlength);
            }
        }

        return maxlength;
    }
}
