package lab7;

import org.junit.Assert;
import org.junit.Test;

public class MySetTest {
    @Test
    public void sizeTest() {
        MySet mySet = new MySet();
        Assert.assertEquals(0, mySet.size());
        mySet.add(new Object());
        Assert.assertTrue(mySet.isEmpty());
        mySet.clear();
    }
}
