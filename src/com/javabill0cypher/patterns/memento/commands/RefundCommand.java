package com.javabill0cypher.patterns.memento.commands;

public class RefundCommand implements Command{
    @Override
    public void execute() {
        this.refund();
    }

    private void refund() {

    }
}
