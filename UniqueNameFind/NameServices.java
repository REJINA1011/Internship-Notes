package com.f1soft.Task.UniqueNameFind;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class NameServices {

    List<NameList> names = new ArrayList<>();

    /*
        Tree set requires a comparator class to compare with. Here in the NameComaparator
        implements Comparator interface which provides the condition for comparing the list
        datas.

    */
    TreeSet <NameList> sortedNames= new TreeSet<>(new NameComparator());
    //HashSet<NameList> sortedNames= new HashSet<>();


    public void addNames(NameList nameList) {
       names.add(nameList);
       System.out.println(nameList.toString());
       //System.out.println(nameList.name());
       sortedNames.addAll(names);

    }

    public List<NameList> getAllNames() {
        //System.out.println(names);
        return names;

    }

    public List<NameList> getUniqueNames() {
        return new ArrayList<>(sortedNames);
    }

    //Updating method
//    public void updatenames(String id, NameList nameList) {
//        for(NameList l:names){
//            if(l.getId().equals(id)) {
//                l.setName(nameList.getId());
//            }
//        }
//    }
}
