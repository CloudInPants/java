package ru.bstu.iitus.vt41.OsipovDV.Products;

import lombok.ToString;

import java.util.Scanner;

@ToString(callSuper = true)
public class Cheese extends Milk {
    private int mass;

    public void init (Scanner scanner) {
        System.out.println ("Введите цену сыра");
        cost = readInt (scanner);
        System.out.println ("Введите вес");
        mass = readInt (scanner);
        name = "Камера";
    }

}

