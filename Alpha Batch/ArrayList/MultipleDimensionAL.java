import java.util.*;
public class MultipleDimensionAL {
    
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);

        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);
        
        // printing through traverse
        for (int i=0;i<mainList.size();i++) {
            System.out.print("[");
            for (int j=0;j<mainList.get(i).size();j++){
                if (j==mainList.get(i).size()-1){
                    System.out.println(mainList.get(i).get(j));
                    } else{
                        System.out.print(mainList.get(i).get(j)+", ");
                    }
    }
}
//or
    for(int i =0 ;i<mainList.size() ; i++){
        ArrayList<Integer> currList = mainList.get(i);
        for(int j=0 ; j<currList.size(); j++){
            System.out.println(currList.get(j) + " ");
        }
        System.out.println();
    }
    System.out.println(mainList);
}
}

//------------------------------------End Of Code---------------------------------//
