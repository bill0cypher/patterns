package com.javabill0cypher.patterns.memento;

import com.javabill0cypher.patterns.memento.commands.Command;

import java.util.*;

public class PaymentsHistory {
    private List<Pair> history = new ArrayList<>();
    private int virtualSize = 0;

    private class Pair {
        Command command;
        Memento memento;

        public Pair(Command command, Memento memento) {
            this.command = command;
            this.memento = memento;
        }
    }
    public void push(Command command, Memento memento) {
        if (virtualSize != history.size() && virtualSize > 0) {
            history = history.subList(0, virtualSize - 1);
        }
        this.history.add(new Pair(command, memento));
        this.virtualSize = this.history.size();
    }

    public boolean undo() {
        Pair pair = getUndo();
        if (Objects.isNull(pair)) return false;
        System.out.println("Undoing: " + pair.command.getClass().getSimpleName());
        pair.memento.restore();
        return true;
    }

    public boolean redo() {
        Pair pair = getRedo();
        if (Objects.isNull(pair)) return false;
        pair.memento.restore();
        pair.command.execute();
        return true;
    }

    private Pair getRedo() {
        if (virtualSize == history.size()) return null;
        virtualSize = Math.min(history.size(), virtualSize + 2);
        return history.get(virtualSize - 1);
    }

    private Pair getUndo() {
        if (virtualSize == 0 ) return null;
        virtualSize = Math.max(0, virtualSize - 2);
        return history.get(virtualSize);
    }

    @Override
    public String toString() {
        return "PaymentsHistory{" +
                "history=" + Arrays.toString(history.toArray()) +
                '}';
    }
}
