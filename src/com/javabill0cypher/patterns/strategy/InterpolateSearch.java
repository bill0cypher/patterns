package com.javabill0cypher.patterns.strategy;

public class InterpolateSearch implements SearchStrategy{

    @Override
    public int find(int[] elements, int element) {
        int start = 0;
        int last = elements.length - 1;
        while ((start <= last) && (element >= elements[start]) && (element < elements[last])) {
            int curr = start + (((last - start) / ((elements[last] - elements[start]) * (element - elements[start]))));
            if (elements[curr] == element)
                return curr;
            if (elements[curr] < element)
                start = curr + 1;
            else
                last = curr - 1;
        }
        return -1;
    }
}
