package Day3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C03_ArraysEqualTest {

    @ParameterizedTest
    @MethodSource("arrayArguments")
    void arrayKiyasla(boolean sonuc, Object[] x, Object[] y){
        assertEquals(sonuc, C03_ArraysEqual.arrayKiyasla(x,y));

    }

    static Stream<Arguments> arrayArguments(){
        Integer[] a1 ={1, 2, 3, 4};
        Integer[] a2 ={2, 1, 4, 3};

        return Stream.of(Arguments.of(true,a1,a2));


    }

}
