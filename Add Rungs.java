/**
 * You are given a strictly increasing integer array rungs that represents the height of rungs on a ladder.
 * You are currently on the floor at height 0, and you want to reach the last rung.
 *
 * You are also given an integer dist. You can only climb to the next highest rung if the distance between 
 * where you are currently at (the floor or on a rung) and the next rung is at most dist. 
 * You are able to insert rungs at any positive integer height if a rung is not already there.
 *
 * Return the minimum number of rungs that must be added to the ladder in order for you to climb to the last rung.
 */

class Solution {
    public int addRungs(int[] rungs, int dist) {
        int ans = 0;   // Variable to count the number of additional rungs
        int prev = 0;  // The position of the last rung (starting at the ground)

        // Iterate through each rung in the array
        for (final int rung : rungs) {
            // Calculate the number of rungs needed between the previous position and the current rung
            ans += (rung - prev - 1) / dist;

            // Update `prev` to the current rung
            prev = rung;
        }
        return ans;  // Return the total number of rungs added
    }
}
