package iterators;

import profile.Profile;
import social_networks.LinkedIn;

import java.util.ArrayList;
import java.util.List;

// The concrete iterator class.
public class LinkedInIterator implements ProfileIterator {

    // The iterator needs a reference to the collection that it traverses.
    private LinkedIn linkedIn;
    private String type;
    private String email;
    // An iterator object traverses the collection independently from other iterators.
    // Therefor it has to store the iteration state.
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public LinkedInIterator(LinkedIn linkedIn, String type, String email) {
        this.linkedIn = linkedIn;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> emails = linkedIn.requestRelatedContactsFromLinkedInAPI(this.email, this.type);
            for (String email : emails) {
                this.emails.add(email);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    // Each concrete iterator class has its own implementation of the common iterator interface.
    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }

        String email = emails.get(currentPosition);
        Profile profile = profiles.get(currentPosition);
        if (profile == null) {
            profile = linkedIn.requestContactInfoFromLinkedInAPI(email);
            profiles.set(currentPosition, profile);
        }
        currentPosition++;
        return profile;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
