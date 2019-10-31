package ru.bstu.iitus.vt41.osipovDV;

import java.util.Scanner;

public interface Utilities {
    static int readInt (Scanner scanner) {
        while (!scanner.hasNextInt ()) {
            scanner.next ();
            System.out.println ("Введите число!!!");
        }
        return scanner.nextInt ();
    }
}
