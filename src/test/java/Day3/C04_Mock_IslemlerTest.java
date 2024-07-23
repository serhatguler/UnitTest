package Day3;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

//Mock demek birbirene bagimli metodlar var ise ana metodu test ederken icersindeki diger metodlari
//calisiyormus gibi gostermektir.
public class C04_Mock_IslemlerTest {

    @Test
    void islemler() {
        C04_Mock_Islemler dummyObject = Mockito.mock(C04_Mock_Islemler.class);//Fake obje olusturur.

        dummyObject.guncelleOgrenci("Ahmet");
        dummyObject.silOgrenci("Mehmet");
        dummyObject.ekleOgrenci("Serhat");

        //metodlar cagrilmis mi ?
        verify(dummyObject).ekleOgrenci("Serhat");
        verify(dummyObject).guncelleOgrenci("Ahmet");
        verify(dummyObject).silOgrenci("Mehmet");

    }

        //MEtod kac kere Cagrildigini test edelim
        @Test
        void testKacDefaCagrildi() {
            C04_Mock_Islemler dummy2 = Mockito.mock(C04_Mock_Islemler.class);

            dummy2.ekleOgrenci("Serhat");
            dummy2.ekleOgrenci("Serhat");
            //dummy2.ekleOgrenci("Ahmet");

            verify(dummy2, times(2)).ekleOgrenci("Serhat");

            //HAlide ile ekleogrenci() cagrilmama durumu kontrol et
            verify(dummy2, times(0)).ekleOgrenci("Halide");

            //hic cagrilmayan
            verify(dummy2, never()).silOgrenci(anyString());

            //metodun en az 2 defa cagrildigi durumu test edelim
            verify(dummy2, atLeast(2)).ekleOgrenci("Serhat");

        }

        //metodlarin cagrilma sirasini kontrol et

    @Test
    void testSirasi(){
        C04_Mock_Islemler dummy3 = Mockito.mock(C04_Mock_Islemler.class);
        dummy3.ekleOgrenci("Serhat");
        dummy3.ekleOgrenci("Yesim");
        dummy3.silOgrenci("Serhat");

        InOrder inOrder = inOrder(dummy3);
        inOrder.verify(dummy3).ekleOgrenci("Serhat");
        inOrder.verify(dummy3).ekleOgrenci("Yesim");
        inOrder.verify(dummy3).silOgrenci("Serhat");

    }




}