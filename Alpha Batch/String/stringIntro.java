import java.util.*;

public class stringIntro {

    public static void printWord(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    
public static void main(String[] args) {
    
    String str = "abcd";
    String str2 = new String("xyz");
    
//String are immutable    

Scanner sc = new Scanner(System.in);
String name = sc.nextLine(); 
//it allows the whole line which can be taken as a whole line from user input
//along with all special characters 
    System.out.println(name);
    System.out.println(name.length()); 
//while counting the lenght we will count the space also along with the characters


//concatetnation

String firstName = "Mayank";
String secondNAme = "Choubey";
String fullName = firstName + " " + secondNAme; //string concatenation
System.out.println(fullName + " is this..");

//calling the function
printWord(str);


/*------------------  COMPARISON  ---------------- */

String a1 = "Tony";
String a2 = "Tony";
String a3 = new String("Tony");

if (a1 == a2) {
    System.out.println("String are equal");
}else{
    System.out.println("Stringa sre not equal");
}

if (a1 == a3) {
    System.out.println("String are equal");
}else{
    System.out.println("Stringa sre not equal");
}
//From the above state we can see that it will show equal for the first comparison but not the second one
//This is because in case of string when two variables contain same value that in memory part it points the same
//because in java string class has overridden equals() method and so on...
//but in the second case as we have created a3 as a new variable so it wull not be equal


if (a1.equals(a3)) {
    System.out.println("Strings rae equal");
}//now this will show accurate results
else{
    System.out.println("Strings are not equal");
}
}




}