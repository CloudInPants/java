package ru.bstu.iitus.vt41.OsipovDV.Creators;

import ru.bstu.iitus.vt41.OsipovDV.Creator;
import ru.bstu.iitus.vt41.OsipovDV.Product;
import ru.bstu.iitus.vt41.OsipovDV.Products.Toy;

public class ToyCreator extends Creator {// класс Фабричный метод создания игрушки

    @Override
    public Product factoryMethod ( ) {
        return new Toy ();
    }
}
