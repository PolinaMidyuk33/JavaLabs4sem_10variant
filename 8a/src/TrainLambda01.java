public class TrainLambda01 {
    public static void main(String[] args) {
        MyNumber mn;
        mn=(a,b,c) -> {
            double max=a;
            if (max<b) max=b;
            if (max<c) max=c;
            return max;
        };
        double max = mn.GetValue(5.3, 11, 22.2);
        System.out.println("Max = " + max);
    }
}
