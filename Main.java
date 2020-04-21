package uni.fmi.informatics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        regtagle();
    }

    public static void regtagle() {

        Scanner scanner = new Scanner (System.in);

        double a = 2;
        double b = 6;
        double p = 2 * (a + b);

        System.out.println("Обиколката на правоъгълника е: " + p);

        double s = a * b;

        System.out.println("Лицето на правоъгълника е: " + s);

    }

}


