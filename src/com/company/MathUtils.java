package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MathUtils {
    public static Double LaskeYhteen() {
        double a = 0.40;
        double b = 2.50;
        double c = 0.0023;
        double d = 10.11;
        Double yht = a + b + c + d;
        System.out.println(yht);
        return yht;
    }

    public static Double SuurinLuku() {
        ArrayList<Double> add = new ArrayList<Double>();
        double a = 0.760;
        double b = 5.50;
        double c = 0.0023;
        double d = 13.11;
        add.add(a);
        add.add(b);
        add.add(c);
        add.add(d);
        Double i = Collections.max(add);
        System.out.println(i);
        return i;
    }
    public static Double LaskeKeskiarvo(){
        ArrayList<Double> kesk = new ArrayList<Double>();
        double a = 0.760;
        double b = 5.50;
        double c = 0.0023;
        double d = 13.11;
        kesk.add(a);
        kesk.add(b);
        kesk.add(c);
        kesk.add(d);
        Double kokonaan = a + b + c + d;
        Double ka = kokonaan / kesk.size();
        System.out.println(ka);
        return ka;
    }
}
