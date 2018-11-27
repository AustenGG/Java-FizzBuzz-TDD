
import org.junit.Test;

import static org.junit.Assert.*;

public class FIZZBUZZTest {
    @Test
    public void getName() throws Exception {
        FIZZBUZZ test = new FIZZBUZZ();
        test.name("Austen");
        assertEquals("Welcome to fizzbuzz Austen", test.getName());
    }
    @Test
    public void returnNumber() throws Exception {
        FIZZBUZZ test2 = new FIZZBUZZ();
        int result = test2.returnNumber(2);
        assertEquals(2, result);
    }

}
