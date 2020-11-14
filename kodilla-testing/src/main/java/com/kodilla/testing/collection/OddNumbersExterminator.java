package com.kodilla.testing.collection;
import java.util.List;

class OddNumbersExterminator {

    List<Integer> number;
    List<Integer> oddNumber;


    OddNumbersExterminator(List<Integer> number, List<Integer> oddNumber) {
        this.number = number;
        this.oddNumber = oddNumber;

    }

    public List<Integer> exterminate(List<Integer> number) {
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) % 2 != 0) {
                oddNumber.add(number.get(i));
            }
        }
        return oddNumber;
    }
}
