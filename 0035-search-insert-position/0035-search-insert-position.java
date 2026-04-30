class Solution {
    public int searchInsert(int[] nums, int target) {
        int count=0;
        if(target<nums[0]){
            return 0;
        }
        int i=0;
        for(;i<nums.length;i++){
            // ++count;
            if(nums[i] == target){
                return i;
            }
            else if ((i+1) < nums.length && target > nums[i] && target < nums[i + 1]){
                return i+1;
            }

        }
        return i;
        
    }
}