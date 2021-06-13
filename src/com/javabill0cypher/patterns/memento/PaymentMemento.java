package com.javabill0cypher.patterns.memento;

import com.javabill0cypher.patterns.memento.model.Operation;

public class PaymentMemento implements Memento{
    private PaymentOriginator originator;
    private Operation operation;

    public PaymentMemento(PaymentOriginator originator, Operation operation) {
        this.originator = originator;
        this.operation = operation;
    }

    @Override
    public void restore() {
        this.originator.setState(operation);
    }
}
