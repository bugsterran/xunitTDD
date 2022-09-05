package xunit;

public class XUnitTest {
    public static void main(String[] args) {
        System.out.println("TestStart");
        TestResult result = new TestResult();
        TestSuite suite = TestCaseTest.suite();
        suite.run(result);
        System.out.println(result.getSummary());
    }
}
