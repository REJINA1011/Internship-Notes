package com.f1soft.Task.UniqueNameFind;

import java.util.Comparator;

public class NameComparator implements Comparator<NameList> {

        @Override
        public int compare(NameList name1, NameList name2) {
            return name1.name().compareTo(name2.name());
        }

}
