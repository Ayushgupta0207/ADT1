package linkedlist;

import friend.Friend;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

public class FriendList {
    LinkedList<Friend> friends = new LinkedList<>();

    public void addfriends(Friend friend) {
        friends.add(friend);
    }

    public void removefriend(Friend friend) {
        friends.remove(friend);
    }

    public void sortfriends(Friend friend) {
        Collections.sort(friends, (o1, o2) -> 0);

    }
    @Override
    public String toString() {
        return friends.toString();
    }
}

