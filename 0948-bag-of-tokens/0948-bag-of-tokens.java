class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        int i = 0,j=tokens.length-1;
        int score = 0, max = 0;
        
        Arrays.sort(tokens);
        
        while(i <= j)
        {
            if(power >= tokens[i]){
                power -= tokens[i];
                i++;
                score += 1;
            }
            
            else if(score > 0){
                score--;
            power += tokens[j];
            j--;
            }
            else
                break;
            
            max = Math.max(max,score);
        }
        
        return max;
    }
}