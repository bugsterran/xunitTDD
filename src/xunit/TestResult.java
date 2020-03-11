package xunit;

public class TestResult {
    int runCount = 0;
    int errorCount = 0;
    public String getSummary() {
        return runCount + " run, " + errorCount + " failed";
    }

    public void testStart(){
        runCount++;
    }

    public void testFailed() {
        errorCount++;
    }
}
