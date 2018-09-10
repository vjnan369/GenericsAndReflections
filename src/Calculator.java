public class Calculator<A extends Number> {
    int add(A a, A b) {
        return a.intValue() + b.intValue();
    }

    int multiply(A a, A b) {
        return a.intValue() * b.intValue();
    }

    int subtract(A a, A b) {
        return a.intValue() - b.intValue();
    }

    double division(A a, A b) {
        return a.doubleValue() / b.doubleValue();
    }
}
