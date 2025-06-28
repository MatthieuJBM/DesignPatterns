package iterators;

import profile.Profile;

// The common interface for all iterators.
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();

    /*
    * We can add a couple of other methods, such as:
    * - fetching the previous element,
    * - tracking the current position,
    * - checking the end of the iteration,
    * - ...
    * */
}
