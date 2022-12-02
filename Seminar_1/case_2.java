/*
 * Дан массив двоичных чисел, например [1,1,0,1,1,1], 
 * вывести максимальное количество подряд идущих 1.
 */

package Seminar_1;

public class case_2 {
    public static void main(String[] args) {
        
        int [] arr = new int [] {1,1,0,1,1,1,0};
        int count = 0;
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 1){
                count += 1;
                if (max < count) {
                max = count;
                }
            } else {
                count = 0;
            }
            
        }

    System.out.println(max);
    } 
}
    