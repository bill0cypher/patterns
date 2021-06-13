package com.javabill0cypher.patterns.bridge;

public interface Subscription {
    void payBill(int sum, String service);
    void takeLoan(int sum);
}
