package com.f1soft.Task.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

class FunctionExample{
    void mapCities(){
        List<String> cities= new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Goa");
        cities.add("Pune");

        Function<String, String> getFirstCharFunction = city -> {
            return city;
        };//one arg and return type
        cities.stream().map(getFirstCharFunction)
                .forEach(System.out::println);
    }
}

class BiFunctionExample{
    void printMultiple(){
        List<Integer> firstList= new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);

        List<Integer> secondList= new ArrayList<>();
        secondList.add(1);
        secondList.add(2);
        secondList.add(3);
        secondList.add(4);

        BiFunction<Integer,Integer,Integer> multiple= (param1,param2)->{
            return param1 * param2;
        };//two args and return type

        for (Integer x:firstList){
            System.out.println("\nMultiple of "+x);
            for(Integer y:secondList)
                System.out.print(multiple.apply(x,y)+"\t");
        }
    }
}
public class FunctionInterfaceExample {
    public static void main(String[] args){
        FunctionExample functionEx= new FunctionExample();
        functionEx.mapCities();

        BiFunctionExample biFunctionExample = new BiFunctionExample();
        biFunctionExample.printMultiple();
    }
}
