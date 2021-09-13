package com.eidjord;

public class romanConverter {

    static String toRoman(int i) {
        String romanNumber = "";
        while(i >= 1000){
            romanNumber += "M";
            i -= 1000;
        }
        if(i >= 900){
            romanNumber += "CM";
            i -= 900;
        }
        if(i >= 500){
            romanNumber += "D";
            i -= 500;
        }
        if(i >= 400){
            romanNumber += "CD";
            i -= 400;
        }
        while(i >= 100){
            romanNumber += "C";
            i -= 100;
        }
        if (i >= 90){
            romanNumber += "XC";
            i -= 90;
        }
        if(i >= 50){
            romanNumber += "L";
            i -= 50;
        }
        if(i >= 40){
            romanNumber += "XL";
            i -= 40;
        }
        while (i >= 10){
            romanNumber += "X";
            i -= 10;
        }
        if(i == 9){
            romanNumber += "IX";
            i -= 9;
        }
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
