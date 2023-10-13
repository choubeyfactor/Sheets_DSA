public class MissingNumber {
    

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n+1];
        for(int i = 0 ; i<n; i++){
            arr[nums[i]]=1; 
        }
        for(int i = 0; i<=n; i++){
            if(arr[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}
