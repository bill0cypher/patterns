package com.javabill0cypher.patterns.commands;

import java.util.Date;
import java.util.Optional;

public class WriteCommand extends Command{

    private String result;

    public WriteCommand(Source source, String write_it_to_file) {
        super(source);
        this.result = write_it_to_file;
    }

    @Override
    public boolean execute() {
        history.push(this);
        return result != null && source.writeData(result) && executeNext();
    }

    @Override
    public String commandInfo() {
        return "Thread num: " + Thread.currentThread().getName()
                + "\n Object: " + this.getClass().getName() + "\n Start time: " + new Date();
    }
}
