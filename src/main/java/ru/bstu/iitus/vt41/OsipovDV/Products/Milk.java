package ru.bstu.iitus.vt41.OsipovDV.Products;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.bstu.iitus.vt41.OsipovDV.Product;

import java.util.Scanner;

@ToString
@Getter
@Setter
public class Milk extends Product {
    protected int cost;
    protected String name;

    public void init (Scanner scanner) {
        System.out.println ("Введите цену молочного продукта");
        cost = readInt (scanner);
        System.out.println ("Введите наименование");
        name = scanner.next ();
    }

    public boolean canBuy (int xcost) {
        return cost <= xcost;
    }

}
