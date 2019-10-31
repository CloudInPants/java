package ru.bstu.iitus.vt41.osipovDV;

import ru.bstu.iitus.vt41.osipovDV.products.Camera;
import ru.bstu.iitus.vt41.osipovDV.products.Cheese;
import ru.bstu.iitus.vt41.osipovDV.products.Milk;
import ru.bstu.iitus.vt41.osipovDV.products.Rubik;

public enum ProductType {
    Камера {
        public Product factoryMethod ( ) {
            return new Camera ();
        }
    },
    Сыр {
        public Product factoryMethod ( ) {
            return new Cheese ();
        }
    },
    Молочный {
        public Product factoryMethod ( ) {
            return new Milk ();
        }
    },
    КубикРубика {
        public Product factoryMethod ( ) {
            return new Rubik ();
        }
    },
    Техника {
        public Product factoryMethod ( ) {
            return new Camera ();
        }
    },
    Игрушка {
        public Product factoryMethod ( ) {
            return new Camera ();
        }
    },
    Телевизор {
        public Product factoryMethod ( ) {
            return new Camera ();
        }
    };

    public abstract Product factoryMethod ( );
}
