class Subsets {

    /*
	For List of size 3 thr are 2^3 - 1 possily subsets.
	These sets can be represented as
	000,
	001,
	010,
	.
	.
	.
	 111
	 iterate from i=0 to i=7 and pick the set bits as index for nums array.

*/

    public List<List<Integer>> subsets(int[] nums) {


        int x = nums.length;
        int totalSets = (1 << x) - 1;

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i = 0; i <= totalSets; i++){
            List<Integer> list = new ArrayList<Integer>();
            int j = 0;
            while(1 << j <= i){
                if((1<< j & i) > 0)
                    list.add(nums[j]);
                j++;
            }
            result.add(list);
        }
        return result;
    }
}