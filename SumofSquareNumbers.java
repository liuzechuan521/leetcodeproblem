public class SumofSquareNumbers{
    class Solution {
        public boolean judgeSquareSum(int c) {
            double i = 0;
            double j = Math.ceil(Math.sqrt(c));
            while(i<=j){
                double square = (i*i) + (j*j);
                if(square==c){
                    return true;
                }else if(square<c){
                    i++;
                }else{
                    j--;
                }
            }
            return false;
        }
    }
}
