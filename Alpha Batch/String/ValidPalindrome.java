public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        //checking if the string as input is not empty
        if (s.isEmpty()) {
        	return true;
        }
        //setting uo the pointers
        int start = 0;
        int last = s.length() - 1;

        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);

        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} 
            //at this point we have valid characters on both ends, compare them and move inward
            else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
}
