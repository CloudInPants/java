package ru.bstu.iitus.vt41.osipovDV.products;

import lombok.ToString;

import java.util.Scanner;

@ToString(callSuper = true)
public class Rubik extends Toy {// Класс Кубик-Рубик
    private int dim;

    public void init (Scanner scanner) {
        System.out.println ("Введите цену Кубика-Рубика");
        cost = readInt (scanner);
        System.out.println ("Введите размерность");
        dim = readInt (scanner);
        name = "Кубик-Рубика";
    }

}
