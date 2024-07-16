package Day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test02_Assertions2 {

    @Test
    public void testToFindMin(){//Math.min
        assertEquals(14,Math.min(14,17));
        //assertTrue(11.5==Math.min(11.5,14.4));
    }


}
