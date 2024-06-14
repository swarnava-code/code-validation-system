package com.swarna.code.expectedImpl;

import com.swarna.code.abstraction.AlgoProcess;
import java.util.ArrayList;

public class SummationOfOdd extends AlgoProcess<ArrayList<Integer>, Integer> {

    @Override
    public Integer executeOverrides(ArrayList<Integer> arrayList) {
        return arrayList.stream().filter(integer -> integer % 2 != 0).mapToInt(Integer::intValue).sum();
    }
}
