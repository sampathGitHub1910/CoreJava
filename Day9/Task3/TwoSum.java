package Day9.Task3;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
          int complement = target - nums[i];
          if (seen.containsKey(complement)) {
            return new int[]{seen.get(complement), i}; // Optimized order for clarity
          }
          seen.put(nums[i], i);
        }
        return null;
      }
      
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(nums, target);
        if (result != null) {
            System.out.println("Two numbers found that add up to " + target + ": ");
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No such pair found.");
        }
    }
}
