package fitnesse.testsystems.slim.tables;


import fitnesse.testsystems.TestResult;
import fitnesse.testsystems.slim.results.SlimExceptionResult;

public interface Expectation {

  Expectation NOOP_EXPECTATION = new Expectation() {
    @Override public TestResult evaluateExpectation(Object returnValues) { return null; }
    @Override public SlimExceptionResult evaluateException(SlimExceptionResult exceptionResult) { return null; }
  };

  TestResult evaluateExpectation(Object returnValues);

  SlimExceptionResult evaluateException(SlimExceptionResult exceptionResult);
}