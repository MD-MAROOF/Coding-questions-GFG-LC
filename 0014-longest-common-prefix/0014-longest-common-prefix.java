class Solution {
    public String longestCommonPrefix(String[] strs) {
 
     /*   The big brained concept here seems to be this:

If the array is sorted alphabetically then you can assume that the first element of the array and the last element of the array will have most different prefixes of all comparisons that could be made between strings in the array. If this is true, you only have to compare these two strings */
        
        //Understand the above commented lines carefully to understand the solution
        
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}