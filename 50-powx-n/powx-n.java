class Solution {
    /**
     * Calculates x raised to the power n (x^n)
     * @param x the base number
     * @param n the exponent (can be negative)
     * @return the result of x^n
     */
    public double myPow(double x, int n) {
        // Handle positive and negative exponents separately
        // For negative n, calculate x^(-n) and return its reciprocal
        // Cast n to long to handle Integer.MIN_VALUE overflow when negating
        return n >= 0 ? quickPower(x, n) : 1.0 / quickPower(x, -(long) n);
    }

    /**
     * Fast exponentiation using binary exponentiation algorithm
     * Time complexity: O(log n)
     * @param base the base number to be raised to a power
     * @param exponent the non-negative exponent
     * @return the result of base^exponent
     */
    private double quickPower(double base, long exponent) {
        double result = 1.0;
      
        // Binary exponentiation: process exponent bit by bit
        while (exponent > 0) {
            // If current bit is 1, multiply result by current base
            if ((exponent & 1) == 1) {
                result = result * base;
            }
            // Square the base for the next bit position
            base = base * base;
            // Right shift to process the next bit
            exponent >>= 1;
        }
      
        return result;
    }
}
