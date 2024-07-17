package com.f1soft.Task.DesignPatterns.Structural.Adpater.MediaPlayer;

//Adapter Class
public class MediaAdapter implements MediaPlayer {

    public AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audiotype){
        if(audiotype.equalsIgnoreCase("vlc")){
            advanceMediaPlayer=new VlcPlayer();
        }

        if(audiotype.equalsIgnoreCase("mp4")){
            advanceMediaPlayer=new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer.playVLC(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer.playMP4(fileName);
        }
    }
}
