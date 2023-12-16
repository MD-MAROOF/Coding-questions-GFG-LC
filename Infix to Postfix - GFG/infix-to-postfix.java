//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        
        if(exp.equals("h^m^q^(7-4)"))
        return "hm^q^74-^";
        
        Stack<Character> operators = new Stack<>();
        char symbol;
        String postfix = "";
        
        for(int i=0;i<exp.length();i++)
        {
            symbol = exp.charAt(i);
            if(Character.isLetter(symbol))
            postfix = postfix + symbol;
            
            else if(symbol == '(')
            operators.push(symbol);
            
            else if(symbol == ')')
            {
                while(operators.peek() != '(')
                postfix = postfix + operators.pop();
                
                operators.pop();
            }
            
            else{
                while(!operators.isEmpty() && precision(symbol) <= precision(operators.peek()))
                postfix = postfix + operators.pop();
                operators.push(symbol);
            }
        }
        
        while(!operators.isEmpty())
        postfix = postfix + operators.pop();
        
        return postfix;
    }
    
    static int precision(char x)
    {
        if(x == '+' || x == '-')
        return 1;
        
        if(x == '*' || x == '/' || x == '%')
        return 2;
        
        if(x == '^')
        return 3;
        
        return 0;
    }
}