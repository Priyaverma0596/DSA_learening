class Solution {
    //t.c--O(n)  two different loop --n ,n 
    //S.C--O(n) took map to store n elements---n
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapofvalue=new HashMap<>();
        for(int index=0; index<nums.length;index++)
        {
            mapofvalue.put(nums[index],index);
        }
        for(int index=0; index<nums.length;index++)
        {
            int complement=target-nums[index];
            if (mapofvalue.containsKey(complement) && mapofvalue.get(complement) != index)
            {
                return new int[]{index,mapofvalue.get(complement)};
            }
        }
      return null;
    }
}