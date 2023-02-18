package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        if (divider != 0) {

            return (list) -> {
               List<Integer> newList = new ArrayList<>();
               for (int i =0; i < list.size(); i++) {
                   newList.add(list.get(i) / divider);
               }
               return newList;
            };

        } else {
            throw new UnsupportedOperationException("You should implement this method.");
        }



    }
}
