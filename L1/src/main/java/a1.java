import java.util.*;

public class a1 {
    //1. Old version of union method:
    // public static Vector union (Vector a, Vector b){
    //     Vector<Object> unionedV = new Vector<>();
    //     unionedV.addAll(a);
    //     unionedV.addAll(b);
    //     return unionedV;
    // }
    
    //2.Describe as many possible faults (ambiguity) as you can for the above:
    /*
        Possible faults or ambiguities in the union method:

        1. Duplicate elements are allowed in the result, 
        but a true union should remove duplicates.

        2. If either input Vector is null, addAll throws a NullPointerException. 
        Behavior for null inputs is undefined.

        3. If the target Vector is unmodifiable, addAll throws UnsupportedOperationException. (Ambiguity / edge case)

        4. Initialization of the unioned Vector could fail in extreme memory-constrained situations. (Edge case / very low risk)

        5. The method assumes callers always pass two Vector objects. 
        Incorrect usage could cause runtime errors.

        6. Vector<Object> allows mixed types; some callers may expect consistent types. (Ambiguity / design consideration)

        7. The returned Vector preserves the order: elements from 'a' then 'b'. 
        The spec does not define order, which may be undesirable.

        8. Performance may degrade with very large Vectors; all elements are copied sequentially. (Ambiguity / performance consideration)
    */


    //4.
    /* New version handle:
        1. Duplicate remove
        2. Null input treated as empty Vector
       Other wise the same as old version
     */
    public static Vector union (Vector a, Vector b){
        if (a == null) a = new Vector<>();
        if (b == null) b = new Vector<>();
        Vector<Object> unionedV = new Vector<>();
        Set<Object> unionSet = new LinkedHashSet<>(); // Set will handle duplicates and preserve order
        unionSet.addAll(a);
        unionSet.addAll(b);
        unionedV.addAll(unionSet);
        return unionedV;
    }

    public static void main(String[] args) {
        
    }
}