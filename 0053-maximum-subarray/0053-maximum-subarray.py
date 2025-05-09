class Solution(object):
    def maxSubArray(self, nums):
        n = len(nums)
        max = -sys.maxsize-1
        sum = 0
        
        for i in range(n):
            sum += nums[i]
            if sum > max:
                max = sum
            if sum < 0:
                sum = 0
        return max