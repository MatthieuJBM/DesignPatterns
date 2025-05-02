import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// The base publisher class includes subscription management code and notification methods.
public class EventManager {
    Map<String, List<EventListener>> mapOfListeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            // It creates a new list of EventListeners that can be retrieved
            // in the map using the operation's key.
            this.mapOfListeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        // It retrieves the List of EventListeners using the map's key.
        List<EventListener> users = mapOfListeners.get(eventType);
        // It adds the listener to the list using reference.
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = mapOfListeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<EventListener> listenersOfSelectedEvent = mapOfListeners.get(eventType);
        for (EventListener listener : listenersOfSelectedEvent) {
            listener.update(eventType, file);
        }
    }
}