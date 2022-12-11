package Seminar_3;
/*
 * Пусть дан произвольный список целых чисел, 
 * удалить из него четные числа
 */
import java.util.ArrayList;
import java.util.Iterator;

public class dz_2 {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(getRandomNumber());
        }
     
        System.out.println("Список  до сортировки: \n");
        for (Integer o : list) {
            System.out.printf(" %d ", o);
        }

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("\n");
        System.out.println("Список без четных элементов: \n");

        for (Integer o : list) {
            System.out.printf(" %d ", o);
        }
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }

}