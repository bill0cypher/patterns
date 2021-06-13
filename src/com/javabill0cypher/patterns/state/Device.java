package com.javabill0cypher.patterns.state;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Device {
    private Integer volume;
    private State state;
    private Map<StorageType, byte[]> storage = new HashMap<>(32);

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Map<StorageType, byte[]> getStorage() {
        return storage;
    }

    public void setStorage(Map<StorageType, byte[]> storage) {
        this.storage = storage;
    }
}
