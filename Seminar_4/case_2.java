package Seminar_4;

import java.util.*;


public class case_2 {

    public static void main(String[] args) {
    
        int[] arr = new int[10]; // обьявляем массив размером
        for (int index = 0; index < arr.length; index++) {
        arr[index] = getRandomNumber();
    }
    
    // Stack<Integer> stack = new Stack<>();
        Queue<Integer> stack = new LinkedList<>();
    
    
            for (int i = 0; i < arr.length; i++) {
        stack.add(arr[i]);
    
    }
    System.out.println(Arrays.toString(arr));
    //System.out.println(stack);
    for (int i = 0; i < arr.length; i++) {
    System.out.print(stack.remove());
    
    }
    
    
    
    
    }
    
    public static int getRandomNumber() { // генерирует случайное число
    double x = (Math.random() * 99);
    int num = (int) x;
    return num;
    }
}