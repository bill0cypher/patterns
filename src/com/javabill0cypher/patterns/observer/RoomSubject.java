package com.javabill0cypher.patterns.observer;

public interface RoomSubject {
    void invite(RoomParticipant participant);
    void exclude(RoomParticipant participant);
    void share(String post);
}
