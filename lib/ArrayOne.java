public class ArrayOne {
    public int[] values = new int[5];

    public ArrayOne() {
        for (int i = 0; i < values.length; i++) {
            values[i] = i + 1;
        }
    }

}
