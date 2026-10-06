class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length-3;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int low=j+1;
                int high=nums.length-1;
                while(low<high){
                    long sum=(long)nums[i]+(long)nums[j]+(long)nums[low]+(long)nums[high];
                    if(sum==target){
                        List<Integer> templist = new ArrayList<>();
                        templist.add(nums[i]);
                        templist.add(nums[j]);
                        templist.add(nums[low]);
                        templist.add(nums[high]);
                        list.add(templist);
                        while (low < high && nums[low] == nums[low + 1]) {
                            low++;
                        }

                        while (low < high && nums[high] == nums[high - 1]) {
                            high--;
                        }

                        low++;
                        high--;
                    }
                    else if(sum>target){
                        high--;
                    }
                    else{
                        low++;
                    }
                }
            }
        }
        return list;
    }
}
