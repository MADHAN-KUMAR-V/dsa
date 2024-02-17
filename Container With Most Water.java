class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int maxArea=0;
        while(left < right){
            int length = right-left;
            int high = Math.min(height[right],height[left]);
            int area = length * high;
            maxArea = Math.max(maxArea,area);
            if(height[right]>height[left]){
                left++;
            } else{
                right--;
            }
        }
        return maxArea;


    }
}
