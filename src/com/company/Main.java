package com.company;

public class Main {

    public static void main(String[] args) {
        byte a;
        byte a1 = 88;
        byte a2 = 25;
        a = (byte) (a1 + a2);
        System.out.println("a : " + a);

        int b;
        int b1 = 5;
        int b2 = 534;
        b = b2 * b1;
        System.out.println("b : " + b);

        long d;
        long d1 = 35l;
        long d2 = 228;
        d = d1 - d2;
        System.out.println("d : " + d);

        float c;
        float c1 = 286f;
        float c2 = 81f;
        c = c1 / c2;
        System.out.println("c : " + c);

        double e;
        double e1 = 256;
        double e2 = 85;
        e = (e1 / e2) * (e1 / c1);
        System.out.println("e : " + e);

        short f;
        short f1 = 23;
        short f2 = 46;
        f = (short) (f1 + f2 + a1);
        System.out.println("f : " + f);
    }
}