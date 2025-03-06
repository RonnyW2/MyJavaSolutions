class Solution {
    public int[] twoSum(int[] nums, int target) {
        short len=(short)(nums.length);
        for(int i=0;i<len;i++){
            int t_target=target-nums[i];
            for(int j=i+1;j<len;j++){
                if(nums[j]==t_target){
                    int[] result={i,j};
                    return result;
                }
            }
        }return new int[0];
    }
}
