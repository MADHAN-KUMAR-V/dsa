class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right = numbers.length-1;
        while(left != right){
            int temp = numbers[left]+numbers[right];
            if(temp == target){
                return new int[]{left+1,right+1};
            }
            else if(target < temp){
                right--;
            }
            else if(target > temp){
                left++;
            }
        }
        return new int[]{-1,-1};
        
    }
}