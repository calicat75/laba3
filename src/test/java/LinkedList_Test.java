import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class LinkedList_Test {
    private List<Integer> linkedList;

    @Before
    public void setUp() throws Exception {
        linkedList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            linkedList.add(i);
        }
    }

    @Test
    public void whenAdded100ElementsThenSizeMustBe100() {
        assertEquals(100, linkedList.size());
    }

    @Test
    public void whenElementRemovedByIndexThenSizeMustBeDecreased() {
        assertTrue(linkedList.remove(5) != null);
        assertEquals(99, linkedList.size());
    }

    @Test
    public void whenElementRemovedThenSizeMustBeDecreased() {
        linkedList.add(102);
        assertEquals(101, linkedList.size());
        assertTrue(linkedList.remove(Integer.valueOf(102)));
        assertEquals(100, linkedList.size());
    }

    @Test
    public void whenListClearedThenSizeMustBe0() {
        linkedList.clear();
        assertEquals(0, linkedList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIndexOutOfBoundsThenThrownException() {
        linkedList.get(100);
    }

    @Test
    public void methodGetReturnedRightValue() {
        int i = linkedList.get(0);
        assertEquals(0, i);
    }

    @Test
    public void insertIntoMiddle() {
        linkedList.add(50, 66);
        assertEquals(66, linkedList.get(50).intValue());
    }

    @Test
    public void insertIntoFirstPosition() {
        linkedList.add(0, 0);
        assertEquals(0, linkedList.get(0).intValue());
    }

    @Test
    public void insertIntoLastPosition() {
        linkedList.add(100, 100);
        assertEquals(100, linkedList.get(100).intValue());
    }
}
