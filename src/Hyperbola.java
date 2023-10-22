public class Hyperbola extends Function {
    @Override
    public double calculate(double x) {
        // fn = y = a / x
        double a = 2.0;
        if (x != 0) {
            return a / x;
        } else {
            System.out.println("Ділення на нуль неможливе.");
            return Double.NaN;
        }
    }
    @Override
    public void printResult(double x) {
        double result = calculate(x);
        System.out.println("Результат: " + result);
    }
}