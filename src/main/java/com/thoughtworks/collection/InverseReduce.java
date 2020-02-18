package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
      List<Integer> newList = new ArrayList<>();
      int intervalNum = this.random.nextInt(3);
      for (int i = number; i - intervalNum >= 0; i -= intervalNum) {
        newList.add(i - intervalNum);
      }
      return newList;
    }
}
