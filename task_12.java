// Задача №12.*+Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

import java.util.*;

class task_12 {

    public static void main(String[] argh) {
        boolean flag = true;
        String str = "[6+(1*3)]";     
        int l = str.length();
        flag = true;
        Stack<String> st = new Stack<String>();
        for (int i = 0; i < l; i++) {
            String test = str.substring(i, i + 1);
            if (test.equals("(")) {
                st.push(test);
            } else if (test.equals("{")) {
                st.push(test);
            } else if (test.equals("[")) {
                st.push(test);
            } else if (test.equals(")")) {
                if (st.empty()) {
                    flag = false;
                    break;
                }
                if (st.peek().equals("(")) {
                    st.pop();
                } else {
                    flag = false;
                    break;
                }
            } else if (test.equals("}")) {
                if (st.empty()) {
                    flag = false;
                    break;
                }
                if (st.peek().equals("{")) {
                    st.pop();
                } else {
                    flag = false;
                    break;
                }
            } else if (test.equals("]")) {
                if (st.empty()) {
                    flag = false;
                    break;
                }
                if (st.peek().equals("[")) {
                    st.pop();
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if (flag && st.empty())
            System.out.println("true");
        else
            System.out.println("false");
    }
}
