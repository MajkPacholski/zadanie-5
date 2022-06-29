import com.szkol.CoutingNumbers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoutingNumbersTest {


    @Test
    public void countingTheUserDefinedVariableTestOnlyLastOneVarible() {
        CoutingNumbers number = new CoutingNumbers(5745);
        assertEquals(3,number.countingTheUserDefinedVariable());
        assertEquals(3,number.coutingNumberFromUser());

    }
}
