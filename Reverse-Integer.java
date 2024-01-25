class Solution {
    public int reverse(int x) {
        int n=x;
        if(x<0){
            x=x*-1;
        }
        
        int reverse = 0 ;
        while(x>0){
            int lastDigit = x%10;
            x=x/10;
            reverse=(reverse*10)+lastDigit;
            //to check exceed of int
            if(reverse%10 != lastDigit){
                return 0;
            }
        }
        return n<0? reverse*-1:reverse;
        
    }
}
