package com.f1soft.Task.DesignPatterns.Behavioral.Iterator.SocialGraph;

public class Facebook implements SocialNetwork{

    //Facebook facebook=  facebook=new Facebook();

    //FaceBookIterator result;
    @Override
    public Iterator createFriendsIterator(Profile profile) {
        return new FaceBookIterator(this,profile,"friends");
    }

    @Override
    public Iterator createCoworkerIterator(Profile profile) {FaceBookIterator result = null;

        return new FaceBookIterator(this,profile,"coworker");
    }

}
