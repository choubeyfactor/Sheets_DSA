/**
 * RepeatedStringMatch
 */
public class RepeatedStringMatch {

        public int repeatedStringMatch(String a, String b) {
            int minloop= b.length()/a.length();
            StringBuilder temp=new StringBuilder(a);
           for(int i=0;i<minloop+2;i++){
               if(temp.toString().contains(b)) return i+1;
               else temp.append(a);
           } 
    
           return -1;
        }
    }
/*
 * Approach
For example, let's say a = "abcd" and b = "cdabcdab".
In this case, b.length() is 8 and a.length() is 4. So, index = 8 / 4, which evaluates to 2. This means that you need at least 2 repetitions of string a to potentially make string b a substring of it.

Complexity
Time complexity: O(a.length() * b.length()).
Space complexity:O((index + 2) * a.length()).
 */