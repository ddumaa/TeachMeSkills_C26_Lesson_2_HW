package homework;

public class hw2 {
    public static void main(String[] args) {
//Задание 1
        int b = 2;
        int c = 8;
        int a = 4 * (b + c - 1) / 2;
        System.out.println(a);
//Задание 2
        int a2 = 58;
        int x2 = (a2 / 10) + (a2 % 10);
        System.out.println("Сумма чисел числа: " + a2 + " = " + x2);
//Задание 3
        int a3 = 248;
        int x3 = (a3 / 100) + ((a3 / 10) % 10) + (a3 % 10);
        System.out.println("Сумма чисел числа: " + a3 + " = " + x3);
//Задание 4
        double n = 75.934;
        System.out.println("Число: " + n + " Округлено до: " + Math.round(n));
//Задание 5
        int q = 55;
        int w = 24;
        System.out.println(q + " / " + w +" = " + q / w + " " + "Остаток: " + q % w);
//Задание *
        int a4 = 17;
        int b4 = 12;
        a4 = a4 + b4;
        b4 = a4 - b4;
        a4 = a4 - b4;
        System.out.println(a4 + " " + b4);
    }
}
