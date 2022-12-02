/* Case # 1
Написать программу, которая запросит пользователя ввести 
<Имя> в консоли. Получит введенную строку и выведет в 
консоль сообщение “Привет, <Имя>!” 
 */

package Seminar_1;

import java.util.Scanner;
 
public class case_1 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = in.nextLine();
        
        System.out.printf("Hello, %s!", name);
        System.out.println();
        in.close();
    }
}