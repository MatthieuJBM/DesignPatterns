package social_networks;

import iterators.ProfileIterator;

// The collection interface must declare a factory method for producing iterators.
// You can declare several methods if there are different kinds of iteration
// available in your program.
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
