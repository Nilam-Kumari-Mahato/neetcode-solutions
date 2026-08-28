class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        //As their is a contion that the index[0] < index[1] so we are using the two pointers method.
        for(int i=0 ; i<numbers.length ; i++){
            for(int j =0 ; j< numbers.length ; j++){
                if(numbers[i] +numbers[j] == target && i<j){
                    index[0] = i+1;
                    index[1] = j+1;
                }
            }
        }
        return index;
    }
}
