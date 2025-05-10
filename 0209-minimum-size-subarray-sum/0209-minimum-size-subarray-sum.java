class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int len = nums.length;
        // int min = Integer.MAX_VALUE;
        // for(int i=0;i<len;i++){
        //     int sum = 0;
        //     int curr_len;
        //     for(int j=i;j<len;j++){
        //         sum = sum + nums[j];
        //         if(sum >= target){
        //             curr_len = j-i+1;
        //             min = Math.min(curr_len,min);
        //             break;
        //         }
        //     }
        // }
        int l = 0;
        int r = 0;
        int currsum = 0;
        int min = Integer.MAX_VALUE;
        for(r=0;r<nums.length;r++){
            currsum += nums[r];
            while(currsum>=target){
                if(r-l+1 < min){
                    min = r-l+1;
                }
                currsum -= nums[l];
                l++;
            }
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }
}