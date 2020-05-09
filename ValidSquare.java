import java.lang.Math;
class Solution {
    public boolean isPerfectSquare(int num) {
        double n= Math.sqrt(num);
   if(n==(int)n){
       return true;
   }else{
       return false;
   }
    }
}

//Your runtime beats 100.00 % of java submissions.