package com.thoughtworks.collection;

import javax.xml.soap.Node;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
      int maxNum = 0;
      for (Integer i : this.arrayList) {
        if (i > maxNum) {
          maxNum = i;
        }
      }
      return maxNum;
    }

    public double getMinimum() {
      int minNum = this.arrayList.get(0);
      for (Integer i : this.arrayList) {
        if (minNum > i) {
          minNum = i;
        }
      }
      return minNum;
    }

    public double getAverage() {
      double averageNum = 0;
      double sum = 0;
      for (Integer i : this.arrayList) {
        sum += i;
      }
      averageNum = sum / this.arrayList.size();
      return averageNum;
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
      int firstEven = 0;
      for (Integer i : this.arrayList) {
        if (i % 2 == 0) {
          firstEven = i;
          break;
        }
      }
      return firstEven;
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
      int lastOdd = 0;
      for (Integer i : this.arrayList) {
        if (i % 2 != 0) {
          lastOdd = i;
        }
      }
      return lastOdd;
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
