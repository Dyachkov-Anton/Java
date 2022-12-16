/*
 * 1.Реализуйте структуру телефонной книги с помощью HashMap, 
 * учитывая, что 1 человек может иметь несколько телефонов.
 */

package Seminar_5;
import java.util.HashMap;
import java.util.Map;

public class dz_1 {

    public static void main(String[] args) {

        Map<String, String> phone_boook = new HashMap<>();

        String[] listTelephone = {
                "Иван Иванов 111111111", "Дарья Сидорова 7777777777", "Василий Васильев 88888888", "Сергей Сергеев 99999999",
                "Сидор Сидоров 22222222", "Дарья Сид 001111111", "Вася Васильев 00078787877", "Серж Сергеев 2551515151",
                "Иван Иванов 3333333333", "Сидор Иванов 444444444", "Иван Иванов 3333333333",
                "Петр Ивановский 55555555","Петр Сидоров 666666666", "Петр Иванов 55555000555"};

        for (int i = 0; i < listTelephone.length; i++) {
            String[] parts = listTelephone[i].split(" ");
            String namу = (parts[0] + " " + parts[1]);
            if (phone_boook.containsKey(namу)) {
                phone_boook.put(namу, phone_boook.get(namу) + " " + parts[2]);
            } else {
                phone_boook.put(namу, parts[2]);
            }
        }
        phone_boook.forEach((k, v) -> {System.out.printf("%s: %s%n", k, v);});

    }

}