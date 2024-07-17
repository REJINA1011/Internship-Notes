package com.f1soft.Task.DesignPatterns.Behavioral.Iterator.SocialGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile {
    String id;
    String name;
    //String type;

    Profile(String id,String name){
        this.id=id;
        this.name=name;
        listOfProfile.add(this);
    }
//    Profile(String id,String name,String type){
//        this.id=id;
//        this.name=name;
//        this.type=type;
//    }


    static List<Profile> listOfProfile= new ArrayList<>();

    HashMap<Profile,String> facebookFriends= new HashMap<>();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<Profile,String> getFacebookFriends() {
        return facebookFriends;
    }

    public void addFacebookFriends(Profile profile, String type) {
        for(Profile profile1: listOfProfile){
            if(profile1.getName().equalsIgnoreCase(profile.getName())){
                facebookFriends.put(profile,type);
                //System.out.println(facebookFriends);
            }
        }

    }
}
