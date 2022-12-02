/*
 * 1. Вычислить сумму чисел от 1 до n,  n! 
 * (произведение чисел от 1 до n)
 */

package Seminar_1;

import java.util.Scanner;

public class dz_1 {
    
    public static void main(String[] args) { // тут определяем консольный ввод и вывод
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        System.out.printf("Сумма от 1 до числа n равна %s\n", sumNumbers(n));
        System.out.printf("Произведение от 1 до числа n равно %s", factorial(n));
        System.out.println();
        scanner.close();
    }

    public static int sumNumbers(int n) { // тут определяем сумму числе от 1 до n
        int summa = 0;
        for (int i = 1; i <= n; i++) {
            summa += i;
        }
        return summa;
    }    
    public static int factorial(int n) { // тут определяем сумму чисел от 1 до n!
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }    
}