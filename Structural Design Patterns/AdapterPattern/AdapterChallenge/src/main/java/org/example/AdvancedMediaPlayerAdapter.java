package org.example;

public class AdvancedMediaPlayerAdapter implements MediaPlayerInterface{
    AdvancedMediaPlayerInterface advancedMusicPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayerInterface myMediaPlayer){
        advancedMusicPlayer = myMediaPlayer;
    }
    @Override
    public void play(String audioType, String fileName) {
        advancedMusicPlayer.loadFilename(fileName);
        advancedMusicPlayer.listen();
    }
}
