
/*
 * В консоли запросить имя пользователя. 
 * В зависимости от текущего времени, вывести приветствие вида 
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */
package Seminar_1;

import java.time.LocalDateTime; // Ипортируем возможность сверки времени
import java.util.Scanner; // импортируем возможность ввода в консоль
 
public class case_1a {
       
    public static void main(String[] args) {
        // Здесь производим ввод в консоль
        Scanner in = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = in.nextLine();
        // Здесь определяем время суток    
        int hour = LocalDateTime.now().getHour();
            // Вводим условия
            if (hour >= 5 && hour < 12) {
                System.out.printf("Доброе утро, %s!", name);
            }
            if (hour >= 12 && hour < 18) {
                System.out.printf("Добрый день, %s!", name);
            }
            if (hour >= 18 && hour < 23) {
                System.out.printf("Добрый вечер, %s!", name);
            }
            if (hour >= 23 && hour < 6) {
                System.out.printf("Доброй ночи, %s!", name);
            }

        System.out.println();
        in.close();
    }
}