package com.javabill0cypher.patterns.iterator.social_networks;

import com.javabill0cypher.patterns.iterator.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);
    ProfileIterator createCoworkersIterator(String profileEmail);
}
