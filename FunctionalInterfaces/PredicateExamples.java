package com.f1soft.Task.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExamples {
    public static void main(String[] args){
        String name="Hello";

        Predicate<Character> characterFind=x->{
            return x.equals('e');
        };//takes an input and returns boolean value for the result(true/false)

        for(int i =0;i<name.length();i++){
            System.out.println(characterFind.test(name.charAt(i)));
        }
    }
}
