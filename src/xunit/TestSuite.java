package xunit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSuite {
    List<Test> tests = new ArrayList<>();

    public TestSuite(Class<? extends Test> testClass) {

        /*Arrays.stream(testClass.getMethods())
                .filter(m -> m.getAnnotation(xunit.annotation.Test.class) != null)
                .forEach(m -> {
                    try {
                        add(testClass.getConstructor(String.class).newInstance(m.getName()));
                    } catch (Exception e){
                        throw new RuntimeException(e);
                    }
                });*/
       //  토비님의 방식
       Arrays.stream(testClass.getMethods())
                .filter(method -> method.getName().startsWith("test"))
                .forEach(method -> {
                        try {
                            add(testClass.getConstructor(String.class).newInstance(method.getName()));
                        } catch (Exception e){
                            throw new RuntimeException(e);
                        }
                });
    }

    public TestSuite() {

    }

    public void add(Test wasRun) {
        tests.add(wasRun);
    }

    public void run(TestResult result) {
        tests.forEach( t -> {
            t.run(result);
        });
    }
}
