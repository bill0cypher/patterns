package com.javabill0cypher.patterns.observer;

public class MemesBot implements Bot{
    @Override
    public RoomSubject createBotRoom() {
        return new MemesRoom();
    }
}
