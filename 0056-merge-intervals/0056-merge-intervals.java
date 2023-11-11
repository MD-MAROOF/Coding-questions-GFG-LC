class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length <= 1)
            return intervals;
        
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();
        
        int[] currentInterval = intervals[0];
        
        for(int i=1;i<intervals.length;i++)
        {
            int[] nextInterval = intervals[i];
            
            if(currentInterval[1] >= nextInterval[0]){
                //here there is an overlap so merge the intervals.
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            }
            
            else{
                //no overlap, add the current interval to the result and update currentInterval.
                result.add(currentInterval);
                currentInterval = nextInterval;
            }
        }
        //Adding the last interval
        result.add(currentInterval);
        
        return result.toArray(new int[result.size()][]);
    }
}