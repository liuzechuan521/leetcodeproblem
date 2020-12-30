import java.util.*;
public class Twosum{
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            // 建立一个dictionary 存储每一个element和所对应的index
            Hashtable<Integer,Integer> dict = new Hashtable<Integer,Integer>();
            for(int i=0;i<nums.length;i++){
                dict.put(nums[i],i);
            }
            
            // 在dictionary里面找到两个key的和等于target并return 他们的value
            for(int j=0;j<nums.length;j++){
                int diff = target - nums[j];
                if(dict.get(diff) != null){
                    if(dict.get(diff)!=j){
                        return new int[] {j,dict.get(diff)};
                    }
                }
            }
            return new int[] {0,0};
        }
    }
}