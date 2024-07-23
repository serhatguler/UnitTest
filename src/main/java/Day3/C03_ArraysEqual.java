package Day3;

import java.util.Arrays;

public class C03_ArraysEqual {

    // 2 Array esit mi ??

    public static boolean arrayKiyasla(Object[] a, Object[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);

    }

}
