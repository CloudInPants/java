package ru.bstu.iitus.vt41.osipovDV.creators;

import ru.bstu.iitus.vt41.osipovDV.Creator;
import ru.bstu.iitus.vt41.osipovDV.Product;
import ru.bstu.iitus.vt41.osipovDV.products.Toy;

public class ToyCreator extends Creator {// класс Фабричный метод создания игрушки

    @Override
    public Product factoryMethod ( ) {
        return new Toy ();
    }
}
