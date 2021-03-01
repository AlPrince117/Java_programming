public class ArrayBound {
    public int[] values = new int[5];

    public void addToArray() {
        for (int i = 0; i < 7; i++) {
            values[i] = i++;
        }
    }

    // public static void main() {
    //     ArrayBound new_main = new ArrayBound();

    //     try {
    //         new_main.addToArray();
    //     } catch (Exception e) {
    //         System.out.println(e);
    //     }
    // }
}
