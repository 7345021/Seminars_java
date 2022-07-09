// Задача №10. *Реализовать алгоритм перевода из инфиксной записи в 
// постфиксную для арифметического выражения. x ^ y / (5 * z) + 10=>x y ^ 5 z * / 10 +

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class task_10 {

    static int precedence(Character ch) {

        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;

        }
        return -1;
    }

    static boolean associativityForEqualPrecedence(char ch1, char ch2) {

        List<Character> charList = Arrays.asList('+', '-', '*', '/');
        return charList.contains(ch1) || charList.contains(ch2);
    }

    private static String infixToPostfix(String exp) {

        if (exp == null || exp.isEmpty())
            return exp;
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < exp.length(); index++) {
            char ch = exp.charAt(index);
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty())
                    stack.pop();
                else { 
                    System.out.println("Не хватает скобки!!!");
                    return null;
                }
            } else if (!stack.isEmpty()) {
                if (precedence(ch) > precedence(stack.peek())) {
                    stack.push(ch);
                } else if (precedence(ch) < precedence(stack.peek())) {

                    while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                        result.append(stack.pop());
                    }
                    stack.push(ch);
                } else {

                    if (associativityForEqualPrecedence(ch, stack.peek())) {
                        result.append(stack.pop());
                    }
                    stack.push(ch);
                }
            } else if (stack.isEmpty() || stack.peek() == '(') {
                stack.push(ch);
            }
        }

        if (!stack.isEmpty() && stack.search('(') != -1) {
            System.out.println("Не хватает скобки!!!");
            return null;
        }
        if (!stack.isEmpty()) { 
            while (!stack.isEmpty()) {
                result.append(stack.pop());
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        String[] exprArray = {
                
                "x^y/(5*z)+10"
        };

        for (int index = 0; index < exprArray.length; index++) {
            System.out.println("Инфиксное выражение: " + exprArray[index]);
            System.out.println("Постфиксное выражение: " + infixToPostfix(exprArray[index]));
        }
    }
}

