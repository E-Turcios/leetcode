import java.util.HashMap;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> seen = new HashMap();
    int dif;
    for (int i = 0; i < nums.length; i++) {
      if (seen.containsKey(nums[i])) {
        int[] sol = { seen.get(nums[i]), i };
        return sol;
      } else {
        dif = target - nums[i];
        seen.put(dif, i);
      }
    }
    return null;
  }
}
