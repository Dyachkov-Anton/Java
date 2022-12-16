/*
 * Создать структуру для хранения Номеров паспортов и 
 * Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
 */

package Seminar_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class case_1 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(123456, "Иванов");
        db.putIfAbsent(321456, "Васильев");
        db.putIfAbsent(234561, "Петрова");
        db.putIfAbsent(234432, "Иванов");
        db.putIfAbsent(654321, "Петрова");
        db.putIfAbsent(345678, "Иванов");
        
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите фамилию: ");
        String str = iScanner.nextLine();
        iScanner.close();

    for (Integer numPass : db.keySet()) {
        if (Objects.equals(db.get(numPass).toLowerCase(), str.toLowerCase())){
        System.out.printf("Паспорт %d фамилия %s\n", numPass, db.get(numPass));
        }
        }
    }
}