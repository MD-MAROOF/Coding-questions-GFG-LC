class Solution {
    public int[][] merge(int[][] intervals) {
        
          if (intervals.length <= 1) return intervals;
 
        // Sort the intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
 
        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];
 
        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];
 
            if (currentInterval[1] >= nextInterval[0]) {
                // There is an overlap, merge the intervals
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } else {
                // No overlap, add the current interval to the result and update currentInterval
                result.add(currentInterval);
                currentInterval = nextInterval;
            }
        }
 
        // Add the last interval
        result.add(currentInterval);
 
        return result.toArray(new int[result.size()][]);
    }
}

