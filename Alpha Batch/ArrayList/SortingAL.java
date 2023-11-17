import java.util.*;
public class SortingAL {
    public static void main(String[] args) {
        //sorting an ArrayList
List<Integer> sortedList = new ArrayList<>();
sortedList.addAll(list);
Collections.sort(sortedList); //O(n log n)

//sorting in descending order
ArrayList<Integer> list2 = new ArrayList<>();
list2.addAll(list2);
Collections.reverseOrder();

//using comparator
Comparator<Integer> comp = (a, b)-> a-b;
Collections.sort(list2,comp);
    }
}
