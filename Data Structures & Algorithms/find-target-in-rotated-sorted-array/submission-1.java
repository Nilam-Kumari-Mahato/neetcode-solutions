class Solution {
    public int search(int[] nums, int target) {
        
        int pivot = searchPivot(nums);
        if(pivot == -1){
            return binarySearch(0 , nums.length-1 , nums , target);
        }
        else{
            if(target == nums[pivot]){
                return pivot;
            }
            if(target < nums[0] ){
                return binarySearch(pivot+1 , nums.length-1 , nums , target);
            }
            if(target >= nums[0]){
                return binarySearch(0, pivot, nums , target);
            }
        }
        return -1;
    }

    public int binarySearch(int start , int end , int[] nums , int target){
        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }
    public int searchPivot(int[] nums){
        int start =0 ;
        int end = nums.length -1;
        int pivot;

        while(start < end){
            int mid = start + (end-start)/2;

            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[start] >= nums[mid]){
                end = mid-1;
            }
            if(nums[start] < nums[mid]){
                start = mid+1;
            }
        }
        return -1;
    }
}
