class Solution {
  public List<List<Integer>> powerSet(int[] nums) {
    // your code goes here
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    helper(0, nums, temp, ans);
    return ans;
  }

  public void helper(int index, int[] nums, List<Integer> temp, List<List<Integer>> ans) {
    if (index == nums.length) {
      ans.add(new ArrayList<>(temp));
      return;
    }
    temp.add(nums[index]);
    // pick
    helper(index + 1, nums, temp, ans);
    // backtrack
    temp.remove(temp.size() - 1);
    // not Pick
    helper(index + 1, nums, temp, ans);
  }
}
