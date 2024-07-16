package Day1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Test04_BeforeAll_AfterAll {

    @BeforeAll
    static void beforeAll(TestInfo info){
        System.out.println(info.getDisplayName()+" calisti");
    }
    @AfterAll
    static  void afterAll(TestInfo info){
        System.out.println(info.getDisplayName()+ " calisti");
    }

    @Test
    void testArrays(){
        String str = "Unit Test with Junit";
        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"Unit ","Test","with","Junit"};
        assertArrayEquals(beklenenDizi,anlikDizi,"Diziler esit degil");
    }

    @Test
    void testArrays2(){
        String str = "Unit Test with Junit";
        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"Unit ","Test","with","Junit"};
        assertArrayEquals(beklenenDizi,anlikDizi,"Diziler esit degil");
    }



}
