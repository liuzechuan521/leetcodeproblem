public class LongestWordinDictionarythroughDeleting {
    class Solution {
        public String findLongestWord(String s, List<String> d) {
            int longest = 0;
            String longestword = "";
            for(String word:d){
                if(check(s,word)){
                    if(word.length()>longest || (word.length()==longest && longestword.compareTo(word)>0)){
                        longestword = word;
                        longest = word.length();
                    }
                }
            }
            return longestword;
        }
        public boolean check(String s, String d){
            for(int c=0;c<d.length();c++){
                char x = d.charAt(c);
                int i = 0;
                int flag = 0;
                while(i<s.length()){
                    if(s.charAt(i)==x){
                        s = s.substring(i+1);
                        flag = 1;
                        break;
                    }
                    i++;
                }
                if(flag==0){
                    return false;
                }        
            }
            return true;
        }
    }
}
