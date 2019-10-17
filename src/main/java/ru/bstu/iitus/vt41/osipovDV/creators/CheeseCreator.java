package ru.bstu.iitus.vt41.osipovDV.creators;

import ru.bstu.iitus.vt41.osipovDV.Creator;
import ru.bstu.iitus.vt41.osipovDV.Product;
import ru.bstu.iitus.vt41.osipovDV.products.Cheese;

public class CheeseCreator extends Creator {
    @Override
    public Product factoryMethod ( ) {
        return new Cheese ();
    }
}
