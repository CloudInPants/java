package ru.bstu.iitus.vt41.OsipovDV.Creators;

import ru.bstu.iitus.vt41.OsipovDV.Creator;
import ru.bstu.iitus.vt41.OsipovDV.Product;
import ru.bstu.iitus.vt41.OsipovDV.Products.TV;

public class TVCreator extends Creator {
    @Override
    public Product factoryMethod ( ) {
        return new TV ();
    }
}
