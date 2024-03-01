class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        reverseArray(chars);
        
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '1') {
                char temp = chars[i];
                chars[i] = chars[chars.length - 1];
                chars[chars.length - 1] = temp;
                break;
            }
        }
        return new String(chars);
    }
    
    public static void reverseArray(char[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // Swap elements at start and end indices
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move indices towards the center
            start++;
            end--;
        }
    }
}
