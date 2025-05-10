class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        double max = Double.NEGATIVE_INFINITY;
        for(int i=0;i<=len-k;i++){
            int sum = 0; 
            for(int j=i;j<i+k;j++){
                sum = sum + nums[j];
            }
            double average = (double) sum / k;
            if(average > max){
                max = average;
            }
        }
        return max;
    }
}