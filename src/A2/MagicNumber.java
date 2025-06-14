package A2;

public class MagicNumber {
    public int i = 2;

    MagicNumber() {
        init();
    }

    private void init() {
        i = 42;
    }

    @Override
    public String toString() {
        return String.valueOf(i);
    }
}
