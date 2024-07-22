package Day2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test01_DisplayName {

    @Test
    @DisplayName("Test parseint() numeric olmayan argumanlar gonderildiginde firlatilan exception")
    void testException(){

        String str = "123";
        assertThrows(NumberFormatException.class, ()->{
            Integer.parseInt(str);
        });

    }
}
