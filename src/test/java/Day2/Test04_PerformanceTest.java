package Day2;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test04_PerformanceTest {


    @Test
    void testPrintPerformance(){

        //ilk deger sureyi belirle , ikinci kisimda test edilecek kisim lambda exp ile set et
        assertTimeout(Duration.ofSeconds(3),
                ()-> IntStream.rangeClosed(1, 1000000).forEach(System.out::println));
    }

    @Test
    void testPerformance(){
        assertTimeout(Duration.ofSeconds(1),
                ()-> IntStream.rangeClosed(1, 50000).reduce((x,y)->Math.addExact(x,y)));
    }

}
