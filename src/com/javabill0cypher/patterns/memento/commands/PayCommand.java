package com.javabill0cypher.patterns.memento.commands;

import com.javabill0cypher.patterns.memento.model.Payment;

public class PayCommand implements Command{
    private Balance balance;
    private Payment payment;

    public PayCommand(Balance balance, Payment payment) {
        this.balance = balance;
        this.payment = payment;
    }

    @Override
    public void execute() {
        this.balance.setBalance(this.balance.getBalance() - payment.getSum());
    }
}
