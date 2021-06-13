package com.javabill0cypher.patterns.observer;

public class Participant implements RoomParticipant{
    private String name;

    public Participant(String name) {
        this.name = name;
    }

    @Override
    public void update(String post) {
        System.out.println("User " + name + " have got new message: " + post);
    }
}
