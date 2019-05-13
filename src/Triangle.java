public class Triangle {
    int sideA;
    int sideB;
    int sideC;

    Triangle(int a, int b, int c ) {
        sideA = a;
        sideB = b;
        sideC = c;
    }
    boolean calc(){
        boolean result = (sideA*sideA)+(sideB*sideB)==(sideC*sideC);
        return result;

    }

}
