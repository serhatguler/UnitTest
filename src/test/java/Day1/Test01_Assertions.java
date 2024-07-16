package Day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {

    @Test//Buranin test oldugunu anlar
    public void test(){
        //Main metodu olmadan nasil calisti?
        //Junit icinde gomulu gelen main metodu kullanilir
        //Junit 5 ile beraber metodlar public ile belirtilmesei zorunlulugu yok
        //Genel olarak test isimlendirmelerinde  "test" ile baslar.


    }
    @Test
    public void testLength(){ //String.length()
        String kelime = "Merhaba Dunya"; //13 karekter
        int anlikDeger = kelime.length();
        int beklenenDeger =13;
        assertEquals(beklenenDeger,anlikDeger);

    }





}
