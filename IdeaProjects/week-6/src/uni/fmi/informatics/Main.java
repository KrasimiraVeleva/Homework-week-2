package uni.fmi.informatics;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Въведете колко на брой числа искате да въвеждате: ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        Scanner in = new Scanner(System.in);
        int[] array = new int[arrayLength];

        System.out.println("Въведете вашите числа: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < 0 || array[i] > 10000) {
                System.out.println("Невалидно число! ");
            }
        }

        Menu();
        System.out.println();
        Menu2();
        System.out.println();

        System.out.println("Изберете опция:");
        Scanner Scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        while (option !=7) {
            if (option == 1) {
                primeNum(array);
            } else if (option == 2) {
                getMostPopularElement(array);
            } else if (option == 3) {
                maxSequenceMaxElement(array);
            } else if (option == 4) {
                maxSequenceMinElement(array);
            } else if (option == 5) {
                maxSequenceSameElement(array);
            }
            break;
        }
        Menu();
        System.out.println();
        Menu3();
        System.out.println();

        String[] Array = new String[array.length];
        String ArrayLength = scanner.nextLine();
        for (int i = 0; i < array.length; i++ ) {
            Array[i] = scanner.nextLine();
            if (array[i] < 0 || array[i] > 20 ) {
                System.out.println("Празен списък! ");
            }
        }

        System.out.println("Изберете опция:");
        while (option !=5) {
            if (option == 1) {

            } else if (option == 2) {

            } else if (option == 3) {

            } else if (option == 4) {

            } if (option == 5) {
            }
            break;
        }



    }

    /**
     * Метод, изобразяващ главното меню с опции
     *
     * @author Красимира Велева
     */
    public static void Menu() {
        System.out.println("Главно меню с опции: ");
        System.out.println("1. Работа с числа. ");
        System.out.println("2. Работа с думи. ");
        System.out.println("3. Изход от програмата. ");
    }

    /**
     * Метод, изобразяващ подменюто с опции
     *
     * @author Красимира Велева
     */
    public static void Menu2() {
        System.out.println("Меню с опции: ");
        System.out.println("1. Извеждане само на простите числа от масива. ");
        System.out.println("2. Извеждане на най-често срещан елемент в масива. ");
        System.out.println("3. Извеждане на максимална редица от нарастващи елементи. ");
        System.out.println("4. Извеждане на максимална редица от намаляващи елементи. ");
        System.out.println("5. Извеждане на максимална редица от еднакви елементи в масива. ");
        System.out.println("6. Извеждане на последователност от числа от масива, които имат сума равна на число, генерирано на случаен принцип. ");
        System.out.println("7. Връщане назад към основното меню. ");
    }

    /**
     * Метод, който извежда само простите числа от масива
     *
     * @param array Масив, от който се взимат числата
     * @return      Елемент
     */
    public static int[] primeNum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;
            if (array[i] == 1)
                isPrime = false;
            else {
                for (int j = 2; j < array[i]; j++) {
                    if (array[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime)
            System.out.println(array[i] + " е просто число в масива.");
        }
        return array;
    }

    /**
     * Метод, който извежда най-често срещания елемент в масива
     *
     * @param array Масива, от който се взима числото
     */
    public static void getMostPopularElement(int[] array) {
        int max_count = 1, res = array[0];
        int curr_count = 1;
        int n = 0;

        for (int i = 1; i < n; i++) {
            if (array[i] == array[i - 1])
                curr_count++;
            else {
                if (curr_count > max_count) {
                    max_count = curr_count;
                    res = array[i - 1];
                }
                curr_count = 1;
            }
        }
        if (curr_count > max_count) {
            max_count = curr_count;
            res = array[n - 1];
        }
        System.out.println("Най-често срещания елемент е " + res + ".");
    }

    /**
     * Метод, който извежда максимална редица от нарастващи елементи
     *
     * @param array Масива, от който взимаме числата
     */
    public static void maxSequenceMaxElement(int[] array) {
        int low = 0;
        int high = 0;
            int max = array[low];
            int i;
            for (i = low; i <= low; i++) {
                if (array[i] > max)
                    max = array[i];
            }
          System.out.println("Максималната редица от нарастващи числа е: " + max + " " + array[i]++ + " " + array[i]++);
        }


    /**
     * Метод, който извежда максималната редица от намаляващи елементи
     *
      * @param array Масив, от който взимаме числата
     */
    public static void maxSequenceMinElement(int[] array) {
        int low = 0;
        int high = 0;
        int min = array[low];
        int i;
        for (i = low; i <= high; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Максималната редица от намаляващи елементи е " + min + " " + array[i]-- + " " + array[i]--);
    }

    /**
     * Метод, който извежда максималната редица от еднакви елементи
     *
     * @param array Масива, от който взимаме числата
     */
    public static void maxSequenceSameElement(int[] array ) {
        int n = 0;
        int max_count = 1, res = array[0];
        int curr_count = 1;
        for (int i = 1; i < max_count; i++) {
            if (array[i] == array[i - 1])
                curr_count++;
            else {
                if (curr_count > max_count) {
                    max_count = curr_count;
                    res = array[i - 1];
                }
                curr_count = 1;
            }
        }
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = array[n - 1];
        }
        System.out.println("Максималната редица от еднакви елементи е: " + res + " " + res++ + " " );
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }
    }

    public static void randomNum(int[] array ) {

    }

    /**
     * Метод, изобразяващ подменю с опции
     */
    public static void Menu3() {
        System.out.println("Меню с опции: ");
        System.out.println("1. Обърнете буквите на думите от масива наобратно и ги визуализирайте в конзолата. ");
        System.out.println("2. Изведете броя на повтарящите се символи за всяка една от думите в масива. ");
        System.out.println("3. Изведете броя на символите за всяка една от думите в масива. ");
        System.out.println("4. Изведете броя на повтарящите се думи от масива. ");
        System.out.println("5. Връщане назад към основното меню. ");
    }
    

}



