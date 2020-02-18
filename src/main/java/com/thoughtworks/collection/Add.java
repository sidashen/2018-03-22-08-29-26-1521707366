package com.thoughtworks.collection;

import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
      int sum = 0;
      int startNum = leftBorder;
      int endNum = rightBorder;
      if (leftBorder > rightBorder) {
        startNum = rightBorder;
        endNum = leftBorder;
      }

      for (int i = startNum; i <= endNum; i++) {
        if (i % 2 == 0) {
          sum += i;
        }
      }
      return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
      int sum = 0;
      int startNum = leftBorder;
      int endNum = rightBorder;
      if (leftBorder > rightBorder) {
        startNum = rightBorder;
        endNum = leftBorder;
      }

      for (int i = startNum; i <= endNum; i++) {
        if (i % 2 != 0) {
          sum += i;
        }
      }
      return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
      List<Integer> newList = new ArrayList<>();
      for (Integer integer : arrayList) {
        int num = integer * 3 + 2;
        newList.add(num);
      }

      int sum = 0;
      for (Integer i : newList) {
        sum += i;
      }
      return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
      List<Integer> newList = new ArrayList<>();
      for (Integer integer : arrayList) {
        int num = integer;
        if (integer % 2 != 0) {
          num = integer * 3 + 2;
        }
        newList.add(num);
      }
      return newList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
      List<Integer> newList = new ArrayList<>();
      for (Integer integer : arrayList) {
        if (integer % 2 != 0) {
          int num = integer * 3 + 5;
          newList.add(num);
        }
      }

      int sum = 0;
      for (Integer i : newList) {
        sum += i;
      }
      return sum;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
      List<Integer> newList = new ArrayList<>();
      for (Integer integer : arrayList) {
        if (integer % 2 == 0) {
          newList.add(integer);
        }
      }

      double medianNum;
      if (newList.size() % 2 == 0) {
        double sum = 0;
        for (Integer i : newList) {
          sum += i;
        }
        medianNum = sum / newList.size();
      } else {
        medianNum = newList.get((newList.size() - 1) / 2);
      }
      return medianNum;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
      List<Integer> newList = new ArrayList<>();
      for (Integer integer : arrayList) {
        if (integer % 2 == 0) {
          newList.add(integer);
        }
      }

      double sum = 0;
      for (Integer i : newList) {
        sum += i;
      }
      return sum / newList.size();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
      List<Integer> newList = new ArrayList<>();
      for (Integer integer : arrayList) {
        if (integer % 2 == 0) {
          newList.add(integer);
        }
      }

      return newList.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
      List<Integer> newList = new ArrayList<>();
      for (Integer integer : arrayList) {
        if (integer % 2 == 0 && ! newList.contains(integer)) {
          newList.add(integer);
        }
      }
      return newList;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
      List<Integer> evenList = new ArrayList<>();
      List<Integer> oddList = new ArrayList<>();
      List<Integer> newList = new ArrayList<>();
      for (Integer integer : arrayList) {
        if (integer % 2 == 0) {
          evenList.add(integer);
        } else {
          oddList.add(integer);
        }
      }

      Collections.sort(evenList);
      oddList.sort(Comparator.reverseOrder());
      newList.addAll(evenList);
      newList.addAll(oddList);
      return newList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
      List<Integer> newList = new ArrayList<>();
      for (int i = 0; i < arrayList.size() - 1; i++) {
        int num = (arrayList.get(i) + arrayList.get(i + 1)) * 3;
        newList.add(num);
      }
      return newList;
    }
}
