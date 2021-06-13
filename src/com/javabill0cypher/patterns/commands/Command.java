package com.javabill0cypher.patterns.commands;

public abstract class Command {
    protected Source source;
    private Command next;
    protected CommandHistory history = new CommandHistory();
    Command(Source source) {
        this.source = source;
    }

    public abstract boolean execute();
    public boolean executeNext() {
        return next == null || next.execute();
    }

    public Command linkWith(Command command) {
        next = command;
        return next;
    }

    public abstract String commandInfo();

    public void showHistory() {
        this.history.printHistory();
    }
}
