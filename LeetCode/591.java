private static int arratPairSum(int[] nums) {
        int MaxSum=0;
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i+=2){
            MaxSum+=nums[i];
        }
        return MaxSum;
    }
