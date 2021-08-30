package com.eidjord;

public class romanConverter {

    static String toRoman(int i) {
        String romanNumber = "";
        for (int j = 0; j < i; j++) {
            romanNumber += "I";
        }
        return romanNumber;
    }
}
