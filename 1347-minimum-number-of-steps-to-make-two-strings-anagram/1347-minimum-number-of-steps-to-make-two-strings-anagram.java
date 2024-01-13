class Solution {
    public int minSteps(String s, String t) {
      

        Map<Character, Integer> frequencyMap = new HashMap<>();

       
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

       
        for (char ch : t.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) - 1);
        }

       
        int steps = 0;
        for (int frequency : frequencyMap.values()) {
            steps += Math.abs(frequency);
        }

        return steps / 2; 
        
       
    }
}