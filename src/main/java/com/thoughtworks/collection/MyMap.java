package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
      List<Integer> newList = new ArrayList<>();
      for (Integer i : this.array) {
        newList.add(i * 3);
      }
      return newList;
    }

    public List<String> mapLetter() {
      List<String> newList = new ArrayList<>();
      for (Integer i : this.array) {
        char letter = (char) (i + 96);
        newList.add(String.valueOf(letter));
      }
      return newList;
    }

    public List<String> mapLetters() {
      List<String> newList = new ArrayList<>();
      String letter = "";
      for (Integer i : this.array) {
        if (i <= 26) {
          letter = String.valueOf((char) (i + 96));
        } else {
          String formerLetter = String.valueOf((char) (Math.floor((i - 1) / 26) + 96));
          String latterLetter = String.valueOf((char) ((i - 1 ) % 26 + 1 + 96));
          letter = formerLetter + latterLetter;
        }
        newList.add(letter);
      }
      return newList;
    }

    public List<Integer> sortFromBig() {
      List<Integer> newList = new ArrayList<>();
      Collections.sort(this.array, Comparator.reverseOrder());
      newList.addAll(this.array);
      return newList;
    }

    public List<Integer> sortFromSmall() {
      List<Integer> newList = new ArrayList<>();
      Collections.sort(this.array);
      newList.addAll(this.array);
      return newList;
    }
}
