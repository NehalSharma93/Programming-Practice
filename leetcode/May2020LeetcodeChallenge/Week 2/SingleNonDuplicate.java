class SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        int N = nums.length;
        if(N == 1)
            return nums[0];
        
        int left = 0;
        int right = N - 1;
        int mid;
        
        while(left < right){
            mid = left + ((right  - left) >> 1);
            if(nums[mid] == nums[mid + 1]){
                // from index mid to (N - 1) - if even then check left interval
                if(mid%2 == 1)
                    right = mid - 1;
                else
                    left = mid + 1;
            }else if(nums[mid] == nums[mid - 1]){
                // from index (mid - 1) to (N - 1) - if even then check left interval
                if(mid%2 == 0)
                    right = mid - 2;
                else
                    left = mid + 1;
            }else
                return nums[mid];
        }
        
        return nums[left];
    }
}