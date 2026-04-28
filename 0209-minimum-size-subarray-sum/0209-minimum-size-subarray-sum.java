class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int index =0;
        int min = Integer.MAX_VALUE;
        int sum=0;

        for(int i = 0;i<nums.length ; i++){
            sum +=nums[i];

            while(sum>=target){
                min=Math.min(min , i-index +1);
                sum-=nums[index++];
            }
        }
        return (min == Integer.MAX_VALUE )?  0:min;
    }
}