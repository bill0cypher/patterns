package com.javabill0cypher.patterns.observer;

public class NewsBot implements Bot{
    @Override
    public RoomSubject createBotRoom() {
        return new NewsRoom();
    }
}
