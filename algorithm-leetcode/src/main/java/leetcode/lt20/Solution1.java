package leetcode.lt20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * kuo括号有效性
 * 通过栈
 */
public class Solution1 {
    public boolean isValid(String s) {
        Map<Character,Character> map =  new HashMap<>();

        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        Stack<Character> stack = new Stack<>();


     for(int i = 0 ;i <s.length();i++){
        if( '{' == s.charAt(i) ||'[' == s.charAt(i) ||'(' == s.charAt(i) ){
            stack.push(map.get(s.charAt(i)));
        }else{

            if( stack.empty()||stack.pop() != s.charAt(i) )
                return false;
        }

     }
     if(!stack.empty()){
         return false;
     }
        return true;
    }
}
