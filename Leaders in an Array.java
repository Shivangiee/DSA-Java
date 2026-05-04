class Solution {
  public List<Integer> leaders(int[] nums) {
    int n = nums.length;
    List<Integer> ans = new ArrayList<>();
    int max = Integer.MIN_VALUE;
    for (int i = n - 1; i >= 0; i--) {
      if(i==n-1){
        max = nums[i];
        ans.add(nums[i]);
      }
      else if (nums[i]>max) {
        max = nums[i];
        ans.add(nums[i]);
      }
    }
    Collections.reverse(ans);
    return ans;
  }
}
