class Solution {
    public int numberOfBeams(String[] bank) {
        
    
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<bank.length;i++)
        {
            int num = numberofOnes(bank[i]);
            if(num != 0)
                list.add(num);
        }
        
        int sum = 0;
        for(int i=0;i<list.size()-1;i++)
        {
            int prod = list.get(i) * list.get(i+1);
            sum = sum + prod;
        }
        
        return sum;
        
    } 
        
        int numberofOnes(String str)
        {
            int count = 0;
            
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i) == '1'){
                    count++;
                }
            }
          //  System.out.println(count);
            
            return count;
        }
    
    
    
}