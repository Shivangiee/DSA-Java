class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> ls = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(nums1[i] == nums2[j]){
                ls.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                 i++;
            }
            else{
                j++;
            }
        }
        int[] arr = new int[ls.size()];
        int k = 0;
        for(int val :ls){
            arr[k] = val;
            k++;
        }
        return arr;
    }
}
