package com.f1soft.Task.DesignPatterns.Structural.Facade.MediaConverter;

public class Application {
    public static void main(String[] args){
        MediaConverter mediaConverter =new MediaConverter();

        mediaConverter.audioToVideoConverter("hello","200");
    }
}
