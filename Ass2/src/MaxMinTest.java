import org.junit.Test;

import static org.junit.Assert.*; public class MaxMinTest {
    @Test
    public void test1(){
        MaxMin y = new MaxMin(); int[] x = {1,-2,3,4,44,200,7,8,9};
        assertEquals(-2,y.Min(x)); assertEquals(200, y.Max(x));
    }
    @Test
    public void test2(){
        MaxMin y = new MaxMin(); int[] x = {1,2,3,9,111,7,8,392};
        assertEquals(1,y.Min(x)); assertEquals(392, y.Max(x));
    }
    @Test
    public void test3(){
        MaxMin y = new MaxMin();
        int[] x = {4,5}; assertEquals(4,y.Min(x)); assertEquals(5, y.Max(x));
    }
    @Test
    public void test4(){
        MaxMin y = new MaxMin(); int[] x = {5}; assertEquals(5,y.Min(x)); assertEquals(5, y.Max(x));
    }
    @Test
    public void test5(){
        MaxMin y = new MaxMin(); int[] x = {65, 20, 1, 71, 88, 0, 300, -9};
        assertEquals(-9,y.Min(x)); assertEquals(300, y.Max(x));
    }
}
