package com.javabill0cypher.patterns.strategy;

import java.util.Arrays;

public class BinarySearch implements SearchStrategy{
    @Override
    public int find(int[] elements, int element) {
        return Arrays.binarySearch(elements, element);
    }
}
