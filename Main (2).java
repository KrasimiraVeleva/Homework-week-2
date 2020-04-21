package uni.fmi.informatics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { MonthIfElse(); }

        public static void MonthIfElse() {

        Scanner scanner = new Scanner (System.in);
        int monthNumber = scanner.nextInt();

        if (monthNumber == 1) {
            System.out.println("31 дни");
        } else if (monthNumber == 2) {
            System.out.println("29 дни");
        } else if (monthNumber == 3) {
            System.out.println("31 дни");
        } else if (monthNumber == 4) {
            System.out.println("30 дни");
        } else if (monthNumber == 5) {
            System.out.println("31 дни");
        } else if (monthNumber == 6) {
            System.out.println("30 дни");
        } else if (monthNumber == 7) {
            System.out.println("31 дни");
        } else if (monthNumber == 8) {
            System.out.println("31 дни");
        } else if (monthNumber == 9) {
            System.out.println("30 дни");
        } else if (monthNumber == 10) {
            System.out.println("31 дни");
        } else if (monthNumber == 11) {
            System.out.println("30 дни");
        } else {
            System.out.println("31 дни");
        }

    }
}
