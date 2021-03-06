/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/ 
//Answer1: 尝试数组第1——n-1个数与自己后面的数相加的和是否满足，O(n)为n^2
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}

//Answer2: 只进行一次遍历，将遍过的数据放入HashMap中做为key存储。用目标数减当前数，看是否存在于hashmap中。
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(); //map的声明
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) { //contaisKey
                result[0] = map.get(target - nums[i]);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}




