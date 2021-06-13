package com.javabill0cypher.patterns.iterator.social_networks;

import com.javabill0cypher.patterns.iterator.iterators.LinkedInIterator;
import com.javabill0cypher.patterns.iterator.iterators.ProfileIterator;
import com.javabill0cypher.patterns.iterator.profile.Profile;

import java.util.List;
import java.util.Objects;

public class LinkedIn implements SocialNetwork{
    private List<Profile> contacts;

    public LinkedIn(List<Profile> contacts) {
        this.contacts = contacts;
    }

    public Profile requestProfileFromLinkedIn(String profileEmail) {
        simulateNetworkLatency();
        return findProfile(profileEmail);
    }

    public List<String> requestProfileFromLinkedInAPI(String profileEmail, String contactType) {
        simulateNetworkLatency();
        Profile profile = findProfile(profileEmail);
        if (!Objects.isNull(profile)) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findProfile(String profileEmail) {
        return (Profile) contacts.stream().map(profile -> profile.getEmail().equals(profileEmail));
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new LinkedInIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new LinkedInIterator(this, "coworkers", profileEmail);
    }
}
