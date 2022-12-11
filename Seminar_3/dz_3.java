/*
//Задан целочисленный список ArrayList. Найти минимальное, 
максимальное и среднее из этого списка.
*/

package Seminar_3;

import java.util.ArrayList;

public class dz_3 {

    public static void main(String[] args) {
        ArrayList<Integer> list_num = new ArrayList<>();

        for (int i = 0; i < 10; i++) { 
            list_num.add(getRandomNumber());
        }
       
        for (Integer o : list_num) {
            System.out.printf("%d ", o);
        }
        System.out.println("\n");
        int sum = 0;

        for (int i = 0; i < list_num.size(); i++) {
            sum += list_num.get(i);
        }
        int average = sum / list_num.size();
        ArrayList<Integer> temp = list_num; 
        temp.sort(null);
        System.out.printf("Среднее значение элементов массива: %d ", average);
        System.out.println("\n");
        System.out.printf("Минимальное значение элементов массива: %d ", temp.get(0));
        System.out.println("\n");
        System.out.printf("Максимальное значение элементов массива: %d ", temp.get(list_num.size() - 1));
        System.out.println();
    }

    public static int getRandomNumber() { 
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }

}