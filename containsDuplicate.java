class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for(int num:nums){
            if(!a.add(num)){
                return true;
            }
        }
        return false;
    }
}
