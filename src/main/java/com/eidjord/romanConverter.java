package com.eidjord;

public class romanConverter {

    static String toRoman(int i) {
        String romanNumber = "";
        if(i == 4){
            romanNumber += "IV";
            i -= 4;
        }
        for (int j = 0; j < i; j++) {
            romanNumber += "I";
        }
        return romanNumber;
    }

    public String perfectConvert(int i){
        switch(i){
            case 1000:
                return "M";
            case 500:
                return "D";
            case 100:
                return "C";
            case 50:
                return "L";
            case 10:
                return "X";
            case 5:
                return "V";
            case 1:
                return "I";
            default:
                throw new IllegalArgumentException();
        }
    }
}
