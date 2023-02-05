class Solution {
    public boolean isPowerOfFour(long n) {

        if(n == 1) return true;

        return isPower4(n, 4);
        
    }

    boolean isPower4(long n, long x){
        if(x == n ) return true;
        else if(x > n) return false;

        return isPower4(n, x*4);
    }
}