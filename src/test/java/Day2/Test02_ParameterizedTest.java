package Day2;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test02_ParameterizedTest {
    @Test
    void testLength(){

        assertTrue("Mirac".length()>0);
        assertTrue("Serhat".length()>0);
        assertTrue("Seyma".length()>0);
        assertTrue("Beyza".length()>0);
    }

    //daha kullanisli olan parametreli test metodumuzu yazalim
    @ParameterizedTest //yukarida ayni metodu birden fazla kullanmak yerine bu metod daha elverisli
    @ValueSource(strings = {"Mirac","Serhat","Beyza","Seyma"})
    void testLength2(String str){
        assertTrue(str.length()>0);
    }

    //Another Example
    @Test
    void testUpperCase(){
        String str1 = "Merhaba";
        String str2 = "Java";
        String str3 = "Test";
        assertEquals("MERHABA",str1.toUpperCase());
        assertEquals("JAVA",str2.toUpperCase());
        assertEquals("TEST",str3.toUpperCase());
    }

    //coma-seperated yapisi kullanalim
    //key value da CVSSource kullan
    @ParameterizedTest
    @CsvSource(value = {
            "MERHABA", "Merhaba",
            "JAVA", "Java",
            "TEST", "Test"
    })

    void  testUpperCase2(String str1, String str2){
        assertEquals(str1,str2.toUpperCase());

    }

    ///Example3
    /*

    java --> a --> assertTrue
    junit --> u --> assertTrue
    hello --> a --> asserFalse(contains)

     */

    @ParameterizedTest
    @CsvSource(value = {"true, java, a", "true, junit, u", "false, hello, a"})
    void testContains(boolean b1, String s1, String s2){
        assertEquals(b1, s1.contains(s2));
    }


}
