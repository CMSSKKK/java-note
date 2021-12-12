package item6;

public class AutoBoxing {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //Long sum = 0l;
        long sum1 = 0l;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            //sum += i;
            sum1 += i;
        }

        System.out.println(System.currentTimeMillis() - start);

    }
}
