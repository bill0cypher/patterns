package com.javabill0cypher.patterns.adapter;

import java.util.Arrays;

public class AudioAdapter implements AudioConverter{
    private Video video;

    public AudioAdapter(Video video) {
        this.video = video;
    }

    @Override
    public Audio extractAudio() {
        return convertToAudio();
    }

    private Audio convertToAudio() {
        Audio audio = new Audio();
        audio.setAudioBytes(Arrays.copyOf(video.getVideoStream(), video.getVideoStream().length / 2));
        return audio;
    }
}
