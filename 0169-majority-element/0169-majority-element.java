class Solution {

    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        Map <Integer,Integer> map = new HashMap<>() ;

        for(int i =0 ; i<n ; i++){
            if(map.containsKey(nums[i])){
                int value  = map.get(nums[i]);
                map.put(nums[i],value + 1);
                // count++
            }
            else{
                map.put(nums[i] , 1);
                // count = 0;
            }

        }

        for(int key : map.keySet()){
            if(map.get(key) > (n/2)){
                return key;
            } 


        }

        return -1;
    }
}