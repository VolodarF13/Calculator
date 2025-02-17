public class SumCalculator {
    public int sum(int n){
        if(n <= 0){
            throw new IllegalArgumentException("Input should be > 0");
        }
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
            if(result < 0){
                throw new IllegalArgumentException("Input " + n + " too big");
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i < 100000; i++) {
            result = new SumCalculator().sum(i);

            if(result < 0){
                System.out.println(i);
                break;
            }
        }
        System.out.println(result);
    }
}
