public class MyRange2 {

    private final String input;

    public MyRange2(String input) {
        this.input = input;
    }

    public boolean startWithKeep() {
        return this.input.startsWith("[");
    }
}
