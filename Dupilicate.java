class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set< Integer> Set = new HashSet<>();
        for(int i: nums){
            Set.add(i);
        }
        if (nums.length == Set.size()){
            return false;
        }
        return true;
    }
}
    
