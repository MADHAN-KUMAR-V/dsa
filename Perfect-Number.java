class Solution {
    public boolean checkPerfectNumber(int num) {
        int ans = num;
        int sum=0;
        for(int i=1;i*i<num;i++){
            if(num%i==0){
                sum+=i;
                if(num/i != i && num/i != num){
                    sum+=num/i;
                }
            }
        }
        return ans==sum ? true:false;
        
    }
}
