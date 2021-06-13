package com.javabill0cypher.patterns.templatemethod;

import java.nio.charset.StandardCharsets;

public abstract class Network {
    String username;
    String password;

    public Network() {
    }

    public boolean post(String message) {
        if (login(username, password)) {
            boolean res = sendData(message.getBytes(StandardCharsets.UTF_8));
            logout();
            return res;
        }
        return false;
    }

    abstract boolean login(String username, String password);
    abstract boolean sendData(byte[] data);
    abstract void logout();
}
