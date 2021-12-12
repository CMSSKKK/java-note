package item6;

public class example {

    public static void main(String[] args) {
        String s = new String("bikini");
        String s1 = new String("bikini");

        String s2 = "bikini";
        String s3 = "bikini";

        boolean b = new Boolean("true");
        boolean b1 = Boolean.valueOf("true");

        System.out.println(s == s1);
        System.out.println(s2 == s3);


    }

}
