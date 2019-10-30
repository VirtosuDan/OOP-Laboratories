package com.company;

import java.util.Stack;

public class VerifyParanthesis {

    public static boolean balancedParenthesis(String input) {

        Stack<Character> stack = new Stack(); // an empty stack

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(input.charAt(i));
            }
            if (input.charAt(i) == ')' ) {
                if (stack.empty()) {
                    return false;
                }
                Character top = stack.pop();
                if ((top == '(' && input.charAt(i) != ')')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}