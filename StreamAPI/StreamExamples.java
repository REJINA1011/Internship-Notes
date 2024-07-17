package com.f1soft.Task.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamExamples {

    private void filterMethod(){
        List<Integer> array = Arrays.asList(2,5,6,7);

        //use of filter
        List<Integer> square= array.stream().filter(x->x%2==0).toList();

        System.out.println(square);
    }

    private void reduceMethod(){
        List<String> names= Arrays.asList("hello","world");

        Optional<String> concatenated = names.stream().sorted().reduce((a, b)->a+b);

        System.out.println(concatenated);
    }

    private void collectMethod(){
//        String result = Stream.of("apple", "banana", "cherry")
//                .collect(Collectors.joining(" "));
//
//        System.out.println(result);

        Set<String> set = Stream.of("apple", "banana", "cherry", "apple")
                .collect(Collectors.toSet());

        System.out.println(set);
    }

    private void mapMethod(){
        Map<String, Integer> ageOfPeople=Stream.of("ram","hari","sitaram","gopal").collect(Collectors.toMap(names->names, String::length));

        System.out.println(ageOfPeople);
    }


    public static void main(String[] args){
        StreamExamples streamExamples = new StreamExamples();

//        //use of filer
//        streamExamples.filterMethod();

        //use of reduce
        //streamExamples.reduceMethod();

        //use of collect
        //streamExamples.collectMethod();

        //use of map
        streamExamples.mapMethod();


    }
}
