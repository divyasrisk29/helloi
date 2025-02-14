class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> Set = new HashSet<>();
        for(int i: nums){
            Set.add(i);
        }
        int var = 1;
        while(Set.contains(var)){
            var++;
        }
        return var;
    }
}
