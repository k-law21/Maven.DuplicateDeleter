package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    public long getNumberOfOccurrences(String element) {
        return (Arrays.stream(this.array)
                .filter(word -> word.equals(element))
                .count());
    }

    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(this.array)
                .filter(element -> getNumberOfOccurrences(element) < maxNumberOfDuplications)
                .collect(Collectors.toList())
                .toArray(new String[0]);
    }

    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(this.array)
                .filter(element -> getNumberOfOccurrences(element) != exactNumberOfDuplications)
                .collect(Collectors.toList())
                .toArray(new String[0]);
    }
}
