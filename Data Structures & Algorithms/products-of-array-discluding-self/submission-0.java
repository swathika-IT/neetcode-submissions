class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] p=new int[nums.length];
        p[0]=1;
        for(int i=1;i<nums.length;i++){
    p[i]=nums[i-1]*p[i-1];
        }
        int suffix=1;
        for(int i=nums.length-1;i>=0;i--){
            p[i]*=suffix;
            suffix*=nums[i];
        }
        return p;
    }
}  
