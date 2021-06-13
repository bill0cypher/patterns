package com.javabill0cypher.patterns.state;

public class UnblockedState extends DeviceState {
    public UnblockedState(Device device) {
        super(device);
        device.setState(State.UNBLOCKED);
    }

    @Override
    public void onVolumeUp() {
        System.out.println("VOLME: +5%");
        device.setVolume(device.getVolume() + 5);
    }

    @Override
    public void onVolumeDown() {
        System.out.println("VOLME: -5%");
        device.setVolume(device.getVolume() - 5);
    }

    @Override
    public void onBlockPressed() {
        System.out.println("Device blocked");
        device.setState(State.BLOCKED);
    }

    @Override
    public void onDoubleTap() {
        System.out.println("Screenshot had been taken");
        device.getStorage().put(StorageType.IMAGES, new byte[100]);
    }
}
