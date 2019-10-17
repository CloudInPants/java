package ru.bstu.iitus.vt41.osipovDV;


import ru.bstu.iitus.vt41.osipovDV.creators.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        Map<String, Creator> map = new HashMap<String, Creator> ();
        map.put ("Камера", new CameraCreator ());
        map.put ("Сыр", new CheeseCreator ());
        map.put ("Молочный", new MilkCreator ());
        map.put ("Кубик-Рубика", new RubikCreator ());
        map.put ("Техника", new TechincsCreator ());
        map.put ("Игрушка", new ToyCreator ());
        map.put ("Телевизор", new TVCreator ());
        int N = 0;
        ArrayList<Product> productList = new ArrayList<Product> ();
        String tmp;
        System.out.println ("Введите число товаров:");
        N = Product.readInt (sc);
        for (int i = 0; i < N; i++) {
            System.out.println ("Введите вид или наименование товара");
            tmp = sc.next ();
            if (map.containsKey (tmp)) {
                productList.add (0, map.get (tmp).factoryMethod ());
            } else {
                System.out.println ("Нет такого товара");
            }
            productList.get (0).init (sc);
        }
        sc.close ();
        if(productList.size ()==0) return;
        int indexMin = 0;
        int min = productList.get (0).getCost ();
        for (int i = 1; i < productList.size (); i++) {
            if (productList.get (i).getCost () < min) {
                indexMin = i;
                min = productList.get (i).getCost ();
            }
        }
        System.out.println ("Самый дешёвый товар\n" + productList.get (indexMin).toString ());
    }
}
