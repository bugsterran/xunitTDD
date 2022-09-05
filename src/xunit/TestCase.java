package xunit;

import java.lang.reflect.Method;

/**
 *  TEST CASE 템플릿 클래스!
 */
public class TestCase implements Test{

    private final String name;

    public TestCase(String name) {
        this.name = name;
    }

    public void run(TestResult result) {
        result.testStart();
        setUp();
        try {
            Method method =  getClass().getMethod(name);
            method.invoke(this);
        } catch (Exception e) {
            result.testFailed();
        }
        tearDown();
    }

    public void setUp() {
    };

    public void tearDown() {
    };

}
