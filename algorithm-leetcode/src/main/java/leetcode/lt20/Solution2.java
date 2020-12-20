package leetcode.lt20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution2 {
    public static boolean exec(String s){
        Map<Character,Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');

        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c =  s.charAt(i);
            if( c == '{' || c == '[' || c == '('){
                stack.push(map.get(c));
            }else {
                if(stack.isEmpty() || c != stack.pop() ){ return false;}

            }
        }
        if(!stack.isEmpty()) return false;

        return true;

    }
    public static void main(String args[]){
        Solution2.exec("()");
    }
}
