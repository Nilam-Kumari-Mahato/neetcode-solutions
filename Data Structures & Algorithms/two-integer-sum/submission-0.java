class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force approach to solve the two sum problem
        int[] res = new int[2];
        for(int i=0 ; i<nums.length ; i++){
            for(int j = 0 ; j<nums.length ; j++){
                if(i!=j && nums[i]+nums[j] == target ){
                    res[1]=i;
                    res[0]=j;
                }
            }
        }
        return res;
        
    }
}
