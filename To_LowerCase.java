class Solution {
    public String toLowerCase(String s) {
    final int diff = 'A'-'a';
      char[] ans = s.toCharArray();
     for (int i = 0; i < ans.length; ++i)
     if (ans[i] >= 'A' && ans[i] <= 'Z')
     ans[i] -= diff;
     return new String(ans);
        
    }
}
