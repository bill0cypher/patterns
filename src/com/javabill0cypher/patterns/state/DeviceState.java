package com.javabill0cypher.patterns.state;

public abstract class DeviceState {

    Device device;
    public DeviceState(Device device) {
        this.device = device;
    }

    abstract void onVolumeUp();
    abstract void onVolumeDown();
    abstract void onBlockPressed();
    abstract void onDoubleTap();
}
