package history;

import editor.Editor;

// info: The memento class stores the past state of the editor.
public class Memento {
    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    // info: At some point, a previous state of the editor can be restored using a memento object.
    public void restore() {
        editor.restore(backup);
    }
}
