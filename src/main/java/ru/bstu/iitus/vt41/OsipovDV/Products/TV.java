package ru.bstu.iitus.vt41.OsipovDV.Products;

import lombok.ToString;

import java.util.Scanner;

@ToString(callSuper = true)
public class TV extends Techincs {
    private int diag;

    public void init (Scanner scanner) {
        System.out.println ("Введите цену телевизора");
        cost = readInt (scanner);
        System.out.println ("Введите диагональ");
        diag = readInt (scanner);
        name = "Телевизор";
    }
}
