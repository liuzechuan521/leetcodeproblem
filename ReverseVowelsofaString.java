public class  ReverseVowelsofaString {
    class Solution {
        public String reverseVowels(String s) {
            int i = 0;
            int j = s.length()-1;
            while(i<j){
                char i_c = s.charAt(i);
                char j_c = s.charAt(j);
                if(check(i_c)&&check(j_c)){
                    if(i==0 && j==s.length()-1){
                        s = j_c + s.substring(i+1,j) + i_c;
                    }else if(i==0 && j!=s.length()-1){
                        s = j_c + s.substring(i+1,j) + i_c + s.substring(j+1);
                    }else if(i!=0 && j==s.length()-1){
                        s = s.substring(0,i) + j_c + s.substring(i+1,j) + i_c;
                    }else{
                        s = s.substring(0,i) + j_c + s.substring(i+1,j) + i_c + s.substring(j+1);
                    }
                    i++;
                    j--;
                }else if(check(i_c) && !check(j_c)){
                    j--;
                }else if(!check(i_c) && check(j_c)){
                    i++;
                }else{
                    i++;
                    j--;
                }
            }
            return s;
        }
        public boolean check(char c){
            String vowel = "aeiouAEIOU";
            return vowel.indexOf(c)!=-1;
        }
    }
}
