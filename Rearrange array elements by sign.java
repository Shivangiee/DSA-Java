class Solution {
  public int[] rearrangeArray(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n];
    int[] pos = new int[n / 2];
    int[] neg = new int[n / 2];
    int j = 0;
    int k = 0;
    for (int i = 0; i < n; i++) {
      if (nums[i] > 0) {
        pos[j++] = nums[i];
        // j++;
      } else {
        neg[k++] = nums[i];
        // k++;
      }
    }
    int p = 0;
    int q = 0;
    for (int i = 0; i < n; i += 2) {
      ans[i] = pos[p++];
        ans[i + 1] = neg[q++];
    }
    return ans;
  }
}
