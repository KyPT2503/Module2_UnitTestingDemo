import org.junit.*;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("Case 1-1-2018")
    public void testDay1Month1Year2018() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expectedResult = "2-1-2018";
        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(result, expectedResult);
    }
}