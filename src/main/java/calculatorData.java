public class calculatorData {
    int calculatorSum(int a, int b){
        if (a >= 0 && a <10 && b >= 0 && b < 10){
            return a+b;    
        } else if (a >= 10 && a < 20 && b >= 10 && b < 20 && a+b >= 20 && a+b < 30) {
            return 20;
        }
        return 555;
    }
    int calculatorSubtruct(int a, int b){
        if (a >=b && a >= 0 && b >=0){
            return a-b;
        } else if (a >=b && a >= 0 && b < 0) {
            return a;
        }
        return 555;
    }
    int calculatorMultiply(int a, int b){
        if (a < 0 || b < 0){
            return -1;
        } else if (a >= 0 && a < 10 && b >= 0 && b < 10) {
            return a*b;
        }
        return 555;
    }
    int calculatorDevide(int a, int b){
        if (b <= 0){
            return 0;
        } else if (a >= b) {
            return a/b;
        }
        return 555;
    }
}
