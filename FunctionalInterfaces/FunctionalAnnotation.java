package com.f1soft.Task.FunctionalInterfaces;
@FunctionalInterface
interface Square
{
    int result(int x);
}
public class FunctionalAnnotation {
    public static void main(String[] args){
        int number=9;

        Square square=(int x)->x*x;

       System.out.println(square.result(number));

    }
}
