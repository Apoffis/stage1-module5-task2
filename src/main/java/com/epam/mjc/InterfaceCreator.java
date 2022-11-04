package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {

        Operation<Integer> res = a -> {
            List<Integer> resList = new ArrayList<>();

            for(Integer num : a) {
                resList.add(num / divider);
            }

            return resList;
        };

        return res;

    }
}
