package org.example;

public interface MediaPlayerInterface {
    public void play(String audioType,String fileName);
}

class AudioPlayer implements MediaPlayerInterface {
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}


