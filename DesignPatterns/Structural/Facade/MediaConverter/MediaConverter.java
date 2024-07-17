package com.f1soft.Task.DesignPatterns.Structural.Facade.MediaConverter;

public class MediaConverter {
    AudioFile audioFile;
    VideoFile videoFile;
    MediaConverter(){
        audioFile =new AudioFile();
        videoFile=new VideoFile();
    }

    public void audioToVideoConverter(String filename, String fileSize){

        System.out.println("Converting audio to video ");

        videoFile.videoData(filename,fileSize);

    }
}
