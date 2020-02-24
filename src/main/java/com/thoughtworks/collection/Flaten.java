package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
      List<Integer> newList = Arrays.stream(this.array)
                                    .flatMap(x -> Arrays.stream(x))
                                    .collect(Collectors.toList());
      return newList;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
      List<Integer> newList = Arrays.stream(this.array)
                                    .flatMap(x -> Arrays.stream(x))
                                    .distinct()
                                    .collect(Collectors.toList());
      return newList;
    }
}
