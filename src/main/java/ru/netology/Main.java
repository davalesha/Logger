package ru.netology;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        try {
            System.out.print("Введите размер списка: ");
            String input = scanner.nextLine();
            int n = Integer.parseInt(input);

            System.out.print("Введите верхнюю границу для значений: ");
            input = scanner.nextLine();
            int m = Integer.parseInt(input);

            logger.log("Создаём и наполняем список");
            List list = new ArrayList();
            while (list.size() < n) {
                Random random = new Random();
                list.add(random.nextInt(m));
            }
            System.out.println("Вот случайный список: " + list);
            logger.log("Просим пользователя ввести входные данные для фильтрации");

            System.out.print("Введите порог для фильтра: ");
            input = scanner.nextLine();
            int f = Integer.parseInt(input);

            logger.log("Запускаем фильтрацию: ");
            Filter filter = new Filter(f);

            List<Integer> result = filter.filterOut(list);

            logger.log("Выодим результат на экран: ");
            System.out.println("Отфильтрованный список: " + result);
            
        } catch (Exception ex) {
           logger.log(ex.getMessage() + " некоррекные данные");
        }
        finally {
            logger.log("Завершаем программу");
        }

    }
}
