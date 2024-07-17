package com.f1soft.Task.DesignPatterns.Creational.Prototype;

abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    abstract void draw();

    public Object cloneObject(){
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
}
