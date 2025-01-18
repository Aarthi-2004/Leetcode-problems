class Solution {
    public String largestNumber(int[] nums) {
        List<String> vs = new ArrayList<>();
        
        // Convert integers to strings and add them to the list
        for (int v : nums) {
            vs.add(v + "");
        }
        
        // Sort the strings using a custom comparator
        vs.sort((a, b) -> (b + a).compareTo(a + b));
        
        // Edge case: if the largest number is "0", the entire number is "0"
        if ("0".equals(vs.get(0))) {
            return "0";
        }
        
        // Join the sorted strings to form the final result
        return String.join("", vs);
    }
}
