package StackCodes;

import java.util.Stack;

public class ReverseStringUsingStack {

    static String s = "Anushree";
    static Stack<Character> st = new Stack<>();

    public static void reverseString(){
        for(char c:s.toCharArray()){
            st.push(c);
        }
        System.out.println("reverseStringUisngStack");
        while(!st.isEmpty()){
            System.out.print(st.pop());
        }
    }
}

