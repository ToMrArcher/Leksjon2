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

}
