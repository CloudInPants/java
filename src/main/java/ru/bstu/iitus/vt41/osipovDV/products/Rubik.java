package ru.bstu.iitus.vt41.osipovDV.products;

import lombok.ToString;
import ru.bstu.iitus.vt41.osipovDV.Utilities;

import java.util.Scanner;

@ToString(callSuper = true)
public class Rubik extends Toy {// Класс Кубик-Рубик
    private int dim;

    public void init (Scanner scanner) {
        System.out.println ("Введите цену Кубика-Рубика");
        cost = Utilities.readInt (scanner);
        System.out.println ("Введите размерность");
        dim = Utilities.readInt (scanner);
        name = "Кубик-Рубика";
    }

}
