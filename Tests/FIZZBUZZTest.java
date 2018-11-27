
import org.junit.Test;

import static org.junit.Assert.*;

public class FIZZBUZZTest {
    @Test
    public void getName() throws Exception {
        FIZZBUZZ test = new FIZZBUZZ("Austen");
        assertEquals("Welcome to fizzbuzz Austen", test.getName());
    }
}
