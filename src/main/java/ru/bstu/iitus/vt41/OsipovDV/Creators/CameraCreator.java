package ru.bstu.iitus.vt41.OsipovDV.Creators;

import ru.bstu.iitus.vt41.OsipovDV.Creator;
import ru.bstu.iitus.vt41.OsipovDV.Product;
import ru.bstu.iitus.vt41.OsipovDV.Products.Camera;

public class CameraCreator extends Creator {
    @Override
    public Product factoryMethod ( ) {
        return new Camera ();
    }
}
