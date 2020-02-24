package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
      List<Integer> newList = this.array.stream()
                                  .map((e) -> e * 3)
                                  .collect(toList());
      return newList;
    }

    public List<String> mapLetter() {
      List<String> newList = new ArrayList<>();
      for (int i = 0; i < this.array.size(); i++) {
        newList.add(letterList.get(i));
      }
      return newList;
    }

    public List<String> mapLetters() {
      List<String> newList = new ArrayList<>();
      String letter = "";
      for (Integer i : this.array) {
        if (i <= 26) {
          letter = letterList.get(i - 1);
        } else {
          String formerLetter = letterList.get((i - 1) / 26 - 1);
          String latterLetter = letterList.get((i - 1 ) % 26);
          letter = formerLetter + latterLetter;
        }
        newList.add(letter);
      }
      return newList;
    }

    public List<Integer> sortFromBig() {
      List<Integer> newList = this.array.stream()
                                  .sorted((e1, e2) -> -Integer.compare(e1, e2))
                                  .collect(toList());
      return newList;
    }

    public List<Integer> sortFromSmall() {
      List<Integer> newList = new ArrayList<>();
      Collections.sort(this.array);
      newList.addAll(this.array);
      return newList;
    }
}
