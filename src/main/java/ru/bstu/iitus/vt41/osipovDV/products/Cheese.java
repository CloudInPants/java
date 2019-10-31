package ru.bstu.iitus.vt41.osipovDV.products;

import lombok.ToString;
import ru.bstu.iitus.vt41.osipovDV.Utilities;

import java.util.Scanner;

@ToString(callSuper = true)
public class Cheese extends Milk {
    private int mass;

    public void init (Scanner scanner) {
        System.out.println ("Введите цену сыра");
        cost = Utilities.readInt (scanner);
        System.out.println ("Введите вес");
        mass = Utilities.readInt (scanner);
        name = "Камера";
    }

}

