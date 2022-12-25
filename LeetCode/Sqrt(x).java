// Problem Link : https://leetcode.com/problems/sqrtx

// We can consider (√x-√x)^2  = 0.
// Replacing one of the √x‘s with y, then the equation becomes (y-√x)^2 => y^2 – 2y√x + x = 0
// => √x = (y^2 + x) / 2y
// => √x = (y + x/y) / 2    We will use this formula.

// In the above equation, we are considering √x as z.
// So, to get a required decimal value we can compare the difference of y and z to 10^(-p) 
// (to get the result upto 5 decimal digits, compare y-z to 10-5=0.00001). Until y-z exceeds it, the iteration continues.

// As we want upto 0 decimal places, we will iterate till 1, as iterating till 0 results in infinite loop.

class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
 
        double y = x;
        double z = (y + (x / y)) / 2;
    
        while (Math.abs(y - z) >= 1) {  // We considered z = √x, and y = z in formula, we need to repeate the formula till the absolute difference is one.  
            y = z;                      // as we iterated the formula once before the loop. 
            z = (y + (x / y)) / 2;
        }
        return (int)Math.floor(z);
    }
}

// Credits : GFG (Geeks for Geeks)
