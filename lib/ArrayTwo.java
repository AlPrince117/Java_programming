import java.util.Random;
import java.util.Arrays;

public class ArrayTwo {
    public int[] values = new int[5];

    public ArrayTwo() {
        Random random = new Random();
        for (int i = 0; i < values.length; i++) {

            values[i] = random.nextInt(49 - 0) + 0;
            ;
        }
    }

    public void sortByArrayMethod() {
        Arrays.sort(values);
    }
}
