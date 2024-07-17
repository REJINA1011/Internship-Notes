package com.f1soft.Task.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;


class ConsumerFunction{


    void peopleName(){
        List <String> people=new ArrayList<>();
        people.add("Hari");
        people.add("Shyam");
        people.add("Sita");

        Consumer<String>person = System.out::println;// one args and no return type

        people.forEach(person);
    }

}

class BiConsumerFunction{
    //ConsumerFunctions

    void duplicateValues(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(1);
        lista.add(3);

        // Create the second list
        List<Integer> listb = new ArrayList<Integer>();
        listb.add(2);
        listb.add(1);
        listb.add(2);

        // BiConsumer to compare both lists
        BiConsumer<List<Integer>, List<Integer> >//two args and no return type
                equals = (list1, list2) ->
        {
                for (Integer listFirst:lista)
                    for(Integer listSecond:listb )
                        if (listFirst.equals(listSecond)) {
                            System.out.println("Same Elements"+ listFirst +" "+listSecond);
                        }else{
                            System.out.println("Different Elements"+ listFirst +" "+listSecond);

                        }
        };
        equals.accept(lista, listb);
    }

}

public class ConsumerInterfaceExamples{
    public static void main(String[] args) {
        System.out.println("\nConsumer Function Example");

        ConsumerFunction consumerFunction =new ConsumerFunction();
        consumerFunction.peopleName();

        System.out.println("\nBiConsumer Function Example");

        BiConsumerFunction biConsumerFunction= new BiConsumerFunction();
        biConsumerFunction.duplicateValues();
    }
}
