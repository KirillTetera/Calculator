public class calculatorMain {
    public static void main(String[] args) {
        calculatorData calculator = new calculatorData();
        double res1 = calculator.calculatorSum(5,10);
        double res2 = calculator.calculatorSubtruct(10,20);
        double res3 = calculator.calculatorDevide(30,40);
        double res4 = calculator.calculatorMultiply(50,60);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
    }
}
