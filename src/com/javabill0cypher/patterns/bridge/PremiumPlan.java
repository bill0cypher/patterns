package com.javabill0cypher.patterns.bridge;

public class PremiumPlan extends StandardPlan {
    public PremiumPlan(Card card) {
        super(card);
    }

    public void withdrawForRegularPayments() {
        if (card.regularsEnabled()) {
            System.out.println("Calculating...");
            card.withdrawMoney(500);
            System.out.println("Regulars payed.");
        } else {
            System.out.println("Payment rejected. Check if regular payments function is enabled");
        }
    }

    public void chargeDepositBalance(int sum) {
        System.out.println("New $ deposit added");
        if (card.depositEnabled())
            card.chargeDeposit(sum);
        else
            System.out.println("Check if you have deposit");
    }
}
