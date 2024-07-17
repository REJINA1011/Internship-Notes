package com.f1soft.Task.DesignPatterns.Creational.AbstractFactory.FurnitureFactory;

/*
* abstract factory pattern is used when a single factory produces multiple products. If we create factory pattern
* for that condition, it will violate open-close principle of SOLID. So abstract factory suggest creating interfaces
* for distinct product(here it is Chair interface) and it is implemented by its varients(ArtDecChair...).Also
* it creates an abstract factory(here it is FurnitureFactory) who is responsible to create the object for the
* distinct factories who extends the abstract factory class.
* */

//concrete classes
class ArtDecChair implements Chair{
    boolean b;
    @Override
    public void haslegs(boolean legs) {
        this.b=legs;
        //return legs;
    }
    public void showMessage(){
        System.out.println("ArtDec Chair has legs:"+b);
    }
    // public boolean sitOn(boolean sit);
}
class ArtDecSofa implements Sofa{
    int size;
    @Override
    public void width(int size) {
        this.size=size;
        //return legs;
    }
    @Override
    public void showMessage(){
        System.out.println("ArtDec Sofa has size:"+size);
    }
    // public boolean sitOn(boolean sit);
}

class VictorianChair implements Chair {
    boolean b;
    @Override
    public void haslegs(boolean legs){
        this.b=legs;
        //return legs;
        }

    public void showMessage(){
        System.out.println("Victorian Chair has legs:"+b);
    }
    //public boolean sitOn(boolean sit);
}
class ModernChair implements Chair {
    boolean b;
    @Override
    public void haslegs(boolean legs){
        this.b=legs;
        //return legs;
        }
    public void showMessage(){
        System.out.println("Modern Chair has legs:"+b);
    }
    //public boolean sitOn(boolean sit);
}



//distinct factories that is responsible to be created by the abstract factoryf
class VictorianFurnitureFactory extends FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return null;
    }
}
class ModernFurnitureFactory extends FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return null;
    }
}
class ArtDecFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecSofa();
    }
}

public class AbstractFactory {
    public static void main(String[] args){

        FurnitureFactory furnitureFactory= new VictorianFurnitureFactory();

        Chair chairVic=furnitureFactory.createChair();

        chairVic.haslegs(true);

        chairVic.showMessage();

        //ArtDecChair
        FurnitureFactory furnitureFactory1= new ArtDecFurnitureFactory();

        Chair chairArt =furnitureFactory1.createChair();

        chairArt.haslegs(true);
        chairArt.showMessage();

        //ArtDecSofa
        Sofa sofaArt =furnitureFactory1.createSofa();

        sofaArt.width(20);
        sofaArt.showMessage();

    }

}