package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
      List<Integer> newList = new ArrayList<>();
      if (left > right) {
        for (int i = left; i >= right; i--) {
          newList.add(i);
        }
      } else {
        for (int i = left; i <= right; i++) {
          newList.add(i);
        }
      }
      return newList;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
      List<Integer> newList = new ArrayList<>();
      if (left > right) {
        for (int i = left; i >= right; i--) {
          if ((i % 2) == 0) {
            newList.add(i);
          }
        }
      } else {
        for (int i = left; i <= right; i++) {
          if ((i % 2) == 0) {
            newList.add(i);
          }
        }
      }
      return newList;
    }

    public List<Integer> popEvenElments(int[] array) {
      List<Integer> newList = new ArrayList<>();
      for (int i : array) {
        if ((i % 2) == 0) {
          newList.add(i);
        }
      }
      return newList;
    }

    public int popLastElment(int[] array) {
      return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
      List<Integer> newList = new ArrayList<>();
      for (int i : firstArray) {
        for (int j : secondArray) {
          if (i == j) {
            newList.add(i);
          }
        }
      }
      return newList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
      List<Integer> newList = new ArrayList<>();
      newList.addAll(Arrays.asList(firstArray));
        for (int j : secondArray) {
          if (! newList.contains(j)) {
            newList.add(j);
          }
        }
      return newList;
    }
}
