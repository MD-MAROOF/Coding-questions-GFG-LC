class Solution {
    public String firstPalindrome(String[] words) {
        
        for(int i=0;i<words.length;i++)
        {
            if(isPalindrome(words[i]))
                return words[i];
        }
        return "";
    }
    
    boolean isPalindrome(String str)
    {
        String temp = str;
        StringBuilder reversed = new StringBuilder(str).reverse();
        
        if(temp.equals(reversed.toString()))
            return true;
        
        return false;
    }
}