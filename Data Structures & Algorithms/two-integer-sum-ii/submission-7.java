class Solution {
    public int[] twoSum(int[] numbers, int target) {
       /** int[] index = new int[2];
        for(int i=0 ; i<numbers.length ; i++){
            for(int j =0 ; j< numbers.length ; j++){
                if(numbers[i] +numbers[j] == target && i<j){
                    index[0] = i+1;
                    index[1] = j+1;
                }
            }
        }
        return index;**/
        //Solving using binary search as the give numbers array is sorted .
        for(int i =0 ; i<numbers.length ; i++){
            int left=i+1 ;
            int right = numbers.length-1;
            int temp = target - numbers[i];
            while(left <= right){
                int mid = left + (right-left)/2;
                if(numbers[mid] == temp ){
                    return new int[] {i+1 , mid+1};
                }else if(numbers[mid] < temp){
                    left = mid+1;
                }else{
                    right = mid -1 ;
                }
            }
        }

        return new int[0];
    }
}
