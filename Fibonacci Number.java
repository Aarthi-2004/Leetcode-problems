// Description:
// The task is to compute the Nth Fibonacci number, where the Fibonacci sequence is defined as:
// F(0) = 0, F(1) = 1, and F(n) = F(n-1) + F(n-2) for n > 1.

class Solution {
    public int fib(int N) {
        // Base cases: if N is 0 or 1, return the Fibonacci value directly
        if (N == 0) return 0;
        if (N == 1) return 1;

        // Initialize the first two Fibonacci numbers
        int a = 0;  // F(0)
        int b = 1;  // F(1)
        int sum = a + b;

        // Loop to compute the Fibonacci number for N
        while (N > 1) {
            sum = a + b;  // Sum the previous two numbers to get the next Fibonacci number
            a = b;  // Move to the next number in the sequence
            b = sum;  // Update the second number with the new sum

            N--;  // Decrease N as we move towards the final result
        }
        
        // Return the computed Fibonacci number
        return sum;
    }
}
