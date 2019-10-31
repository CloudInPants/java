package ru.bstu.iitus.vt41.osipovDV.products;

import lombok.ToString;
import ru.bstu.iitus.vt41.osipovDV.Utilities;

import java.util.Scanner;

@ToString(callSuper = true)
public class TV extends Technics {
    private int diag;

    public void init (Scanner scanner) {
        System.out.println ("Введите цену телевизора");
        cost = Utilities.readInt (scanner);
        System.out.println ("Введите диагональ");
        diag = Utilities.readInt (scanner);
        name = "Телевизор";
    }
}
