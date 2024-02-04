class Solution {
    public String thousandSeparator(int n) {
        String result = "";
        if(n==0){
            return "0";
        }
        int count=0;
        while(n>0){
            int lastDigit = n%10;
            n=n/10;
            result = lastDigit+result;
            count++;
            if(count ==3 && n>0){
                result = "." + result;
                count=0;
            }

        }
        return result;
        
    }
}
