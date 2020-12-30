public class ValidPalindromeII {
    class Solution {
        public boolean validPalindrome(String s) {
            int i = 0;
            int j = s.length()-1;
            while(i<=j){
                char i_c = s.charAt(i);
                char j_c = s.charAt(j);
                if(i_c==j_c){
                    i++;
                    j--;
                }else{
                    return isvalid(s.substring(i+1,j+1)) || isvalid(s.substring(i,j));
                }
            }
            return true;
        }
        public boolean isvalid(String s){
            int i = 0;
            int j = s.length()-1;
            while(i<=j){
                char i_c = s.charAt(i);
                char j_c = s.charAt(j);
                if(i_c!=j_c){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }
}
