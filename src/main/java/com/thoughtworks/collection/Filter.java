package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
      List<Integer> newList = this.array
                                  .stream()
                                  .filter((e) -> e % 2 == 0)
                                  .collect(Collectors.toList());
      return newList;
    }

    public List<Integer> filterMultipleOfThree() {
      List<Integer> newList = this.array
                                  .stream()
                                  .filter((e) -> e % 3 == 0)
                                  .collect(Collectors.toList());
      return newList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
      List<Integer> newFirst = new ArrayList<>(firstList);
      List<Integer> newSecond = new ArrayList<>(secondList);
      newFirst.retainAll(newSecond);
      return newFirst;
    }

    public List<Integer> getDifferentElements() {
      List<Integer> newList = this.array.stream().distinct().collect(Collectors.toList());
      return newList;
    }
}