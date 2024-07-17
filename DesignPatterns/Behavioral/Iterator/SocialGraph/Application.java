package com.f1soft.Task.DesignPatterns.Behavioral.Iterator.SocialGraph;

public class Application {
    public static void main(String[] args){
        Profile user1 = new Profile("rez1","Rejina");
        Profile user2 = new Profile("kri23","Kritagya");
        Profile user3 = new Profile("sudha45","Sudrshan");

        user1.addFacebookFriends(user2,"friends");
        user1.addFacebookFriends(user3,"Friends");

        Facebook facebook = new Facebook();
        Iterator iterator=facebook.createFriendsIterator(user1);

         while(iterator.hasMore()){
//             System.out.println(iterator.getNext());
             System.out.println("hello Friend"+iterator.getNext().getName());
         }
    }
}
