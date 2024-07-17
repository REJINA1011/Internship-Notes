package com.f1soft.Task.DesignPatterns.Behavioral.Iterator.SocialGraph;
public interface SocialNetwork {
    public Iterator createFriendsIterator(Profile profileRepository);
    public Iterator createCoworkerIterator(Profile profileRepository);
}

