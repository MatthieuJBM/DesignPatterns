package commands;

import java.util.Stack;

/**
 * The global command history is just a stack.
 * */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    /**
     * Last in...
     * */
    public void push(Command c) {
        history.push(c);
    }

    /**
     * ...first out
     * */
    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}
