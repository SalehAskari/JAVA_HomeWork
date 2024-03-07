import org.junit.Test;
import static org.junit.Assert.*;

public class MyTest {

    @Test
    public void testAdd() {
        BST<Integer> age = new  BST <Integer>();
        age.add(20);
        age.add(13);
        age.add(19);
        assertTrue(age.containts(20));
        assertTrue(age.containts(13));
        assertTrue(age.containts(19));
        assertFalse(age.containts(34));
        assertFalse(age.containts(50));
        assertFalse(age.containts(18));
    }
    @Test
    public void testSize(){
        BST<Integer> age = new  BST <Integer>();
        age.add(20);
        age.add(13);
        age.add(19);

        assertEquals(3 ,age.size());


    }
    @Test
    public void testGetMaxElement() throws IllegalStateException {
        BST<Integer> age = new  BST <Integer>();
        age.add(20);
        age.add(13);
        age.add(19);

        assertEquals(20,(int)age.getMaxElement());

    }
    @Test
    public void testGetMinElement() throws IllegalStateException {
        BST<Integer> age = new  BST <Integer>();
        age.add(20);
        age.add(13);
        age.add(19);

        assertEquals(13 ,(int)age.getMinElement());

    }
}
