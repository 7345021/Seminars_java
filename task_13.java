

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
// import java.util.Iterator;
import java.util.Stack;

public class task_13 {
    static HashMap<String, Integer> priorityMap = new HashMap<>();
    static HashSet<String> operation = new HashSet<>();

    static {
        priorityMap.put("+", 1);
        priorityMap.put("-", 1);
        priorityMap.put("(", 3);
        priorityMap.put("*", 2);
        priorityMap.put("/", 2);

        operation.add("+");
        operation.add("-");
        operation.add("*");
        operation.add("/");
    }

    public static void main(String[] args) {
        System.out.println(postfixFrom("a + b * c"));
        // eval();
    }

    public static String postfixFrom(String infixForm) {
        Stack<String> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        String[] tokens = infixForm.split(" ");
        System.out.println(Arrays.toString(tokens));
        for (String string : tokens) {
            if ("(".equals(string)) {
                stack.push("(");
            } else if (")".equals(string)) {
                String removed = stack.pop();
                while (!removed.equals("(")) {
                    result.append(removed).append(" ");
                    removed = stack.pop();
                }
            } else if (!operation.contains(string)) {
                result.append(string);
                result.append(" ");
            } else {
                while (!stack.isEmpty() && priorityMap.get(stack.peek()) > priorityMap.get(string)) {
                    result.append(stack.pop()).append(" ");
                }
                stack.push(string);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }

        return result.toString().trim();
        // String[] tokens = infixForm.split("(-+*/)|(-+*/)");

    }

    public static int eval(String[] tokens) {
        int result = 0;
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }
        Stack<Integer> nums = new Stack<>();
        for (String token : tokens) {
            if (operation.contains(token)) {
                int second = nums.pop();
                int first = nums.pop();
                nums.add(perform(token, first, second));
                result = nums.peek();
            } else {
                nums.add(Integer.parseInt(token));
                
            }
           
        }
        return result;
        
    }

    public static int perform(String token, int first, int second) {
        int res=0;
        switch (token) {
            case "+":
                
                return res=first + second;
            case "-":
                
                return res=first - second;
            case "*":
                
                return res=first * second;
            case "/":
                
                return res=first / second;
            case "^":
                
                return res=first ^ second;
            default :
            break;
            // System.out.println(res);
            
        }
        return res;
    }
        
}