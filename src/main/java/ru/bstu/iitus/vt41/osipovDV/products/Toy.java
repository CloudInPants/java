package ru.bstu.iitus.vt41.osipovDV.products;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.bstu.iitus.vt41.osipovDV.Product;
import ru.bstu.iitus.vt41.osipovDV.Utilities;

import java.util.Scanner;

@ToString
@Setter
@Getter
public class Toy extends Product {// класс Игрушка
    protected int cost;
    protected String name;

    public void init (Scanner scanner) {
        System.out.println ("Введите цену игрушки");
        cost = Utilities.readInt (scanner);
        System.out.println ("Введите наименование");
        name = scanner.next ();
    }

    public boolean canBuy (int xcost) {
        return cost <= xcost;
    }

}
