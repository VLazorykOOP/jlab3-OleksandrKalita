public class Ellipse implements IFunction {
    
    public double calculate(double x) {
        // fn = y = a * sqrt(1 - x^2 / b^2)
        double a = 2.0;
        double b = 3.0;
        return a * Math.sqrt(1 - (x * x) / (b * b));
    }
   
    public void printResult(double x) {
        double result = calculate(x);
        System.out.println("Результат: " + result);
    }
}