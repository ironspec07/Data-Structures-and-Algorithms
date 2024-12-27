class NumArray {
    int[] pf; 
    public NumArray(int[] nums) {
        int n = nums.length;
        pf = new int[n];
        pf[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + nums[i];
        }
    }
    public int sumRange(int left, int right) {
        int l = left;
            int r = right;
            if (l>0) {
                return (pf[r]-pf[l-1]);
            }
            else{
                return (pf[r]);
            }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */