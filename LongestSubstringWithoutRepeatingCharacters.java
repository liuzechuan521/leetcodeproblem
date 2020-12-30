public class LongestSubstringWithoutRepeatingCharacters{
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            String longsub = "";
            String newsub = "";
            int count = 0;
            while(count < s.length()){
                String c = Character.toString(s.charAt(count));
                if(newsub.contains(c)){
                    if(newsub.length()>longsub.length()){
                        longsub = newsub;
                    }
                    int index = s.indexOf(c);
                    index++;
                    s = s.substring(index,s.length());
                    count = 0;
                    c = Character.toString(s.charAt(count));
                    newsub = c;
                }else{
                    newsub += c;
                }
                count ++;
            }
            if(newsub.length()>longsub.length()){
                return newsub.length();
            }else{
                return longsub.length();
            }
        }
    }
}
