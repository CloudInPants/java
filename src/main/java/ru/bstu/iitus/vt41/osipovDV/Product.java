package ru.bstu.iitus.vt41.osipovDV;

import java.util.Scanner;

public abstract class Product {

    public abstract void init (Scanner scanner); // считывание параметров с консоли

    public abstract int getCost ( );// возвращает стоимость товара

    public abstract boolean canBuy (int xcost); // определяет, можно ли купить товар за имеющуюся // сумму
}

