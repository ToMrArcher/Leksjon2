package com.eidjord;

public class romanConverter {

    static String toRoman(int i) {
        int remainder = i;
        String romanNumber = "";
        if(remainder / 5 > 0){
            remainder -= remainder / 5;
            romanNumber+="V";
        }
        if(remainder > 3){
            romanNumber += "IV";
        }
        else{
            for (int j = 0; j < remainder; j++) {
                romanNumber += "I";
            }
        }
        return romanNumber;
    }
}
