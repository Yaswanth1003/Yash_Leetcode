import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        
        return new int[] {};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        int[] nums = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            nums[i] = Integer.parseInt(inputArr[i]);
        }
        
        int target = scanner.nextInt();
        
        int[] result = solution.twoSum(nums, target);
        
        System.out.println(result[0] + " " + result[1]);
        
        scanner.close();
    }
}
