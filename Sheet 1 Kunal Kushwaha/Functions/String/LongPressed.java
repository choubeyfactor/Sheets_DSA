public class LongPressed {

        public boolean isLongPressedName(String name, String typed) {
            int len1 = name.length();
            int len2 = typed.length();
            int idx1 = 0;
            int idx2 = 0;
            char prev = name.charAt(0);
            char c2 = typed.charAt(0);
            char c1 = prev;
            while(idx1 < len1 && idx2 < len2 ){
                c1 = name.charAt(idx1);
                c2 = typed.charAt(idx2);
                if(c1 == c2){
                    idx1++;
                    idx2++;
                    prev = c1;
                }
                else if(c2 == prev){
                    idx2++;
                }
                else{
                    return false;
                }   
            } 
            while(idx2<len2){
                c2 = typed.charAt(idx2);
                if(c2 != c1){
                    return false;
                }
                idx2++;
            }
            return idx1==len1 && idx2==len2;
        }
    }

//-------------------------------------------OR--------------------------------------------

 /* 
  * class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n=name.length();
        int m=typed.length();
        if(n>m)return false;
        if(name.charAt(0)!=typed.charAt(0))return false;
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(name.charAt(i)==typed.charAt(j))
            {
                i++;
                j++;
            }
            else if(name.charAt(i-1)==typed.charAt(j))
            {
                j++;
            }
            else 
            return false;

        }
        while(j<m)
        {
            if(name.charAt(i-1)==typed.charAt(j))j++;
            else 
            return false;

        }
        if(i<n)
            return false;

        return true;
    }
}
 */
