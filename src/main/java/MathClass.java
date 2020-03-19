public class MathClass {

    public int sum(int a, int b){
        return a + b;
    }

    public int max(int a, int b, int c){
        if(a >= b && a >= c){
            return a;
        }

        if(b > c){
            return b;
        }

        return c;
    }
}
