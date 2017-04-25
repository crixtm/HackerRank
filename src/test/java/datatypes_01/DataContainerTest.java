package datatypes_01;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataContainerTest {
    @Test
    public void toStringTest() throws Exception {
        final String EXPECTED_STRING = "1, 1.0, I know kung-fu!";
        DataContainer dataContainer = new DataContainer(1, 1.0, "I know kung-fu!");
        assertEquals(dataContainer.toString(), EXPECTED_STRING);
    }

    @Test
    public void addDC() throws Exception {
        final int INT_RESULT = 2;
        final double DOUBLE_RESULT = 4.2;
        final String STRING_RESULT = "testtest";
        DataContainer dataContainer1 = new DataContainer(1, 2.1, "test");
        assertEquals(dataContainer1.addDC(dataContainer1).getI(), INT_RESULT);
        assertEquals(dataContainer1.addDC(dataContainer1).getD(), DOUBLE_RESULT, 0.001);
        assertEquals(dataContainer1.addDC(dataContainer1).getS(), STRING_RESULT);

    }


}