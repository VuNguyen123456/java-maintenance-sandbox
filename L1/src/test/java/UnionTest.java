import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Vector;


public class UnionTest {
    /*
        Checks that the union method handles duplicates correctly. 
        Since '2' is in both input Vectors, we want to verify if the method preserves unique values or incorrectly duplicates them. 
        Also confirms that the original order of elements is preserved.
     */
    @Test
    public void testA1UnionWithDup() {
        Vector<Object> a = new Vector<>();
        a.add(1);
        a.add(2);

        Vector<Object> b = new Vector<>();
        b.add(2);
        b.add(4);

        Vector<Object> res = a1.union(a, b);

        assertEquals(3, res.size()); // Should be 3 because no duplicates allowed
        // Check content: original order preserved
        assertEquals(1, res.get(0));
        assertEquals(2, res.get(1));
        assertEquals(4, res.get(2));
    }

    /*
        Tests the method's behavior when one input Vector is empty. 
        Ensures that the union returns all elements from the non-empty Vector and does not fail. 
        Helps detect edge cases with empty input.
     */
    @Test
    public void testUnionWithEmptyVector() {
        Vector<Object> a = new Vector<>();
        a.add(1);
        a.add(2);

        Vector<Object> b = new Vector<>();

        Vector<Object> res = a1.union(a, b);

        assertEquals(2, res.size());
        assertEquals(1, res.get(0));
        assertEquals(2, res.get(1));
    }

    /*
        Tests the method's behavior when both input Vector is empty. 
        Verifies that the method does not throw an exception and returns an empty Vector.
        Helps detect edge cases with 2 empty input.
     */
    @Test
    public void testEmptyVectors() {
        Vector<Object> a = new Vector<>();
        Vector<Object> b = new Vector<>();

        Vector<Object> res = a1.union(a, b);

        assertEquals(0, res.size(), "Union of two empty vectors should be empty");
    }



    /*
        Tests how the method behaves when one input Vector is null. 
        This scenario should throw a NullPointerException because addAll cannot accept null. 
     */
    @Test
    public void testNullVector() {
        Vector<Object> a = null;

        Vector<Object> b = new Vector<>();
        b.add(1);

        assertThrows(NullPointerException.class, () -> {
            a1.union(a, b);
        }, "Union should throw NullPointerException if a vector is null");
    }

    /*
        Verifies that the union method can handle Vectors containing mixed object types. 
        Ensures that type safety is not enforced incorrectly and that elements retain their values. 
        Helps detect issues if the method is expected to handle only a single type.
     */
    @Test
    public void testMixedTypes() {
        Vector<Object> a = new Vector<>();
        a.add(1);
        a.add("two");

        Vector<Object> b = new Vector<>();
        b.add(3.0);

        Vector<Object> res = a1.union(a, b);

        assertEquals(3, res.size(), "Union should accept mixed types");
        assertEquals(1, res.get(0));
        assertEquals("two", res.get(1));
        assertEquals(3.0, res.get(2));
    }

    /*
        Checks performance and correctness when handling very large Vectors. 
        Ensures that union does not fail or throw memory errors under heavy load. 
        Help detect that the method scales correctly and that all elements are included.
     */

    @Test
    public void testLargeVectorPerformance() {
        Vector<Object> a = new Vector<>();
        Vector<Object> b = new Vector<>();
        
        for (int i = 0; i < 1_000_000; i++) {
            a.add(i);
            b.add(i + 500_000);  // overlapping half
        }

        Vector<Object> res = a1.union(a, b);

        assertEquals(1_500_000, res.size(), "Union of large vectors should work correctly");
    }

}
