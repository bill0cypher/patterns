package com.javabill0cypher.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsRoom implements RoomSubject {
    private List<RoomParticipant> participantList = new ArrayList<>();
    @Override
    public void invite(RoomParticipant participant) {
        participantList.add(participant);
    }

    @Override
    public void exclude(RoomParticipant participant) {
        participantList.remove(participant);
    }

    @Override
    public void share(String post) {
        participantList.forEach(participant -> participant.update(post));
    }
}
