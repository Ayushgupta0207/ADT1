package main1;

import friend.Friend;
import linkedlist.FriendList;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        var addRandomClassObject = new Random();
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        float money = addRandomClassObject.nextFloat() * 10000;
        Friend friend = new Friend(name, money);
        FriendList friendList = new FriendList();
        friendList.addfriends(friend);
        if (money <= 0) {
            friendList.removefriend(friend);
        }
        friendList.sortfriends(friend);

        System.out.println(friend.toString());
    }
}
