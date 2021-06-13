package com.javabill0cypher.patterns.state;

public class BlockedState extends DeviceState {
    public BlockedState(Device device) {
        super(device);
        device.setState(State.BLOCKED);
    }

    @Override
    public void onVolumeUp() {
        System.out.println("VOLUME: +5%");
        device.setVolume(device.getVolume() + 5);
    }

    @Override
    public void onVolumeDown() {
        System.out.println("VOLUME: -5%");
        device.setVolume(device.getVolume() - 5);
    }

    @Override
    public void onBlockPressed() {
        System.out.println("Enter your password or use fingerprint");
        device.setState(State.UNBLOCKED);
    }

    @Override
    public void onDoubleTap() {
        System.out.println("Enable camera");
    }
}
