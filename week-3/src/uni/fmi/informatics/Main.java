package uni.fmi.informatics;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();

        if (item.equals("Wall")) {
            System.out.println("Go Sideway");
        } else if (item.equals("Chair")) {
            System.out.println("Jump");
        } else if (item.equals("Nothing")) {
            System.out.println("Forward");
        } else {
            System.out.println("Over");
        }

        int pixel = scanner.nextInt();

        if (pixel % 2 == 0) {
            System.out.println("Мишката е засечена");
        } else {
            System.out.println("Мишката не е засечена");
        }

        int hit = scanner.nextInt();

        if (hit == 4) {
            System.out.println("Няма повече батерия");
        } else if (hit > 4) {
            System.out.println("Може да направи още един удар");
        }

        Random rand = new Random();
        int rand_int = rand.nextInt(10);

        if (rand_int == 5) {
            System.out.println("Счупен мебел");
        } else {
            System.out.println("Мишката е убита");
        }

        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(1000);

        if (rand_int1 > rand_int2 ) {
            System.out.println("Имаме ток");
        } else if (rand_int2 > rand_int1 ) {
            System.out.println("Нямаме ток");
        }

        for (int i = 10; i > 0; i--){
            if (i%2 == 0) {
                System.out.println("I am a Robottttt");
            }
        }
    }
}

