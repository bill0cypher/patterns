package com.javabill0cypher.patterns.iterator.iterators;

import com.javabill0cypher.patterns.iterator.profile.Profile;
import com.javabill0cypher.patterns.iterator.social_networks.LinkedIn;

import java.util.ArrayList;
import java.util.List;

public class LinkedInIterator implements ProfileIterator{
    private LinkedIn linkedIn;
    private String email;
    private String type;
    private int currentPosition;
    private List<String> emails = new ArrayList<>();
    private List<Profile> contacts = new ArrayList<>();

    public LinkedInIterator(LinkedIn linkedIn, String email, String type) {
        this.linkedIn = linkedIn;
        this.email = email;
        this.type = type;
    }

    private void lazyLoad() {
        if (contacts.size() == 0) {
            List<String> contacts = linkedIn.requestProfileFromLinkedInAPI(email, type);
            for (String profileEmail: contacts) {
                emails.add(profileEmail);
                contacts.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < contacts.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) return null;
        String friendEmail = emails.get(currentPosition);
        Profile friendContact = contacts.get(currentPosition);
        if (friendContact == null) {
            friendContact = linkedIn.requestProfileFromLinkedIn(friendEmail);
            contacts.set(currentPosition, friendContact);
        }
        currentPosition++;
        return friendContact;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
