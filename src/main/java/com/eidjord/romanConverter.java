package com.eidjord;

public class romanConverter {

    static String toRoman(int i) {
        String romanNumber = "";
        if(i >= 5){
            romanNumber += "V";
            i -= 5;
        }
        if(i == 4){
            romanNumber += "IV";
            i -= 4;
        }
        for (int j = 0; j < i; j++) {
            romanNumber += "I";
        }
        return romanNumber;
    }
}
