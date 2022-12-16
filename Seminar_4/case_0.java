/*
 * 1) Замерьте время, за которое в ArrayList добавятся 
 * 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 
10000 элементов. Сравните с предыдущим.
 */

package Seminar_4;
import java.util.LinkedList;
import java.util.ArrayList;

public class case_0 {
    
        public static void main(String[] args) {
            LinkedList<Integer> linkList = new LinkedList<Integer>();
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
            var s = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        System.out.println(System.currentTimeMillis() - s);
        
        var m = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
        linkList.add(i);
        }
        System.out.println(System.currentTimeMillis() - m);
        
        }
}