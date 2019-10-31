package ru.bstu.iitus.vt41.osipovDV.products;

import lombok.ToString;
import ru.bstu.iitus.vt41.osipovDV.Utilities;

import java.util.Scanner;

@ToString(callSuper = true)
public class Camera extends Technics {
    private int res;

    public void init (Scanner scanner) {
        System.out.println ("Введите цену камеры");
        cost = Utilities.readInt (scanner);
        System.out.println ("Введите разрешение камеры");
        res = Utilities.readInt (scanner);
        name = "Камера";
    }
}
