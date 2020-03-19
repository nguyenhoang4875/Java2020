public class Exercise01 {

    public int findGCD(int a, int b){
        while (a * b > 0){
            if(a > b){
                a %= b;
            }else{
                b %= a;
            }
        }

        return a + b;
    }

    public int findLCM(int a, int b){
        return a * b / findGCD(a, b);
    }

}
