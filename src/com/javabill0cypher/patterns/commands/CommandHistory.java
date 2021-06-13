package com.javabill0cypher.patterns.commands;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandHistory {
    private Map<Integer, String> commandsExecuted = new HashMap<>();

    public void push(Command command) {
        commandsExecuted.put(command.hashCode(), command.commandInfo());
    }

    public boolean isEmpty() {
        return commandsExecuted.isEmpty();
    }

    public void printHistory() {
        this.commandsExecuted.forEach((integer, s) -> {
            System.out.println("Command hash #" + integer + ".\t\n Command info: \t\n" + s);
        });
    }
}
