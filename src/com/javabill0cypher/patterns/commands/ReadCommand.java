package com.javabill0cypher.patterns.commands;

import java.util.Date;
import java.util.Objects;

public class ReadCommand extends Command {
    private String result;
    public ReadCommand(Source source) {
        super(source);
    }

    @Override
    public boolean execute() {
        result = source.readData();
        history.push(this);
        formResult();
        return !Objects.isNull(result) && executeNext();
    }

    public void formResult() {
        System.out.println(result + "\n" + commandInfo());
    }

    @Override
    public String commandInfo() {
        return "Thread num: " + Thread.currentThread().getName() + "\n Object: " + this.getClass().getName() + "\n Start time: " + new Date();
    }
}
