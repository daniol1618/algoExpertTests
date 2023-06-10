package com.example.validate_subsequence.logic;

import java.util.ArrayList;

public class Subsequence {

    public boolean isSubSequence() {
        int ArrayA[] = {5, 1, 22, 25, 6, -1, 8, 10};
        int ArrayS[] = {1, 6, -1, 10};

        ArrayList<Integer> tempArray = new ArrayList<>();

        for (int i = 0; i < ArrayA.length; i++) {
            for (int j = 0; j < ArrayS.length; j++) {
                if (ArrayA[i] == ArrayS[j]) {
                    tempArray.add(ArrayA[i]);
                } else {
                    //do nothing
                }
            }
        }
        System.out.println(tempArray);

        if (tempArray.size() == 0) {
            return false;
        } else {
            for (int i = 0; i < tempArray.size(); i++) {
                for (int j = 0; j < ArrayS.length; j++) {
                    if (tempArray.get(i) == ArrayS[j]) {
                        //do nothing
                        i++;
                    } else {
                        System.out.println("Hay un valor incorrecto" + tempArray.get(i));
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
