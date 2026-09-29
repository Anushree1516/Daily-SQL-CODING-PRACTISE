package StackCodes;

import java.util.Stack;

public class ValidParanthesis {

    public static boolean check(String para) {

        Stack<Character> st = new Stack<>();

        for (char c : para.toCharArray()) {

            if (c == '{' || c == '[' || c == '(') {

                st.push(c);

            } else {

                if (st.isEmpty()) {
                    return false;
                }

                char top = st.peek();

                if ((c == '}' && top == '{') ||
                        (c == ']' && top == '[') ||
                        (c == ')' && top == '(')) {

                    st.pop();

                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }


}