public class MaxSubarray {
    //bruteforce
    public static int maxSubarraySum(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        
        for (int i=0;i<numbers.length;i++){
            int start = i;
            for (int j=i;j<numbers.length;j++){
                int end = j;
//currentsum will be declared inside the loop not outside as everytime it needs to be initialized before comparison
                int currsSum = 0; 
                for (int k=start;k<=end;k++){
                    currsSum += numbers[k];
                }
                if (currsSum > maxSum){
                    maxSum = currsSum;}
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        int max = maxSubarraySum(numbers);
        System.out.println("Maximum subarray sum: "+ max);
    }
}
