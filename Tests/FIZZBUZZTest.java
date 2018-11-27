
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
        String result = test2.returnNumber(2);
        assertEquals("You have chosen to return 2 results!", result);
    }
    @Test
    public void testItPrintsNumbers() {
        FIZZBUZZ test3 = new FIZZBUZZ();
        test3.returnNumber(10);
        String FBresult = test3.results();
        assertEquals("1 2 Buzz 4 Fizz Buzz 7 8 Buzz Fizz", FBresult);
    }
}
