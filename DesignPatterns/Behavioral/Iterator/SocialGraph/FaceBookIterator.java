package com.f1soft.Task.DesignPatterns.Behavioral.Iterator.SocialGraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FaceBookIterator implements Iterator {
    Facebook facebook;
    Profile profile;
    String type;
    int currentPosition;
    Profile result;

    List<Profile> cache= new ArrayList<>();

    //FaceBookIterator faceBookIterator=new FaceBookIterator();

    FaceBookIterator() {

    }

    FaceBookIterator(Facebook facebook, Profile profile, String type){
        this.facebook=facebook;
        this.profile=profile;
        this.type=type;
    }
    @Override
    public Profile getNext() {
        if(hasMore()){
            result=cache.get(currentPosition);
            currentPosition++;
        }
        return result;
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return currentPosition<cache.size();
    }

    private void lazyInit(){
        if(cache.isEmpty()){
            if(type.equalsIgnoreCase("Friends"))
            {
                for(Map.Entry<Profile, String> friend: profile.getFacebookFriends().entrySet()){
                    if(friend.getValue().equalsIgnoreCase(type)){
                        cache.add(friend.getKey());
                    }
                }
            } else if (type.equalsIgnoreCase("coworker")) {
                for(Map.Entry<Profile, String> friend: profile.getFacebookFriends().entrySet()){
                    if(friend.getValue().equalsIgnoreCase(type)){
                        cache.add(friend.getKey());
                    }
                }
            }
        }
    }

    private void getCoworker() {
        for(Map.Entry<Profile, String> friend: profile.getFacebookFriends().entrySet()){
            if(friend.getValue().equalsIgnoreCase(type)){
                cache.add(friend.getKey());
            }
        }
    }

    private void getFriends(){

    }


}
