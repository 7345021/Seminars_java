// Задача №3. Написать программу вычисления n-ого треугольного числа
//   T_{n}=T_{n-1}+n.
public class task_3 {

    public static String row(int n) {
        if (n == 1)
            return "1";

        else
            return row(n - 1) + " " + n;
    }

    public static String triangle(int a, int b) {
        if (a == b)
            return row(b);

        else
            return row(a) + "\n" + triangle(a + 1, b);

    }

    public static void main(String[] args) {
        System.out.println(triangle(1, 6));
    }

}