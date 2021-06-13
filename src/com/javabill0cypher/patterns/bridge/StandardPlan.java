package com.javabill0cypher.patterns.bridge;

public class StandardPlan implements Subscription {
    protected Card card;

    public StandardPlan(Card card) {
        this.card = card;
    }

    @Override
    public void payBill(int sum, String service) {
        card.withdrawMoney(sum);
        System.out.println("Bill for " + service + "payed.");
    }

    @Override
    public void takeLoan(int sum) {
        card.setCreditBalance(sum);
    }
}
