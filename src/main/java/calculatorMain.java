public class calculatorMain {
    public static void main(String[] args) {
        calculatorData calculator = new calculatorData();
        int res1 = calculator.calculatorSum(5,5);
        int res2 = calculator.calculatorSubtruct(10,20);
        int res3 = calculator.calculatorDevide(30,40);
        int res4 = calculator.calculatorMultiply(50,60);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
    }
}
