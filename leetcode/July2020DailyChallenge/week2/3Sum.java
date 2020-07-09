package week2;

class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        if(nums.length < 3)
            return result;

        int i= 0;


        while(i < nums.length - 2){

            int j = i + 1;

            int k = nums.length - 1;

            if(i>0 && nums[i] == nums[i-1]){
                i++;
                continue;

            }

            while(j < k){

                if (nums[i] + nums[j] + nums[k] == 0){
                    List<Integer> last = null;
                    if (result.size() > 0){
                        last = result.get(result.size()-1);
                    }
                    //if the same value is already added, then no need to add it
                    if (last == null
                        || !last.get(0).equals(nums[i])
                        || !last.get(1).equals(nums[j])
                        || !last.get(2).equals(nums[k])){
                        List<Integer> zeroSum = new ArrayList<Integer>();
                        zeroSum.add(nums[i]);
                        zeroSum.add(nums[j]);
                        zeroSum.add(nums[k]);
                        result.add(zeroSum);
                    }
                    j++;
                    k--;
                }
                else if(nums[i] + nums[j] + nums[k] > 0)
                    k--;
                else
                    j++;
            }
            i++;
        }

        return result;
    }
}