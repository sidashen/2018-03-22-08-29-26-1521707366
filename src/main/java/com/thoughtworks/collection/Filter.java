package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
      List<Integer> newList = new ArrayList<>();
      for (Integer i : this.array) {
        if (i % 2 == 0) {
          newList.add(i);
        }
      }
      return newList;
    }

    public List<Integer> filterMultipleOfThree() {
      List<Integer> newList = new ArrayList<>();
      for (Integer i : this.array) {
        if (i % 3 == 0) {
          newList.add(i);
        }
      }
      return newList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
      List<Integer> newList = new ArrayList<>();
      for (Integer i : firstList) {
        for (Integer j : secondList) {
          if (i == j) {
            newList.add(i);
          }
        }
      }
      return newList;
    }

    public List<Integer> getDifferentElements() {
      List<Integer> newList = new ArrayList<>();
      for (Integer integer : this.array) {
        if (!newList.contains(integer)) {
          newList.add(integer);
        }
      }
      return newList;
    }
}