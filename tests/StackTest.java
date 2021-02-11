import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StackTest {
    @Test  
    
    public void testPush() {
        Stack <Integer> stack = new Stack<>();
        List<Integer> testarray = Arrays.asList(1, 2, 3, 4);
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        assertEquals(testarray.get(testarray.size() -1), stack.top());
    }

    @Test

    public void testTop() {
        Stack <Integer> stack = new Stack<>();
        List<Integer> testarray = Arrays.asList(1, 2, 3, 4, 5);
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        assertEquals(testarray.get(testarray.size() -1), stack.top());
    }

    @Test

    public void testPop() {
        Stack <Integer> stack = new Stack<>();
        List<Integer> testarray = Arrays.asList(1, 2, 3, 4);
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();

        assertEquals(testarray.get(testarray.size() -1), stack.top());
    }

    @Test

    public void testSize() {
        Stack <Integer> stack = new Stack<>();
        List<Integer> testarray = Arrays.asList(1, 2, 3, 4, 5);
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        assertEquals(testarray.size(), stack.size());
    }
}
