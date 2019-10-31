package ru.bstu.iitus.vt41.osipovDV;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class App {

    static final Logger mainDebugLogger = LogManager.getLogger ("ru.bstu.iitus.vt41.osipovDV.mainDebug");
    static final Logger exepLogger = LogManager.getLogger ("ru.bstu.iitus.vt41.osipovDV.mainExep");

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        ProductType productType;
        int N = 0;
        LinkedList<Product> productList = new LinkedList<Product> ();
        String tmp = "";
        if (mainDebugLogger.isDebugEnabled ()) {
            mainDebugLogger.debug ("Welcome to debug");
        }
        System.out.println ("Введите число товаров:");
        N = Utilities.readInt (sc);
        System.out.println ("Товары: " + Arrays.toString (ProductType.values ()));
        for (int i = 0; i < N; i++) {
            System.out.print ("Введите наименование товара\n");
            tmp = sc.next ();
            try {
                productType = ProductType.valueOf (tmp);
                productList.add (0, productType.factoryMethod ());
                productList.get (0).init (sc);
            } catch (RuntimeException e) {
                System.out.print ("Нет такого товара\n");
                exepLogger.error ("Нет товара с названием: " + tmp);
            }
        }
        sc.close ();
        if (productList.size () == 0) return;
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
