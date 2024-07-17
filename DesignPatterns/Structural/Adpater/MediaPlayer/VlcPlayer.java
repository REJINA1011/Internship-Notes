package com.f1soft.Task.DesignPatterns.Structural.Adpater.MediaPlayer;

//concrete class
public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVLC(String filename) {

        System.out.println("VlcPlayer"+filename);
    }

    @Override
    public void playMP4(String filename) {

    }
}
