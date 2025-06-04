package com.swarna.code.util;

public class HardCopyUtil {
    public char[][] copy2dArray(char[][] originalArray){
        char[][] copiedArray = new char[originalArray.length][originalArray[0].length];
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = 0; j < originalArray[0].length; j++) {
                copiedArray[i][j] = originalArray[i][j];
            }
        }
        return copiedArray;
    }
}
