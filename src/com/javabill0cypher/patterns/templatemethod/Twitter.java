package com.javabill0cypher.patterns.templatemethod;

public class Twitter extends Network{

    public Twitter(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    boolean login(String username, String password) {
        simulateNetworkLatency();
        System.out.println("User: " + username + " is online");
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: " + new String(data) + "was posted on Twitter");
        }
        return false;
    }

    @Override
    void logout() {
        System.out.println("User " + username + "was logged out from Twitter");
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            while (i<10) {
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
