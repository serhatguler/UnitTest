package Day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test00_TestingExceptions {
    //Test ettigimiz kodun bizim bekledigimiz exception firlatma durumunu kontrol ediyoruz.

    @Test
    void testException(){
        String str ="Merhaba JUnit";

        assertThrows(NullPointerException.class , ()->{
            System.out.println("Test exception calisti");
            str.length();
        });
    }


    @Test
    void testExceotion2(){
        int sayi1 = 5;
        int sayi2 = 0;
        //parenti RuntimeException olsa da calisir ama gereksiz olur.
        assertThrows(ArithmeticException.class, ()->{
            System.out.println(sayi1/sayi2);
        });
    }

    @Test
    void testException3(){
        int sayi1 =1;
        int sayi2 =0;
        assertThrows(ArithmeticException.class, ()-> divide(sayi1,sayi2));
    }

    //testException3 de kullanilacak method
    private int divide(int sayi1,int sayi2){
        return sayi1/sayi2;
    }

}
