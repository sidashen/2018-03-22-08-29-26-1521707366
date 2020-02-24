package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

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
      List<Integer> newList = Arrays.stream(array)
                                    .boxed()
                                    .filter((e) -> e % 2 == 0)
                                    .collect(Collectors.toList());
      return newList;
    }

    public int popLastElment(int[] array) {
      return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
      List<Integer> firstList = Arrays.stream(firstArray)
                                      .boxed()
                                      .collect(Collectors.toList());
      List<Integer> secondList = Arrays.stream(secondArray)
                                       .boxed()
                                       .collect(Collectors.toList());
      firstList.retainAll(secondList);
      return firstList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
      List<Integer> newList = new ArrayList<>();
      newList.addAll(Arrays.asList(firstArray));
      newList.addAll(Arrays.asList(secondArray));
      return newList.stream().distinct().collect(toList());
    }
}
