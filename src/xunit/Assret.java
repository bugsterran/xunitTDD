package xunit;

public class Assret {
    public static void assertEquals(Object expected, Object actual) {
        if(!expected.equals(actual)){
            throw new AssertionError("expected <" + expected + "> but was <" + actual + ">");
        }
    }
}
