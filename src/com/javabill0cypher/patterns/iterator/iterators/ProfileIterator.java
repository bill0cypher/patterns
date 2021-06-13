package com.javabill0cypher.patterns.iterator.iterators;

import com.javabill0cypher.patterns.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();
    Profile getNext();
    void reset();
}

