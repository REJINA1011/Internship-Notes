package com.f1soft.Task.DesignPatterns.Structural.Adpater.MediaPlayer;

//concrete class
public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void playVLC(String filename) {

    }

    @Override
    public void playMP4(String filename) {
        System.out.println("MP4Player"+filename);
    }
}
