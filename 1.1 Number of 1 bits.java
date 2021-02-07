/** 191. Number of 1 Bits
Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).


 */

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if(n == 0)
            return 0;
        
        return 1 + hammingWeight(n & (n-1));
    }
}

/** Another Solution

return Integer.bitCount(n);
 */