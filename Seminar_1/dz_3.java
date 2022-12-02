/*
 * 3. Реализовать простой калькулятор + - / * 

 */

package Seminar_1;

import java.util.Scanner;

public class dz_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число А: ");
        double number_1 = in.nextDouble();
        
        System.out.print("Введите число Б: ");
        double number_2 = in.nextDouble();
        
        System.out.print("Введите оператор (-, +, /, *): ");
        char operator = in.next().charAt(0);
        
        if (operator == '+') {
            Double a = number_1 + number_2;
            System.out.printf("А + Б = " + a);
        }
        if (operator == '*') {
            Double b = number_1 * number_2;
            System.out.printf("А * Б = " + b);
        }
        if (operator == '/') {
            Double c = number_1 / number_2;
            System.out.printf("А / Б = " + c);
        }
        if (operator == '-') {
            Double d = number_1 - number_2;
            System.out.printf("А - Б = " + d);
        }
        else {
            System.out.println("Не правильно набран оператор!!!");
        }
        in.close();
        System.out.println();
    }
}