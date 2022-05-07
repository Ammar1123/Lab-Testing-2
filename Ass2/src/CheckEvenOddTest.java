
import org.junit.Test;

import static org.junit.Assert.*;
public class CheckEvenOddTest {
    @Test
    public void even1(){
        CheckEvenOdd x = new CheckEvenOdd(); int n = 6; assertEquals("Even",x.check(n));
    }
    @Test
    public void even2(){
        CheckEvenOdd x = new CheckEvenOdd(); int n = 16; assertEquals("Even",x.check(n));
    }
    @Test
    public void odd1(){
        CheckEvenOdd x = new CheckEvenOdd(); int n = 3; assertEquals("Odd",x.check(n));
    }
    @Test
    public void odd2(){
        CheckEvenOdd x = new CheckEvenOdd(); int n = 19; assertEquals("Odd",x.check(n));
    }
    @Test
    public void zero(){
        CheckEvenOdd x = new CheckEvenOdd();
        int n = 0;
        assertEquals("Even",x.check(n));
    }
    @Test(expected = IllegalArgumentException.class) public void negative(){
        CheckEvenOdd x = new CheckEvenOdd();
        int n = -8;
        x.check(n);
    }
}
