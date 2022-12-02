/*
2. Вывести все простые числа от 1 до 1000
 * 
 */

package Seminar_1;

public class dz_2 {
    public static void main(String[] args) {
        for (int x = 1; x < 1000; x++) {
            if (numbers(x) == true) {
                System.out.println(x);
            }
        }
    }

    public static Boolean numbers(int number) {  

        for (int x = 2; x <= Math.sqrt(number); x++) {
            if ((number == 1) || (number % x == 0)) {
                return false;
            }
        }
        return true;
    }
    
}
