package com.thoughtworks.collection;

import javax.xml.soap.Node;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
      return this.arrayList.stream().max(Integer::compare).get();
    }

    public double getMinimum() {
      return this.arrayList.stream().min(Integer::compare).get();
    }

    public double getAverage() {
      double sum = this.arrayList.stream().reduce(0, Integer::sum);
      return sum / this.arrayList.size();
    }

    public double getOrderedMedian() {
      double medianNum = 0;
      if (this.arrayList.size() % 2 == 0) {
        double sum = this.arrayList.get((this.arrayList.size() / 2) - 1)
           + this.arrayList.get((this.arrayList.size() / 2));
        medianNum = sum / 2;
      } else {
         medianNum = this.arrayList.get((this.arrayList.size() - 1) / 2);
      }
      return medianNum;
    }

    public int getFirstEven() {
      return this.arrayList.stream()
                           .filter((e) -> e % 2 == 0)
                           .findFirst()
                           .get();
    }

    public int getIndexOfFirstEven() {
      int index = 0;
      for (int i = 0; i < this.arrayList.size(); i++) {
        if (this.arrayList.get(i) % 2 == 0) {
          index = i;
          break;
        }
      }
      return index;
    }

    public boolean isEqual(List<Integer> arrayList) {
      if (arrayList.equals(this.arrayList)) {
        return true;
      } else {
        return false;
      }
    }

    public int getLastOdd() {
      List<Integer> newList = this.arrayList.stream()
                                  .filter((e) -> e % 2 != 0)
                                  .collect(Collectors.toList());
      return newList.get(newList.size() - 1);
    }

    public int getIndexOfLastOdd() {
      int index = 0;
      for (int i = 0; i < this.arrayList.size(); i++) {
        if (i % 2 != 0) {
          index = i;
        }
      }
      return index;
    }
}
