package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
      List<Integer> newList = new ArrayList<>();
      for (Integer[] integers : this.array) {
        Collections.addAll(newList, integers);
      }
      return newList;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
      List<Integer> newList = new ArrayList<>();
      for (Integer[] integers : this.array) {
        for (Integer integer : integers) {
          if (!newList.contains(integer)) {
            newList.add(integer);
          }
        }
      }
      return newList;
    }
}
