package caretaker;

import originator.DocumentMemento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<DocumentMemento> mementos;

    public History() {
        this.mementos = new ArrayList<>();
    }

    public void addMemento(DocumentMemento memento) {
        this.mementos.add(memento);
    }

    public DocumentMemento getMemento() {
        if (!mementos.isEmpty()) {
            return mementos.remove(mementos.size() - 1);
        }
        return null;
    }

    public DocumentMemento getMemento(int index) {
        if (index >= 0 && index < mementos.size()) {
            return this.mementos.get(index);
        }
        return null;
    }
}
