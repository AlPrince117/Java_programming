import java.util.ArrayList;
import java.util.List;


public class Stack<T> {
    public List<T> stack = new ArrayList<T>();

    public void push(T item) {
        stack.add(item);
    }

    public T top() {
       return stack.get(stack.size() - 1);
    }

    public void pop() {
        stack.remove(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }
}
