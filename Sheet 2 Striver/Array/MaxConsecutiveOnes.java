public class MaxConsecutiveOnes {
    
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0; //initializing the count
        int max = 0;
        for(int i=0;i<nums.length;i++){  //if element = 1 then increase the count
            if(nums[i] == 1){
                count++;
            }else{ // compare the greatest of max and count for storing the value
                max = Math.max(max, count);
                count=0;//if dont find next element to be 1 then initialize the count with zero
            }
        }
        max = Math.max(max, count); //final comparison and getting the ans
        return max;
    }
}
