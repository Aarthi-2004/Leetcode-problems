class Solution {
    public String truncateSentence(String s, int k) {
        String[] w = new String[k];
        String[] a = s.split(" ");
        for(int i=0;i<k;i++){
            w[i] = a[i];
         }
        return String.join(" ",w);
    }
}
