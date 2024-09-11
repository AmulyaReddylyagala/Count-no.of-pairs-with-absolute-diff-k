class Solution {
    public int countKDifference(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(Math.abs(nums[i]-nums[j])==k)
                count++;

            }
        }
    return count;  
    }
}