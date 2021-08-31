package com.eidjord;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class romanTest {
    @Test
    void shouldConvert1ToI() {
        assertEquals("I", romanConverter.toRoman(1));
    }

    @Test
    void shouldConvert2ToII(){
        assertEquals("II", romanConverter.toRoman(2));
    }

    @Test
    void shouldConvert3ToIII(){
        assertEquals("III", romanConverter.toRoman(3));
    }

    @Test
    void shouldConvert4ToIV() {
        assertEquals("IV", romanConverter.toRoman(4));
    }

    @Test
    void shouldConvert5ToV(){
        assertEquals("V", romanConverter.toRoman(5));
    }

    @Test
    void shouldConvert6ToVI(){
        assertEquals("VI", romanConverter.toRoman(6));
    }

    @Test
    void shouldConvert8ToVII(){
        assertEquals("VIII", romanConverter.toRoman(8));
    }

    @Test
    void shouldConvert9ToIX(){
        assertEquals("IX", romanConverter.toRoman(9));
    }

    @Test
    void shouldConvert10ToX(){
        assertEquals("X", romanConverter.toRoman(10));
    }

    @Test
    void shouldConvert11ToXI(){
        assertEquals("XI", romanConverter.toRoman(11));
    }

    @Test
    void shouldConvert24ToXXIV(){
        assertEquals("XXIV", romanConverter.toRoman(24));
    }

    @Test
    void shouldConvert40ToXL(){
        assertEquals("XL", romanConverter.toRoman(40));
    }

    @Test
    void shouldConvert55ToLV(){
        assertEquals("LV", romanConverter.toRoman(55));
    }
    @Test
    void shouldConvert60ToLX(){
        assertEquals("LX", romanConverter.toRoman(60));
    }

    @Test
    void shouldConvert69ToLXIX(){
        assertEquals("LXIX", romanConverter.toRoman(69));
    }

    @Test
    void shouldConvert90ToXC(){
        assertEquals("XC", romanConverter.toRoman(90));
    }

    @Test
    void shouldConvert100ToC(){
        assertEquals("C", romanConverter.toRoman(100));
    }

    @Test
    void shouldConvert220ToCCXX(){
        assertEquals("CCXX", romanConverter.toRoman(220));
    }
}
