import java.util.ArrayList;

public class ContainerWithMostWater {
    

    public static int storeWater(ArrayList<Integer>height){
        int maxWater = 0;
        //bruteForce-> O(n^2)
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1 ; j < height.size() ; j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = ht*width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    //2 pointer approach
    public static int storeWaterOptimal(ArrayList<Integer>height){
        if(height == null || height.isEmpty())return -1;
        int left=0;
        int right=height.size()-1;
        int maxArea = Integer.MIN_VALUE;
        while(left != right){
            int minHeight = Math.min(height.get(right), height.get(left));
            int area = minHeight * (right - left);
            maxArea = Math.max(area, maxArea);
            if(height.get(left) <= height.get(right)){
                left++;
                }else{
                    right--;
                    }
                    }
                    return maxArea;
                    }


    public static void main(String[] args) {
         ArrayList<Integer> height = new ArrayList<>();
         //1,8,6,2,5,4,8,3,7
         height.add(1);
         height.add(8);
         height.add(6);
         height.add(2);
         height.add(5);
         height.add(4);
         height.add(8);
         height.add(3);
         height.add(7);

         System.out.println(storeWater(height));

    }
}
