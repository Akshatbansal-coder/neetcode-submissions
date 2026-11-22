class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {

            if(nums[0]>0){
                return result;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int a = i + 1;
            int b = nums.length - 1;

            while (a < b) {
                long sum = nums[i] + nums[a] + nums[b];
                if (sum == 0) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[a]);
                    triplet.add(nums[b]);

                    result.add(triplet);

                    a++;
                   b--;
                   while(a<b && nums[a]==nums[a-1]){ a++;}
                   while(a<b && nums[b]==nums[b+1]){
                    b--;
                   }
                   
                }

                else if (sum < 0) {
                    a++;
                } else {
                    b--;
                }
            }
        }

        return result;
    }
}