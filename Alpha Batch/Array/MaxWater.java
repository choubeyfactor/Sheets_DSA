/**
 * MaxWater
 */
import java.util.*;
public class MaxWater {

    public static int maxArea(int[] height){
        int left = 0;                   
// Left pointer starting from the leftmost edge
        int right = height.length - 1;  
// Right pointer starting from the rightmost edge
        int maxWater = 0;               
// Initialize the maximum water capacity

        while (left < right) {
            int width = right - left ;
// Calculate the height of the container (the minimum height between the two lines)
            int h = Math.min(height[left], height[right]);
// Calculate the water capacity of the current container
            int water = h*width;
// Update the maximum water capacity if the current container holds more water
            maxWater = Math.max(maxWater, water);
            // Move the pointers towards each other
            if (height[right] > height[left]) {
                left ++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        
    }
}