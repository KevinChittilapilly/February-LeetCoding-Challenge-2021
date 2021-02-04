/**
    Longest Harmonious Subsequence
    We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.

Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.

A subsequence of array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

 

Example 1:

Input: nums = [1,3,2,2,5,2,3,7]
Output: 5
Explanation: The longest harmonious subsequence is [3,2,2,2,3].

 */


class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> h=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i],h.get(nums[i])+1);
            }
            else{
                h.put(nums[i],1);
                arr.add(nums[i]);
            }
        }
        int j=0,max_len=0,curr_len=0;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)-arr.get(j)==1){
                curr_len=h.get(arr.get(i))+h.get(arr.get(j));
                if(curr_len>max_len){
                    max_len=curr_len;
                }
            }
            j++;
        }
        return max_len;
        
    }
}