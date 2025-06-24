package commands;

import editor.Editor;
/**
 * The copy command isn't saved to the history since it doesn't
 * change the editor's state.
 * */
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
