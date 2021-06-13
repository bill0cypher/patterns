package com.javabill0cypher.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MemesRoom implements RoomSubject{
    private List<RoomParticipant> participants = new ArrayList<>();
    @Override
    public void invite(RoomParticipant participant) {
        participants.add(participant);
    }

    @Override
    public void exclude(RoomParticipant participant) {
        participants.remove(participant);
    }

    @Override
    public void share(String post) {
        participants.forEach(participant -> participant.update(post));
    }
}
