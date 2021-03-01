
class Main {
    public static void main(String[] args) {
        ArrayBound new_main = new ArrayBound();

        try {
            new_main.addToArray();
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        }
    }
}