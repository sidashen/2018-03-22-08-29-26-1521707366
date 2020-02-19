package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
      List<Integer> newList = new ArrayList<>();
      for (int i = 0; i < this.array.length; i++) {
        for (int j = 0; j < this.array[i].length; j++) {
          newList.add(this.array[i][j]);
        }
      }
      return newList;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
      List<Integer> newList = new ArrayList<>();
      for (int i = 0; i < this.array.length; i++) {
        for (int j = 0; j < this.array[i].length; j++) {
          if (!newList.contains(this.array[i][j])) {
            newList.add(this.array[i][j]);
          }
        }
      }
      return newList;
    }
}
