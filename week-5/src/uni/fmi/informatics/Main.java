package uni.fmi.informatics;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static final int ELEMENT_NOT_FOUND = -1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете колко на брой числа ще въвеждате: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array [arrayLength] = scanner.nextInt();
        }

        Menu();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();

        Menu();



        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ",");
        }
        System.out.println();

        Menu();



        System.out.println("Въведете числото, чиято позиция искате да намерите");

        int elementToFind = scanner.nextInt();

        int foundElementIndex = binarySearch(array, elementToFind, 0, array.length - 1);

        if (foundElementIndex == ELEMENT_NOT_FOUND) {
            System.out.println("Елементът не е намерен!");
        } else {
            System.out.printf("Елементът е намерен на позиция: %d\n", foundElementIndex + 1);
        }

        Menu();

        random(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();

        Menu();

        findSum(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();

        Menu();

        maxNum(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();

        Menu();

        minNum(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();

        Menu();

        averageNum(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();

        Menu();

        symmetric(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();

        Menu();

        reverse(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();

        Menu();

        visualArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();

        System.out.println("Изпълнението на програмата проключи!");
    }

    /**
     * Метод, който изобразява менюто с опции
     *
     * @author Красимира Велева
     */

    public static void Menu() {

        System.out.println("Меню с опции: ");
        System.out.println("1. Сортиране на въведените числа във възходящ ред");
        System.out.println("2. Сортиране на въведените числа в низходящ ред");
        System.out.println("3. Търсене на позиция на конкретно число");
        System.out.println("4. Разбъркване на числата");
        System.out.println("5. Изчисляване на сбора на всички числа");
        System.out.println("6. Намиране на най-голямото число");
        System.out.println("7. Намиране на най-малкото число");
        System.out.println("8. Намиране средно-аритметично на числата");
        System.out.println("9. Проверка за симетричност на масива от числа");
        System.out.println("10. Обръщане на масива от числа");
        System.out.println("11. Визуализирай въведените числа");
        System.out.println("12. Изход");
    }

    /**
     * Масив, който се сортира, чрез метода на мехурчето
     *
     * @param array Масив, който трябва да бъде сортиран по възходящ ред
     * @return      Сортиран масив
     */

    public static int[] sortUp(int[] array) {
        int length = array.length;
        int element;

        for (int i = 0; i < length; i++) {

            for (int j = length - 1; j >= i; j--) {

                if (array[j - 1] > array[j]) {
                    element = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = element;
                }
            }
        }
        return array;
    }

    /**
     * Масив, който се сортира, чрез метода на мехурчето
     *
     * @param array Масив, който трябва да бъде сортиран по низходящ ред
     * @return      Сортиран масив
     */

    public static int[] sortDown(int[] array) {
        int length = array.length;
        int element;

        for (int i = 0; i < length; i++) {

            for (int j = length - 1; j >= 1; j--) {

                if (array[j - 1] < array[j]) {
                    element = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = element;
                }
            }
        }
        return array;
    }

    /**
     * Метод, реализиращ двойчно търсене в масив
     *
     * @param array      Масивът, който се сортира
     * @param element    Елементът, който търсим в масива
     * @param leftIndex  Краен ляв елемент на масива
     * @param rightIndex Краен десен елемент на масива
     * @return           Индексът на намерения елемент в масива
     */

    public static int binarySearch(int array[] , int element, int leftIndex, int rightIndex) {
        int left = leftIndex;
        int right = rightIndex;
        int middle = (left + right) / 2;

         while (left <= right) {
             if (element == array[middle]) {
                 return middle;
             } else if (element < array[middle]) {
                 right = middle -1;
             } else {
                 left = middle +1;
             }
             middle = (left + right) / 2;
         }
         return ELEMENT_NOT_FOUND;
    }

    /**
     * Метод, който разбърква числата в масива
     *
     * @param array Масивът, на който елементите са разбъркани
     */

    public static void random(int array[]) {
        int i = 1;
        for (i = 0; i < array.length; i++) {
            Random rand = new Random();
            array[i] = rand.nextInt(13);
        }
    }

    /**
     * Метод, който намира сбор
     *
     * @param array Масива, чийто сбор на елементите намираме
     */

    public static void findSum(int[] array) {
        int sum = 0;

         for (int i = 1; i <= array.length; i++ ) {
             sum += array[i];
         }
         System.out.println("Сборът на числата е" + sum);
    }

    /**
     * Метод, който намира най-голямото число в масива
     *
     * @param array Масив, чийто най-голям елемент намираме
     */

    public static void maxNum(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Най-голямото число в масива е:" + max);
    }

    /**
     * Метод, който намира най-малкото число в масива
     *
     * @param array Масив, чийто най-малък елемент намираме
     */

    public static void minNum(int[] array) {
       int min = array[0];

       for (int i = 0; i < array.length; i++) {
           if(array[i] < min) {
               min = array[i];
           }
       }
       System.out.println("Най-малкото число в масива е:" +  min);
    }

    /**
     * Метод, който изчислява средно-аритметичното на числата в масива
     *
     * @param array Масив, от който взимаме числата
     */
    public static void averageNum(int[] array) {
        int sum = 0;

        int average = sum / array.length;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Средно-аритметичното на числата в масива е:" +  average);
    }

    /**
     * Метод, който намира дали масивът от числа е симетричен
     *
     * @param array Масивът, от който взимаме числата
     */
    public static void symmetric(int[] array) {

        int i = 0;

        for (i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                System.out.println("Масивът не е симетричен");
            } else {
                System.out.println("Масивът е симетричен");
            }
        }
    }

    /**
     * Метод, който обръща масива от числа
     *
     * @param array Масивът, от който взимаме числата
     */
    public static void reverse(int[] array ) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    /**
     * Метод, визуализиращ въведените числа
     *
     * @param array Масив, от който взимаме числата
     */
    public static void visualArray(int[] array) {
        int i = 0;

        for (i = 0; i < array.length; i++){
            System.out.println(array[i] + ",");
        }
    }
}









