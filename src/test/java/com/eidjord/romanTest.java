package com.eidjord;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class romanTest {
    @Test
    void shouldConvert1ToI() {
        assertEquals("I", romanConverter.toRoman(1));
    }

}
