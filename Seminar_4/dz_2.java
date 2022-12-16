package Seminar_4;
/* 
* Реализуйте очередь с помощью LinkedList со следующими 
 * методами:
- enqueue() - помещает элемент в конец очереди, 
- dequeue() - возвращает первый элемент из очереди и удаляет 
его, 
- first() - возвращает первый элемент из очереди, не удаляя. */

import java.util.LinkedList;

public class dz_2 {

    public static void main(String args[])

    {
        LinkedList<Integer> list_number = new LinkedList<>();

        for (int i = 0; i < 20; i++) { // размер списка 20
            list_number.add(getRandomNumber());

        }
        System.out.println("Список до сортировки:");
        System.out.println(list_number + "\n");
        System.out.println("Список после добавления элемента:");
        enqueue(list_number, 1000);                   
        System.out.println(list_number+ "\n");
        System.out.println("Возврат первого элемента из очереди и его удаление:");
        System.out.println(dequeue(list_number));     
        System.out.println(list_number+ "\n");
        System.out.println("Возврат первого элемента из очереди, не удаляем его:");
        System.out.println(first(list_number));         
        System.out.println(list_number);


    }

    public static int getRandomNumber() { 
        double x = (Math.random() * 99);
        int number = (int) x;
        return number;
    }

    public static void enqueue(LinkedList<Integer> list_n, Integer num) {

        list_n.add(num);}
        

     public static int dequeue(LinkedList<Integer> list_n) {

            return list_n.pop();}

            
    public static int first(LinkedList<Integer> list_n) {

            return list_n.peek();}        

    
}