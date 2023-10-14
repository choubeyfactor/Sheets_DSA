/*
 * To know the occurrence of all three colors, that is '0' , '1', and '2' , we only need to find the occurrence of any two colors.
So in my approach I'm finding the occurence of 0 and 1-

Firstly, we will count occurrences of 0, and then 1.
Then, simply we can do changes in our array by printing them using the count variables.
After counting, the first loop will print the occurrences of 0 by using "cnt0" variable.
Then the another one will print the occurrences of 1, this will start after the "cnt0" and will execute till "cnt0+cnt1".
Then the last will run from "cnt0+cnt1" to length of the given array and prints the occurrence of 2.
 */
public class ColorSort {
    public void sortColors(int[] nums) {
        int cnt0=0;int cnt1=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                cnt0++;
            }
            else if(nums[i]==1){
                cnt1++;
            }
        }
        for (int a=0;a<cnt0;a++){
            nums[a]=0;
        }
        for (int b=cnt0;b<cnt0+cnt1;b++){
            nums[b]=1;
        }
        for(int c=cnt0+cnt1;c<nums.length;c++){
            nums[c]=2;
        }
    }
}
