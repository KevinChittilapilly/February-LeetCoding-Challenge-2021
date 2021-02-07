/** 
 Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the shortest distance from s[i] to the character c in s.

Example 1:

Input: s = "loveleetcode", c = "e"
Output: [3,2,1,0,1,0,0,1,2,2,1,0] */

class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                arr.add(i);
            }
        }
        int [] final_ans=new int[s.length()];
        int start=-1,end=0;
        for(int i=0;i<s.length();i++){
            if(arr.get(end)!=i && start==-1){
                final_ans[i]=arr.get(end)-i;
            }
            else if(arr.get(end)==i){
                if(start!=arr.size()-1)start++;
                if(start!=arr.size()-1)end++;
                final_ans[i]=0;
            }
            else if(arr.get(end)!=i && start!=-1){
                //int temp=Math.min(arr.get(end)-i,)
                int x=Math.abs(arr.get(end)-i);
                int y=Math.abs(arr.get(start)-i);
                final_ans[i]=Math.min(x,y);
            }
        }
        return final_ans;
    }
}