import java.io.File;

// The concrete publisher contains real business logic that's
// interesting for some subscribers. We could derive this class
// from the base publisher ([EventManager]), but that isn't always possible in
// real life because the concrete publisher might already be a
// subclass. In this case, you can patch the subscription logic
// in with composition, as we did here.
public class Editor {
    public EventManager eventManager;
    private File file;

    public Editor() {
        // It will add the elements to the map, where the arguments will be
        // the keys in the map and the values will be an empty ArrayList.
        this.eventManager = new EventManager("open", "save");
    }

    // Methods of business logic can notify subscribers about changes.
    public void openFile(String filePath) {
        this.file = new File(filePath);
        eventManager.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            eventManager.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}