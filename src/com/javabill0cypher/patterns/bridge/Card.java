package com.javabill0cypher.patterns.bridge;

public interface Card {
    int getBalance();
    void chargeCard(int sum);
    void withdrawMoney(int sum);
    void setCreditBalance(int creditSum);
    void setDeposit(boolean enable);
    boolean depositEnabled();
    void chargeDeposit(int sum);
    void setRegularPayments(boolean enable);
    boolean regularsEnabled();
}
