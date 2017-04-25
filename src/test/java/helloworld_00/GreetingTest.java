package helloworld_00;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingTest {
    private static final String GREETING = "Hello";
    private Greeting greeting;

    @Before
    public void setUp() throws Exception {
        greeting = new Greeting(GREETING);
    }

    @Test
    public void getGreeting() throws Exception {
        assertEquals(greeting.getGreeting(), GREETING);
    }
}