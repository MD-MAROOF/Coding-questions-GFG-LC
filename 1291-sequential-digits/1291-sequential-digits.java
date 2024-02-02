class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> arr = new ArrayList<>();
        
        for(int i=1;i<=9;i++)
        {
            int num = i;
            int next_digit = i+1;
            
            while(num <= high && next_digit <= 9){
                num = num * 10 + next_digit;
                
                if(low <= num && num <= high)
                    arr.add(num);
                
                next_digit++;
            }
        }
        
        Collections.sort(arr);
        
        return arr;
        
    }
}