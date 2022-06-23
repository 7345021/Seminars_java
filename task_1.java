

// ЗАДАЧА №1 ВОЗВЕДЕНИЕ В СТЕПЕНЬ
//с вводом через консоль
// import java.util.Scanner;

// public class task_1 {

//     public static void main(String[] args) {
//         int a = 1;
//         int b = 1;
//         if (a == 0 & b == 0) {
//             System.out.printf("результат не определяется");
//         }
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("основание степени a: ");
//         a = iScanner.nextInt();
//         System.out.printf("показатель степени b: ");
//         b = iScanner.nextInt();
//         System.out.println((double) (Math.pow(a, b)));
//         iScanner.close();

//     }
// }


// без клавиатуры

// public class task_1 {

// public static void main(String[] args) {
// int a=0;
// int b=0;
// double c=(double)Math.pow(a, b);
// if (a==0&&b==0) {
//     System.out.println("Не определяется");
    
// }
// System.out.println(c);
// }
// }

// РЕШЕНИЕ НА УРОКЕ

// public class task_1 {
// public static void main(String[] args) {
//     int a=0;
//     int b=0;
//     System.out.println(Math.pow(a,b));
// }

// }

// public class task_1 {
//     public static void main(String[] args) {
//         int a = -2;
//         int b = 3;
//         double c = 1;

//         if (b > 0) {
//             for (int i = 0; i < b; i++) {
//                 c = c * a;
//             }
//         }
//         if (b < 0) {
//             double d = a;
//             for (int i = 0; i > b; i--) {
//                 c = c * (1 / d);

//             }
//         }

//         System.out.println(c);
//         if (a == 0 && b < 0) {
//             System.out.printf(" НЕ ОПРЕДЕЛЯЕТСЯ");
//         }
//     }

// }

// public class task_1 {

//     int a = 2;
//     int b = 3;

//     public static double powIter(int a, int b) {
//         if (a == 0 || a == 1)
//             return a;
//         if (b == 0)
//             return 1;

//         if (b < 0) {
//             b = -b;
//             a = 1 / a;
//         }
//         double res = 1;

//         while (b > 0) {
//             if (b % 2 == 1)
//                 res = res * a;
//             a = a * a;
//             b = b / 2;

//         }
//         return res;
//     }
// public class task_1{
// public static void main(String[] args) {
    

//     int a=2;
//     int b=-2;
//     System.out.println(powRecursion(a, b));
//     System.out.println(powIter(a, b));
// }
// public static double powRecursion(int a, int b){
//     if(b == 0) return 1;
    
//     if(b < 0) {
//     powRecursion(1/a, -b);
//     }
//     double res = powRecursion(a, b/2);
    
//     return b % 2 == 0 ? res * res : res * res * a;
//     }
    
//     public static double powIter(int a, int b) {
//     if (a == 0 || a == 1) return a;
//     if (b == 0) return 1;
    
//     if (b < 0) {
//     b = -b;
//     a = 1 / a;
//     }
    
//     double res = 1;
//     while (b > 0) {
//     if (b % 2 == 1)
//     res = res * a;
//     a = a * a;
//     b = b / 2;
//     }
//     return res;
//     }
// }