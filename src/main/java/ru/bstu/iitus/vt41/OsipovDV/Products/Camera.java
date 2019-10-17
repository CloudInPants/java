package ru.bstu.iitus.vt41.OsipovDV.Products;

import lombok.ToString;

import java.util.Scanner;

@ToString(callSuper = true)
public class Camera extends Techincs {
    private int res;

    public void init (Scanner scanner) {
        System.out.println ("Введите цену камеры");
        cost = readInt (scanner);
        System.out.println ("Введите разрешение камеры");
        res = readInt (scanner);
        name="Камера";
    }
}
