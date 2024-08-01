package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] removed = new String[0];
        for (String element : this.array) {
            if (getNumberOfOccurrences(element) < maxNumberOfDuplications) {
                int index = removed.length;
                removed = Arrays.copyOf(removed, index+1);
                removed[index] = element;
            }
        }
        return removed;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] removed = new String[0];
        for (String element : this.array) {
            if (getNumberOfOccurrences(element) != exactNumberOfDuplications) {
                int index = removed.length;
                removed = Arrays.copyOf(removed, index+1);
                removed[index] = element;
            }
        }
        return removed;

    }

    public Integer getNumberOfOccurrences(String valueToEvaluate) {
        int counter = 0;
        for (String element : array){
            if (element.matches(valueToEvaluate)){
                counter++;
            }
        }
        return counter;
    }
}
