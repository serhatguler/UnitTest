package Day3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class C02_FirstTwoLastCharsSameTest {

    C02_FirstTwoLastCharsSame obj = new C02_FirstTwoLastCharsSame();

    @ParameterizedTest
    @CsvSource(value = {"true, ABAB", "true, BABA", "false, ABCD", "false, A"})
    void check_If_First_Two_Last_Two_Test(boolean rs, String str){
        assertEquals(rs,obj.checkIfFirstTwoLastAreSame(str));
    }

    //@ValueSource ile yazsaydik ne degisirdi???
    //hem asserTrue hem de AssertFalse ile yazmamiz gerekirdi cunku key-value degeri yok
    @ParameterizedTest
    @ValueSource(strings = {"ABAB", "BABA", "ABCD"})
    void  check_If_First_Two_Last_Two_Test2(String str){
        assertTrue(obj.checkIfFirstTwoLastAreSame(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ABAB", "BABA", "ABCD"})
    void  check_If_First_Two_Last_Two_Test3(String str){
        assertFalse(obj.checkIfFirstTwoLastAreSame(str));
    }

}
