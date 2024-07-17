package com.f1soft.Task.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorExamples {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        System.out.println("Square of numbers from 1 to 5 ");

        UnaryOperator<Integer> sum = x -> x * x;

        for (Integer integer : lista) {
            System.out.println(sum.apply(integer));
        }
    }
}
