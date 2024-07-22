package Day2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test03_RepeatTestlMultipleTimes {

    // Testi tekrarlatmak istiyorsak?
    // NEden Tekrarlamak isteyelim?
    // dinamik test metodu uretirken degerleri veririz cunku her seferinde farkli degerler gelecek.Random class

    @RepeatedTest(5) //icerisinde kac defa tekarlamak istiyorsak tekrarlariz
    void testSubstring(){
        assertEquals("Java","Java cok guzel".substring(0,4));
        System.out.println("testSubstring() calisti");
    }

    Random rm = new Random();
    @RepeatedTest(5)
    @Disabled//Bu methodu test etmek istemiyorsak klas seviyesinde bu annotation ile durdururuz
    void testMathExact(){
        int sayi1 = rm.nextInt(10);
        int sayi2 = rm.nextInt(10);
        assertEquals(sayi1+sayi2, Math.addExact(sayi1,sayi2));
        System.out.println("sayi1 : "+ sayi1 + " sayi2 : "+ sayi2);
    }

}
