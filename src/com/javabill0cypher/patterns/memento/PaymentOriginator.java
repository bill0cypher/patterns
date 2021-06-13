package com.javabill0cypher.patterns.memento;

import com.javabill0cypher.patterns.memento.commands.Command;
import com.javabill0cypher.patterns.memento.model.Operation;
import com.javabill0cypher.patterns.memento.model.Payment;

public class PaymentOriginator implements Originator{
    private Payment payment;
    private PaymentsHistory history;

    public PaymentOriginator() {
        history = new PaymentsHistory();
    }

    @Override
    public Memento save() {
        return new PaymentMemento(this, payment);
    }

    public void setState(Operation operation) {
        this.payment = (Payment) operation;
    }

    public void execute(Command command) {
        this.history.push(command, this.save());
        command.execute();
    }

    public void refund() {
        this.history.undo();
    }

    public void refundPayback() {
        this.history.redo();
    }

    @Override
    public String toString() {
        return "PaymentOriginator{" +
                "payment=" + payment +
                ", history=" + history +
                '}';
    }
}
