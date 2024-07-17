package com.f1soft.Task.DesignPatterns.Creational.Builder;

import java.util.ArrayList;
import java.util.List;

//Step 1: Interface
interface Item{
    public String name ();
    public Packing packing();
    public float price();

}
interface Packing{
    public String pack();
}

//Step2: class that implements Packing

class Wrapper implements Packing{
    @Override
    public String pack() {
        return "Wrapper";
    }
}

class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}

//Step3: abstract classes that implements Item
abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

abstract class ColdDrinks implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

//Step 4:Extensions of Burger and ColdDrinks

class VegBurger extends Burger{
    @Override
    public float price() {
        return 90.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
class ChickenBurger extends Burger{
    @Override
    public float price() {
        return 150.0f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}

class Coke extends ColdDrinks{

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 80.0f;
    }
}
class Pepsi extends ColdDrinks{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 80.0f;
    }
}

class Meal{
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost= 0.0f;
        for(Item item:items){
            cost+=item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item:items){
            System.out.print("\nItem Name: "+item.name());
            System.out.print("\tItem Packaging: "+item.packing().pack());
            System.out.print("\tItem Price: "+item.price());
        }
    }
}

class MealBuilder{
    public Meal vegMealBuilder(){
        Meal meal= new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal nonVegMealBuilder(){
        Meal meal=new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}

public class Builder {
    public static void main(String[] args){
        MealBuilder mealBuilder=new MealBuilder();

        Meal vegMeal= mealBuilder.vegMealBuilder();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.print("\nTotal cost: "+vegMeal.getCost());
    }
}
