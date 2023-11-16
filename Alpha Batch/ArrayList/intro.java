import java.util.*;

/**
 * intro
 */
public class intro {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //TC-> O(1)
        list.add(2);
        list.add(3);
        System.out.println("ArrayList: " + list);

        //add element at particular index
        list.add(1,9 );
        System.out.println(list);

        //Get Element - O(1)
        int element = list.get(2);
        System.out.println("Element at index 2: " + element);

        //Delete
        list.remove(0); //O(n)

        //Set element at Index
        list.set(1,5);//O(1)

        //Contains Element
        boolean contains = list.contains(4); //O(n)

        //Size of ArrayList
        int size = list.size(); //O(1)

        //print the arraylist in backward order
        Collections.reverse(list); //O(nlogk)
            //through traversing
            for (int i=list.size()-1;i>=0;i--){
                System.out.print(list.get(i)+" ");
            }

        //find maximum in ArrayList
        int max = Collections.max(list); //O(n)
            //through traversing
            int max_element = Integer.MIN_VALUE;
            for (int i : list) {
                if (i > max_element) {
                    max_element = i;
                    }
                    }
 //Find minimum in ArrayList
    int min = Collections.min(list); //O(n)
     //through traversing
        int min_element = Integer.MAX_VALUE;
            for (int i : list) {
            if (i < min_element) {
                min_element = i;
        }
    }

//swapping two number in ArrayList
Collections.swap(list,3,7); //O(1)
//through temp method
int temp = list.get(3);
list.set(3,list.get(7));
list.set(7,temp);

    }