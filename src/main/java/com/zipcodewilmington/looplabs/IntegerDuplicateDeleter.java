package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
         return Arrays.stream(this.array)
                .filter(element -> getNumberOfOccurrences(element) < maxNumberOfDuplications)
                .collect(Collectors.toList())
                .toArray(new Integer[0]);
    }



    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
         return Arrays.stream(this.array)
                .filter(element -> getNumberOfOccurrences(element) < exactNumberOfDuplications)
                .collect(Collectors.toList())
                .toArray(new Integer[0]);
    }



    public long getNumberOfOccurrences(Integer element) {
        return (Arrays.stream(this.array)
                .filter(num -> num == element)
                .count());
    }
}
