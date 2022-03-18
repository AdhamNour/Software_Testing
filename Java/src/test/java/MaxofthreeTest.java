import static org.junit.Assert.*;
import org.junit.Test;
public class MaxofthreeTest {
    @Test
    public void MO3Test(){
        //
        int tests [] = {0,200,-50,300,150,10,40};

        for (int i =0;i<7;i++){
            for (int j = 0; j < 7; j++) {
                for (int k = 0; k <7; k++) {
                    Maxofthree mx = new Maxofthree();
                    if(tests[i] >= 0 && tests[i] <= 200 && tests[j] >= 0 && tests[j] <= 200 && tests[k] >= 0 && tests[k] <= 200)
                        assertTrue(mx.maxOf3(tests[i], tests[j], tests[k]) == Math.max(Math.max(tests[i],tests[j]),tests[k]));
                    else assertNull(mx.maxOf3(tests[i], tests[j], tests[k]));
                }
            }
        }
    }
}