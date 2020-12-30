class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        // O(n)
        int curr = nums[0] ;
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            curr= Math.max(curr+nums[i],nums[i]);
    	    max = Math.max(curr,max);
        }
        return max;
    }
}
