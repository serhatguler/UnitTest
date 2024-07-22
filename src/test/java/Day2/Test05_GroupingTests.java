package Day2;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test05_GroupingTests {

    //Amacimiz : Ayni sinifta Birbirileri ile ilsikili testleri gruplamak icin kullanilir.

    @Nested
    class testMultiply{
        @ParameterizedTest
        @CsvSource(value = {"-12, -4,3", "-12, 4,-3", "12, -4,-3"}) //ilk deger expected deger
        void testMultiplyWithNoneZero(int rs, int num1, int num2){
            assertEquals(rs, Math.multiplyExact(num1,num2));
        }

        @ParameterizedTest
        @CsvSource(value = {"0, -4,0", "0, 4,0", "0, -4,0"})
        void testMultiplyWithZero(int rs, int num1, int num2){
            assertEquals(rs, Math.multiplyExact(num1,num2));
        }
    }//Birinci Grup testin sonu

    @Nested
    class testAdd {

        @ParameterizedTest
        @CsvSource(value = {"-1, -4,3", "1, 4,-3", "-7, -4,-3"})
            //ilk deger expected deger
        void testAddWithNoneZero(int rs, int num1, int num2) {
            assertEquals(rs, Math.addExact(num1, num2));
        }

        @ParameterizedTest
        @CsvSource(value = {"-4, -4,0", "4, 4,0", "-3, -3,0"})
        void testAddWithZero(int rs, int num1, int num2) {
            assertEquals(rs, Math.addExact(num1, num2));

        }
    }//2.grub test sonucu

}
